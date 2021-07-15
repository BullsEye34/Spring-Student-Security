package ml.vamshiprasad.student.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private static final List<Student> STUDENT_LIST = Arrays.asList(
            new Student(1, "James Bond"),
            new Student(2, "John Wick"),
            new Student(3, "John Constantine"),
            new Student(4, "Vamshi Prasad"),
            new Student(5, "Eivor")
    );
    @GetMapping(path = "{studentID}")
    public Student getStudent(@PathVariable("studentID") Integer studentID){
            return STUDENT_LIST
                    .stream()
                    .filter(student -> studentID.equals(student.getStudentID()))
                    .findFirst()
                    .orElseThrow(()->new IllegalStateException("Student "+studentID+" Does not exist!"));
    }
}
