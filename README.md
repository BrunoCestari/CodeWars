# CodeWars Practice

## Overview
This repository contains my CodeWars kata solutions. My goal is to complete at least one kata per day within an hour.

## Optimizations
- Learn the ternary operator
- Understand HashMap, ArrayList, and TreeMap
- Improve regex skills
- Compare index limits in loops (e.g., `length - 1` vs. `length()`)
- Learn about time complexity
- Learn the basic 5 sorting algorithms
- Learn streams

## Lessons Learned




### Integer Methods
- **`Integer.parseInt(String s)`**: Converts a string to a primitive int.
- **`Integer.valueOf(String s)`**: Creates an `Integer` object from a string.
- **`Integer.toString(int i)`**: Converts an int to a string.
- **`Integer.compare(int x, int y)`**: Compares two int values.
- **`Integer.min(int a, int b)`**: Returns the smaller of two int values.
- **`Integer.max(int a, int b)`**: Returns the larger of two int values.

### Character Methods
- **`Character.getNumericValue(char ch)`**: Returns the numeric value of a character.
- **`Character.toUpperCase(char ch)`**: Converts a character to uppercase.
- **`Character.toLowerCase(char ch)`**: Converts a character to lowercase.
- **`Character.isLetter(char ch)`**: Checks if the character is a letter (a-z or A-Z).
- **`Character.isDigit(char ch)`**: Checks if the character is a digit (0-9).
- **`Character.isUpperCase(char ch)`**: Checks if the character is uppercase.
- **`Character.isLowerCase(char ch)`**: Checks if the character is lowercase.



### String Methods

- **`equals(Object obj)`**: Checks if two strings are equal (case-sensitive).
- **`equalsIgnoreCase(String anotherString)`**: Checks if two strings are equal (ignores case).
- **`isEmpty()`**: Checks if the string is empty. This doesn't check if the string is null.
- **`replace(char c, char o)`**: Replaces all occurrences of `c` with `o`.
- **`replaceAll(String regex, String replacement)`**: Replaces each substring that matches the `regex` with the replacement.
- **`split(String regex)`**: Splits the string into an array of substrings based on the given regular expression.
- **`charAt(int index)`**: Returns the character at the specified index.
- **`length()`**: Returns the length of the string.
- **`substring(int beginIndex)`**: Returns a substring from the specified index.
- **`substring(int beginIndex, int endIndex)`**: Returns a substring between the specified indices.
- **`indexOf(String str)`**: Returns the index of the first occurrence of the specified substring.
- **`lastIndexOf(String str)`**: Returns the index of the last occurrence of the specified substring.
- **`toLowerCase()`**: Converts the string to lowercase.
- **`toUpperCase()`**: Converts the string to uppercase.
- **`trim()`**: Removes leading and trailing whitespaces.
- **`toCharArray()`**: Converts the string to a character array.
- **`join(CharSequence delimiter, CharSequence... elements)`**: Joins the elements of the given array or iterable into a single `String`, with each element separated by the specified delimiter.
- **`repeat(int count)`**: Returns a new string consisting of the original string repeated the specified number of times. (Available from Java 11 onwards)
- **`String.format(String format, Object... args)`**: Returns a formatted string with placeholders replaced by argument. (e.g convert do hexadecimal base etc)

### StringBuilder Methods
- **`append(String str)`**: Appends the specified string to the character sequence.
- **`insert(int offset, String str)`**: Inserts the specified string at the specified position.
- **`delete(int start, int end)`**: Deletes the characters in the specified range.
- **`reverse()`**: Reverses the character sequence.
- **`toString()`**: Converts the StringBuilder to a String.

### Array Methods
- **`length`**: Returns the length of the array.
- **`sort(int[] a)`**: Sorts the array in ascending order.
- **`binarySearch(int[] a, int key)`**: Searches for the specified value using binary search.
- **`asList(T... a)`**: Returns a fixed-size list backed by the specified array.

### ArrayList Methods
- **`add(E element)`**: Adds the element to the end of the list.
- **`remove(int index)`**: Removes the element at the specified position.
- **`get(int index)`**: Returns the element at the specified position.
- **`size()`**: Returns the number of elements in the list.
- **`clear()`**: Removes all elements from the list.
- **`Collections.sort(List<T> list)`**: Sorts the elements of the list.

### LinkedList Methods
- **`addFirst(E e)`**: Inserts the specified element at the beginning of the list.
- **`addLast(E e)`**: Appends the specified element to the end of the list.
- **`removeFirst()`**: Removes and returns the first element of the list.
- **`removeLast()`**: Removes and returns the last element of the list.
- **`getFirst()`**: Retrieves the first element of the list.
- **`getLast()`**: Retrieves the last element of the list.

