package tms.karpovich.lesson18Parser;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
    @XmlAttribute(name = "id")
    private int id;
    @XmlElement(name = "nick")
    private String name;
    private String gender;
    private Course course;

    public Student() {
    }

    public Student(int id, String name, String gender, Course course) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.course = course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", course=" + course +
                '}';
    }
}
