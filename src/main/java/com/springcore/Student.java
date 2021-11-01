package com.springcore;

public class Student {
    private int studentId;
    private int studentName;
    private int studentAddress;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentName() {
        return studentName;
    }

    public void setStudentName(int studentName) {
        this.studentName = studentName;
    }

    public int getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(int studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student(int studentId, int studentName, int studentAddress) {
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName=" + studentName +
                ", studentAddress=" + studentAddress +
                '}';
    }
}
