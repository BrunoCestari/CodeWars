# CodeWars 

## Overview

This repository contains my CodeWars kata practice. I aim to complete at least one kata per day within an hour. 

## Optimizations
- Learn the ternary operator
- Learn Hashmap
- Learn ArrayList
- Learn Treemap
- Learn regex
- Compare index limits in loops. E.g: length - 1 and length();

## Lessons Learned

### Observations

- Always remember to handle null conditions when working with methods that expect non-null parameters.
- Consider reverse iteration when the length and indices of object is changing
### Integer Methods

### Useful Integer Methods

- `Integer.parseInt(String s)`: Converts a string (like `"123"`) to an `int` (like `123`) - primitive int.
- `Integer.valueOf(String s)`: Creates an `Integer` object from a string (e.g., converts `"123"` to an `Integer`) 
- `Integer.toString(int i)`: Converts an `int` (like `123`) to a string (like `"123"`).
- `Integer.compare(int x, int y)`: Compares two `int` values. Returns:
    - `0` if they are equal,
    - A negative number if the first is less,
    - A positive number if the first is greater.


### Character Methods

- `Character.toUpperCase(char ch)`: Converts a character to uppercase.
- `Character.GetNumericValue()`: don't work in negatives, spaces etc, use this to not get the ASCII value.

### String Methods

- `replaceAll("(?i)[aeiou]" , "");`: Replaces each substring of this string that matches the given regular expression with the given replacement.
- `charAt(int index)`: Returns the character at the specified index.
- `length()`: Returns the length of the string.
- `substring(int beginIndex)`: Returns a substring starting from the specified index.
- `substring(int beginIndex, int endIndex)`: Returns a substring from the specified begin index to the specified end index.
- `indexOf(String str)`: Returns the index of the first occurrence of the specified substring.
- `lastIndexOf(String str)`: Returns the index of the last occurrence of the specified substring.
- `startsWith(String prefix)`: Checks if the string starts with the specified prefix.
- `endsWith(String suffix)`: Checks if the string ends with the specified suffix.
- `toLowerCase()`: Converts the string to lowercase.
- `toUpperCase()`: Converts the string to uppercase.
- `trim()`: Removes leading and trailing whitespaces.
- `replace(char oldChar, char newChar)`: Replaces all occurrences of a character with another character.
- `replaceAll(String regex, String replacement)`: Replaces all occurrences of a substring that matches the given regular expression with another substring.
- `split(String regex)`: Splits the string into an array of substrings based on the given regular expression.
- `concat(String str)`: Concatenates the specified string to the end of this string.
- `isEmpty()`: Checks if the string is empty.
- `equalsIgnoreCase(String anotherString)`: Compares two strings, ignoring case differences.
- `toCharArray()`: Converts the string to a character array.

### StringBuilder Methods

- **`append(String str)`**: Appends the specified string to the end of the character sequence.

- **`insert(int offset, String str)`**: Inserts the specified string into the character sequence at the specified position.

- **`delete(int start, int end)`**: Deletes the characters in a substring of this sequence.

- **`reverse()`**: Causes this character sequence to be replaced by the reverse of the sequence.

- **`toString()`**: Converts the contents of the StringBuilder to a String.


### Array Methods

- `length`: Returns the length of the array.
- `clone()`: Creates a shallow copy of the array.
- `copyOf(int[] original, int newLength)`: Copies the specified array, truncating or padding with zeros (if necessary) to obtain the specified length.
- `copyOfRange(int[] original, int from, int to)`: Copies the specified range of the specified array.
- `fill(int[] array, int value)`: Assigns the specified int value to each element of the specified array.
- `sort(int[] a)`: Sorts the specified array into ascending numerical order.
- `binarySearch(int[] a, int key)`: Searches the specified array for the specified value using the binary search algorithm.
- `equals(Object[] a, Object[] b)`: Returns true if the two specified arrays of objects are equal to one another.
- `toString(int[] a)`: Returns a string representation of the contents of the specified array.
- `asList(T... a)`: Returns a fixed-size list backed by the specified array.
- `fill(T[] array, T value)`: Assigns the specified Object reference to each element of the specified array.
- `hashCode(Object[] a)`: Returns the hash code value for the specified array.
- `stream(T[] array)`: Returns a sequential Stream with the elements of the specified array as its source.
- `parallelStream(T[] array)`: Returns a possibly parallel Stream with the elements of the specified array as its source.


    