package se.lexicon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 tests for the NameRepository class.
 */
public class NameRepositoryTest {

    /**
     * Setup method executed before each test to initialize the NameRepository with known data.
     */
    @BeforeEach
    public void setUp() {
        NameRepository.clear();
        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan"});
    }

    /**
     * Test for getSize method.
     * Checks that getSize returns the correct number of elements in the names array.
     */
    @Test
    public void testGetSize() {
        int size = NameRepository.getSize();
        assertEquals(2, size);
    }

    /**
     * Test for setNames method.
     * Verifies that setNames correctly sets the names array to the provided array of names.
     */
    @Test
    public void testSetNames() {
        NameRepository.setNames(new String[]{"Alice Wonderland", "Bob Builder"});
        String[] names = NameRepository.findAll();
        assertArrayEquals(new String[]{"Alice Wonderland", "Bob Builder"}, names);
    }

    /**
     * Test for clear method.
     * Ensures that clear empties the names array.
     */
    @Test
    public void testClear() {
        NameRepository.clear();
        assertEquals(0, NameRepository.getSize());
    }

    /**
     * Test for findAll method.
     * Checks that findAll returns a new array containing all names in the names array.
     */
    @Test
    public void testFindAll() {
        String[] names = NameRepository.findAll();
        assertArrayEquals(new String[]{"Erik Svensson", "Mehrdad Javan"}, names);
    }

    /**
     * Test for find method.
     * Verifies that find returns the correct name if found, or null if not found.
     */
    @Test
    public void testFind() {
        String name = NameRepository.find("Mehrdad Javan");
        assertEquals("Mehrdad Javan", name);
        assertNull(NameRepository.find("Non Existent"));
    }

    /**
     * Test for add method.
     * Checks that add adds a new name to the names array and returns true, or returns false if the name already exists.
     */
    @Test
    public void testAdd() {
        boolean added = NameRepository.add("New Person");
        assertTrue(added);
        assertEquals(3, NameRepository.getSize());
        assertFalse(NameRepository.add("Mehrdad Javan")); // Already exists
    }

    /**
     * Test for findByFirstName method.
     * Verifies that findByFirstName returns an array containing all names matching the given first name.
     */
    @Test
    public void testFindByFirstName() {
        String[] result = NameRepository.findByFirstName("Mehrdad");
        assertArrayEquals(new String[]{"Mehrdad Javan"}, result);
        String[] emptyResult = NameRepository.findByFirstName("Non Existent");
        assertArrayEquals(new String[]{}, emptyResult);
    }

    /**
     * Test for findByLastName method.
     * Checks that findByLastName returns an array containing all names matching the given last name.
     */
    @Test
    public void testFindByLastName() {
        String[] result = NameRepository.findByLastName("Javan");
        assertArrayEquals(new String[]{"Mehrdad Javan"}, result);
        String[] emptyResult = NameRepository.findByLastName("Non Existent");
        assertArrayEquals(new String[]{}, emptyResult);
    }

    /**
     * Test for update method.
     * Verifies that update updates a name in the names array and returns true if successful, or returns false in case of failure.
     */
    @Test
    public void testUpdate() {
        boolean updated = NameRepository.update("Erik Svensson", "Erik Johnson");
        assertTrue(updated);
        assertEquals("Erik Johnson", NameRepository.find("Erik Johnson"));
        assertFalse(NameRepository.update("Non Existent", "New Name"));
        assertFalse(NameRepository.update("Nickan Javan", "Mehrdad Javan")); // "Mehrdad Javan" already exists
    }

    /**
     * Test for remove method.
     * Ensures that remove removes a name from the names array and returns true, or returns false if the name is not found.
     */
    @Test
    public void testRemove() {
        boolean removed = NameRepository.remove("Mehrdad Javan");
        assertTrue(removed);
        assertNull(NameRepository.find("Mehrdad Javan"));
        assertFalse(NameRepository.remove("Non Existent"));
    }
}
