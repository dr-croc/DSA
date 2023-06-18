// Example 1: Appending strings
val sb = StringBuilder()
sb.append("Hello")
sb.append(" ")
sb.append("World")
val finalString = sb.toString() // "Hello World"


// Example 2: Concatenating values in a loop
val sb = StringBuilder()
for (i in 0 until 5) {
    sb.append("Number: ").append(i).append("\n")
}
val finalString = sb.toString()
/*
Number: 0
Number: 1
Number: 2
Number: 3
Number: 4
*/


// Example 3: Inserting characters
val sb = StringBuilder("Hello World")
sb.insert(5, "Awesome ") // Insert "Awesome " at index 5
val finalString = sb.toString() // "Hello Awesome World"


// Example 4: Replacing substrings
val sb = StringBuilder("Hello World")
sb.replace(6, 11, "Kotlin") // Replace "World" with "Kotlin"
val finalString = sb.toString() // "Hello Kotlin"

// Example 5: Deleting characters
val sb = StringBuilder("Hello World")
sb.delete(5, 11) // Delete characters from index 5 to 10
val finalString = sb.toString() // "Hello"


