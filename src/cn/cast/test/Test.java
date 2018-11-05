package cn.cast.test;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("姜南");
        System.out.println(student);
        System.out.println("ss");
    }
}

class Student{
    private String name;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
