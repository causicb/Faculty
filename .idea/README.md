# University System – Java OOP Task

## Task Description

### 1. Class: `Student`
- Create a class `Student` with the following fields:
    - `firstName` 
    - `lastName` 
    - `yearOfStudy` 
    - `averageGrade` 
- Create a constructor that accepts two `String` parameters: `firstName` and `lastName`. 
It should initialize those fields.
- Add a no-argument constructor. 
When a student is created using this constructor, the default name should be `"Pero Peric"`.

### 2. Class: `Professor`
- Create a class `Professor` with the following fields:
    - `firstName` 
    - `lastName` 
    - `course` 
- Create a constructor that accepts all arguments.
- Create a constructor that accepts only the course and initializes the professor's name as `"Marko Horvat"`.

### 3. Class: `Course`
- Create a class `Course` with the following fields:
    - `name` 
    - `professor` 
    - `students` 
- Implement functionality to add students to the course. 
- If a student is not in the same year of study as the course requires, 
the application should throw an error.

### 4. Main Method
- In the `main` method:
    - Create one course.
    - Assign a professor.
    - Add students to the course.

## Notes
- Use appropriate data types and Java naming conventions.
- Handle exceptions properly when students of the wrong year are added.
