# Sprint1_T8_Lambdas

Level 1

All exercises must use the Java 8+ Java Lambdas and Streams API.

- Exercise 1

Given a list of Strings, write a method that returns a list of all strings that contain the letter 'o'. Print the result.


- Exercise 2

You have to do the same as in the previous point, but now, the method must return a list with the Strings that, in addition to containing the letter 'o', also have more than 5 letters. Print the result.


- Exercise 3

Create a list with the names of the months of the year. Print all elements of the list with a lambda.


- Exercise 4

Make the same impression as the previous point, but through method reference.


- Exercise 5

Create a Functional Interface with a method called getPiValue() that must return a double. From the main() of the main class, instantiate the interface and assign it the value 3.1415. Call the getPiValue() method and print the result.


- Exercise 6

Create a list with numbers and text strings and sort the list with the strings from shortest to longest.


- Exercise 7

Using the list from the previous exercise, now order it in reverse, from longest chain to shortest.


- Exercise 8

Create a Functional Interface that contains a method called reverse(). This method must receive and must return a String. In the main() of the main class, it injects into the interface created using a lambda, the body of the method, so that it returns the same string that it receives as a parameter but in reverse. It invokes the interface instance by passing it a string and checks if the result is correct.


Level 2

- Exercise 1

Create a list of strings with proper names. Write a method that returns a list of all strings that start with the letter 'A' (uppercase) and have exactly 3 letters. Print the result.


- Exercise 2

Program a method that returns a comma-separated string based on a list of Integers. Each element must be preceded by the letter "e" if the number is even, or by the letter "o" if the number is odd. For example, if the input list is (3, 55, 44), the output should be “o3, o55, e44”. Print the result.


- Exercise 3

Create a Functional Interface that contains a method called operation(). This method must return a float. It injects into the interface created using a lambda, the body of the method, so that the operation with addition, subtraction, multiplication and division can be transformed.


- Exercise 4

Create a list containing some strings of text and numbers.

Sort them by:
Alphabetically by first character. (Note: charAt(0) returns the numeric code of the first character)
Strings containing an "e" first, other strings after. Put the code directly in the lambda.
Modifies all elements in the list that have an 'a'. Change the 'a' to a '4'.
Show only items that are numeric. (Even if they are saved as Strings).


Level 3

- Exercise 1

Create a Student class with the attributes: Name, age, year and grade.
Complete a list with 10 students.
Show the name and age of each student on the screen.
Filter the list by all students whose name starts with 'a'. Assign these students to another list and display the new list (all with lambdas).
Filter and display students who have a grade of 5 or higher.
Filter and display students who have a grade of 5 or more, and who are not from PHP.
Shows all students who take JAVA and are of legal age.


Resources:

https://www.oracle.com/technetwork/es/articles/java/expresiones-lambda-api-stream-java-2633852-esa.html

https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html

https://www.baeldung.com/java-8-functional-interfaces

https://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html

https://www.baeldung.com/java-8-lambda-expressions-tips

https://dzone.com/articles/refactoring-exercise-using

https://dzone.com/articles/functional-programming-patterns-with-java-8



