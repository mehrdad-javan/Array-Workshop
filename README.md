# Workshop – Array & String

You are going to make an application that stores names in a String array with the following format:
“Erik Svensson” -> “[first name][whitespace][last name]”.

You may add any number of private helper methods. Remember to keep it simple with focused methods during the workshop.

You may not use Collections (List, Set, Map…etc.), Stream API, or any kind of helper besides the Arrays class when doing this workshop.

## Part 1

1. Create a new class called `NameRepository`.
2. Inside `NameRepository`, create a private static empty array of String called `names`.
3. Define the following methods:

    ```java
    public static int getSize() 
    ```
    - Returns the number of elements in the array.

    ```java
    public static void setNames(String[] names)
    ```
    - Sets the private static array. This should replace all existing names.

    ```java
    public static void clear() 
    ```
    - Should completely empty the array.

    ```java
    public static String[] findAll()
    ```
    - Returns all names in a new array.

## Part 2

1. Define the following methods in `NameRepository`:

    ```java
    public static String find(final String fullName)
    ```
    - Returns the name if found and `null` if not found.

    ```java
    public static boolean add(final String fullName)
    ```
    - Should add a new name to the array. Returns `true` when the name was added and `false` when the array contains the name.

## Part 3

1. Define the following methods in `NameRepository`:

    ```java
    public static String[] findByFirstName(final String firstName)
    ```
    - Searches the array trying to find all names that have the passed-in first name. Returns a String array containing all matches.

    ```java
    public static String[] findByLastName(final String lastName)
    ```
    - Searches the array trying to find all names that have the passed-in last name. Returns a String array containing all matches.

    ```java
    public static boolean update(final String original, final String updatedName)
    ```
    - Should find a name and replace it with the new `fullName` if available. Returns `true` if the name was found and updated with the new name. Returns `false` if the name could not be updated because the name wasn’t found or the name was found but an existing name matching the `updatedName` already exists.

## Part 4

1. Define the following method in `NameRepository`:

    ```java
    public static boolean remove(final String fullName)
    ```
    - Should remove a name from the array. Returns `true` if the name was removed and `false` if the name was not removed for some reason.


[Lin to Access the Workshop_ArrayPart1.pdf](doc/Workshop_ArrayPart1.pdf)  
[Lin to Access the Workshop_ArrayPart2.pdf](doc/Workshop_ArrayPart2.pdf)  
[Lin to Access the Workshop_ArrayPart3.pdf](doc/Workshop_ArrayPart3.pdf)  
[Lin to Access the Workshop_ArrayPart4.pdf](doc/Workshop_ArrayPart4.pdf)  