/*
### 3. Class: `Course`
        - Create a class `Course` with the following fields:
        - `name`
        - `professor`
        - `students`
        - Implement functionality to add students to the course.
        - If a student is not in the same year of study as the course requires,
the application should throw an error.
*/

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private Professor professor;
    private List<Student> students;
    private int requiredYear;

    public Course(String courseName, Professor professor, int requiredYear) {
        this.courseName = courseName;
        this.professor = professor;
        this.students = new ArrayList<>();
        this.requiredYear = requiredYear;
    }

    public void addStudentsToCourse(Student student) {
        if (student.getYearOfStudy() != requiredYear) {
            throw new IllegalArgumentException(
                    "Student " + student.getFirstName() + " " + student.getLastName() +
                            " is not in the required year (" + requiredYear + ") for this course."
            );
        }
        students.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> student) {
        this.students = student;
    }

    public int getRequiredYear() {
        return requiredYear;
    }

    public void setRequiredYear(int requiredYear) {
        this.requiredYear = requiredYear;
    }

}
