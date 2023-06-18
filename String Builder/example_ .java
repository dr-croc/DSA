// Example 1: Appending strings

StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        String final_ = sb.toString();
        System.out.println(final_);

// Example 2: Concatenating values in a loop

StringBuilder sb = new StringBuilder();
for (int i = 0; i < 5; i++) {
    sb.append("Number: ").append(i).append("\n");
}
String finalString = sb.toString();
/*
Number: 0
Number: 1
Number: 2
Number: 3
Number: 4
*/


// Example 3: Inserting characters
StringBuilder sb = new StringBuilder("Hello World");
sb.insert(5, "Awesome "); // Insert "Awesome " at index 5
String finalString = sb.toString(); // "Hello Awesome World"


// Example 4: Replacing substrings
StringBuilder sb = new StringBuilder("Hello World");
sb.replace(6, 11, "Java"); // Replace "World" with "Java"
String finalString = sb.toString(); // "Hello Java"


// Example 5: Deleting characters
StringBuilder sb = new StringBuilder("Hello World");
sb.delete(5, 11); // Delete characters from index 5 to 10
String finalString = sb.toString(); // "Hello"
