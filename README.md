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

## Lessons Learned

- Take care when checking (Reference or content? -> Consider using `.equals()` for string comparison)

### Integer Methods
- **`Integer.parseInt(String s)`**: Converts a string to a primitive int.
- **`Integer.valueOf(String s)`**: Creates an `Integer` object from a string.
- **`Integer.toString(int i)`**: Converts an int to a string.
- **`Integer.compare(int x, int y)`**: Compares two int values.

### Character Methods
- **`Character.toUpperCase(char ch)`**: Converts a character to uppercase.
- **`Character.getNumericValue(char ch)`**: Returns the numeric value of a character.

### String Methods
- **`isEmpty()`**: Checks if the string is empty.
- **`split(String regex)`**: Splits the string into an array of substrings based on the given regular expression.
- **`replaceAll(String regex, String replacement)`**: Replaces each substring that matches the regex with the replacement.
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

## StringBuilder Methods
- **`append(String str)`**: Appends the specified string to the character sequence.
- **`insert(int offset, String str)`**: Inserts the specified string at the specified position.
- **`delete(int start, int end)`**: Deletes the characters in the specified range.
- **`reverse()`**: Reverses the character sequence.
- **`toString()`**: Converts the StringBuilder to a String.

## Array Methods
- **`length`**: Returns the length of the array.
- **`sort(int[] a)`**: Sorts the array in ascending order.
- **`binarySearch(int[] a, int key)`**: Searches for the specified value using binary search.
- **`asList(T... a)`**: Returns a fixed-size list backed by the specified array.

## ArrayList Methods
- **`add(E element)`**: Adds the element to the end of the list.
- **`remove(int index)`**: Removes the element at the specified position.
- **`get(int index)`**: Returns the element at the specified position.
- **`size()`**: Returns the number of elements in the list.
- **`clear()`**: Removes all elements from the list.
- **`Collections.sort(List<T> list)`**: Sorts the elements of the list.

## HashMap Methods
- **`put(K key, V value)`**: Associates the value with the key.
- **`get(Object key)`**: Returns the value associated with the key.
- **`remove(Object key)`**: Removes the mapping for the key.
- **`containsKey(Object key)`**: Checks if the map contains the key.
- **`size()`**: Returns the number of key-value mappings.
- **`clear()`**: Removes all mappings from the map.
- **`getOrDefault(Object key, V defaultValue)`**: Returns the value associated with the key if it exists; otherwise, returns the `defaultValue`.

## Choosing Data Structures and Sorting Methods

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
