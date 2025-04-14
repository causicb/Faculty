/*
### 1. Class: `Student`
        - Create a class `Student` with the following fields:
        - `firstName` (String)
        - `lastName` (String)
        - `yearOfStudy` (int)
        - `averageGrade` (double)
        - Create a constructor that accepts two `String` parameters: `firstName` and `lastName`.
It should initialize those fields.
- Add a no-argument constructor.
When a student is created using this constructor,
the default name should be `"Pero Peric"`.
*/

public class Student extends Human {

    private int yearOfStudy;
    private double averageGrade;

    public Student () {
        setFirstName("Pero");
        setLastName("Perić");
    }

    public Student (String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

}
