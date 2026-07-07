package utils;

public class Student {

    private String stuId;
    private String name;
    private Double marks;

    public Student(String stuId, String name, Double marks) {

        this.stuId = stuId;
        this.name = name;
        this.marks = marks;
    }

    public String getStuId() {
        return stuId;
    }

    public String getName() {
        return name;
    }

    public Double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return stuId + " " + name + " " + marks;
    }

}