### HashMap Methods
- **`put(K key, V value)`**: Associates the value with the key.
- **`get(Object key)`**: Returns the value associated with the key.
- **`remove(Object key)`**: Removes the mapping for the key.
- **`containsKey(Object key)`**: Checks if the map contains the key.
- **`containsValue(Object value)`**: Checks if the map contains the value.
- **`size()`**: Returns the number of key-value pairs in the map.
- **`clear()`**: Removes all key-value pairs from the map.
- **`keySet()`**: Returns a `Set` view of the keys.
- **`values()`**: Returns a `Collection` view of the values.

### TreeMap Methods
- **`put(K key, V value)`**: Associates the value with the key, maintaining sorted order.
- **`get(Object key)`**: Returns the value associated with the key.
- **`remove(Object key)`**: Removes the mapping for the key.
- **`firstKey()`**: Returns the first key in the map.
- **`lastKey()`**: Returns the last key in the map.

### Set Methods

- **HashSet**:
    - **`add(E e)`**: Adds the specified element to the set.
    - **`remove(Object o)`**: Removes the specified element from the set.
    - **`contains(Object o)`**: Checks if the set contains the specified element.
    - **`size()`**: Returns the number of elements in the set.
    - **`clear()`**: Removes all elements from the set.

- **TreeSet**:
    - **`add(E e)`**: Adds the specified element to the set, maintaining sorted order.
    - **`remove(Object o)`**: Removes the specified element from the set.
    - **`contains(Object o)`**: Checks if the set contains the specified element.
    - **`size()`**: Returns the number of elements in the set.
    - **`clear()`**: Removes all elements from the set.
    - **`first()`**: Returns the first (lowest) element.
    - **`last()`**: Returns the last (highest) element.



### Collections Methods

- **`sort()`**: Sorts the list according to the specified comparator.

- **`reverse()`**: Reverses the order of elements in the list.

- **`copy()`**: Copies elements from the source list to the destination list. 




### Choosing Data Structures and Sorting Methods

- **Arrays vs. ArrayLists**:
    - Use an **Array** when the size is fixed or known in advance, or when working with primitive types to avoid wrapper class overhead.
    - Use an **ArrayList** when the size may change dynamically and for convenience with built-in methods.

- **Sets**:
    - Use a **HashSet** when you need a collection with no duplicates and fast access.
    - Use a **TreeSet** when you need the elements sorted in natural order or by a custom comparator.

- **Sorting Methods**:
    - Use **`Collections.sort()`** to sort `ArrayList` or other `List` implementations.
    - Use **`Arrays.sort()`** to sort arrays.
    - For custom sorting logic, implement `Comparator` or `Comparable`.

- **HashMap vs. TreeMap**:
    - Use a **HashMap** for fast lookups when order doesn’t matter.
    - Use a **TreeMap** when a sorted order of keys is required.

### Regex
- **`[aeiou]`**: Matches any one of the characters in the set a, e, i, o, or u (case-sensitive).
- **`[^aeiou]`**: Matches any character that is not a vowel (case-sensitive). The ^ negates the character class.
- **`(?i)`**: Case-insensitive flag. Makes the regex pattern match letters in any case (e.g., a or A).
- **`[a-e]`**: Matches any character in the range from a to e (inclusive).
- **`\\d`**: Matches any digit (equivalent to [0-9]).
- **`\\D`**: Matches any character that is not a digit (equivalent to [^0-9]).
- **`\\w`**: Matches any word character (alphanumeric + underscore, equivalent to [a-zA-Z0-9_]).
- **`\\W`**: Matches any non-word character (equivalent to [^a-zA-Z0-9_]).
- **`\\s`**: Matches any whitespace character (spaces, tabs, line breaks).
- **`\\S`**: Matches any non-whitespace character.
- **`^`**: Matches the beginning of the string.
- **`$`**: Matches the end of the string.
- **`.`**: Matches any character except for line breaks (unless dotall flag is set).
- **`*`**: Matches 0 or more occurrences of the preceding element.
- **`+`**: Matches 1 or more occurrences of the preceding element.
- **`?`**: Matches 0 or 1 occurrence of the preceding element.
- **`{n,m}`**: Matches between n and m occurrences of the preceding element.
- **`|`**: Acts as an OR operator, matching either the pattern before or after it.
- **`()`**: Groups expressions together and captures them for backreferences.
- **`[]`**: Denotes a character class that matches any one of the enclosed characters.


### Math Tricks
- **`%10`**: Get the last digit of a number.
- **`/10`**: Remove the last digit of a number.
- **`dr/dc`**: Create directional vectors for row (dr) and column (dc) changes. Use a variable dir to track the current direction.
- **`%n`**: Use modulo n to cycle through values. For example, dir = (dir + 1) % 4 cycles through 4 directions.
