package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.StudentDao;
import system.model.Student;


import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDAO;


    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }

    public List<Student> getStudents() {
        return studentDAO.getStudents();
    }
}
