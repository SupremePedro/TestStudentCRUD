package system.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import system.model.Student;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
    public void addStudent(Student student) {
        getCurrentSession().save(student);
    }

    public void updateStudent(Student student) {
        Student studentToUpdate = getStudent(student.getId());
        studentToUpdate.setFirstName(student.getFirstName());
        studentToUpdate.setSecondName(student.getSecondName());
        studentToUpdate.setAge(student.getAge());
        studentToUpdate.setBirthDate(studentToUpdate.getBirthDate());
        getCurrentSession().update(studentToUpdate);
    }

    public Student getStudent(int id) {
        Student student = (Student)getCurrentSession().get(Student.class, id);
        return student;
    }

    public void deleteStudent(int id) {
        Student student = getStudent(id);
        if(student!=null){
            getCurrentSession().delete(student);
        }
    }

    public List<Student> getStudents() {
        return getCurrentSession().createQuery("from students").list();
    }
}
