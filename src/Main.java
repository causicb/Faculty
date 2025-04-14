public class Main {

    public static void main(String... args) {
        Student student1 = new Student("Darko", "Jakilić");
        Student student2 = new Student("Lado", "Habjanović");
        Student student3 = new Student("Samir", "Radovičić");

        student1.setYearOfStudy(4);
        student2.setYearOfStudy(3);
        student3.setYearOfStudy(4);

        Professor professor1 = new Professor("Marko", "Marulić", "Math");
        Course course = new Course("Math", professor1, 4);

        course.addStudentsToCourse(student1);
        course.addStudentsToCourse(student2);
        course.addStudentsToCourse(student3);

    }

}
