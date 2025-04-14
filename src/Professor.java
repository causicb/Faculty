public class Professor extends Human {

    String course;

    public Professor(String course){
        setFirstName("Marko");
        setLastName("Horvat");
        this.course = course;
    }

    public Professor(String firstName, String lastName, String course) {
        setFirstName(firstName);
        setLastName(lastName);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

}
