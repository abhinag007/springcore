package com.springcore.lifecycle;

public class Example {
    private String Subject;

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public Example() {
        super();
    }

    @Override
    public String toString() {
        return "Example{" +
                "Subject='" + Subject + '\'' +
                '}';
    }
}
