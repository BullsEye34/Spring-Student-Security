package ml.vamshiprasad.student.student;

public class Student {
    private final Integer studentID;
    private final String name;

    public Student( Integer studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getStudentID() {
        return studentID;
    }
}
