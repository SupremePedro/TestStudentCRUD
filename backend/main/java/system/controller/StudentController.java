package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import system.model.Student;
import system.service.StudentServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;
    public @ResponseBody
    List<Student> getAllStudents(){
        return studentService.getStudents();
    }
}
