# Student Mark Tracker

A small Java console program that generates random marks for a group of students,
prints them, calculates each student's average, and classifies the result.

Built as **Task 1** of the Java Bootcamp.

## What it does

1. Builds a 2D array of specified size. 
2. Fills it with random marks in the marks range 1–10.
3. Prints every student's marks.
4. Computes each student's average mark.
5. Classifies each average according to the grading scale below.

## Grading scale

| Average  | Result             |
|----------|--------------------|
| `[1;5)`  | FAILED             |
| `[5;7)`  | PASSED: GOOD       |
| `[7;9)`  | PASSED: VERY GOOD  |
| `[9;10]` | PASSED: PERFECT    |


## Configuration

The number of students and marks per student are defined as constants at the top
of `Main.java`:

```java
static final int STUDENT_COUNT = 5;
static final int MARKS_PER_STUDENT = 5;
```

Adjust these to change the size of the mark grid.

## Example output

```
Student 1: 7, 3, 9, 5, 8,
Student 2: 2, 4, 1, 3, 5,
...
Average for student 1 is 6.4
Average for student 2 is 3.0
...
6.4 PASSED: GOOD
3.0 FAILED
```