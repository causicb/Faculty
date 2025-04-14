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
