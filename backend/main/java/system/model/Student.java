package system.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
@Entity
@Table(name ="students")
public class Student {
    private Integer id;
    private String firstName;
    private String secondName;
    private Integer age;
    private Date birthDate;
    private String faculty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Student(String firstName, String secondName, Integer age, Date birthDate, String faculty) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.birthDate = birthDate;
        this.faculty = faculty;
    }

    public Student() {
    }
}
