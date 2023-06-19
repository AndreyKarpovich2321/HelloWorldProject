package tms.karpovich.lesson20JDBC;

public class Student {
    private int id;
    private int age;
    private int group;
    private String name;
    private String city;

    public Student() {
    }

    public Student(int id, int age, int group, String name, String city) {
        this.id = id;
        this.age = age;
        this.group = group;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + group + " | " + city + "\n";
    }
}
