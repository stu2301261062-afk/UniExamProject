package models;

public class Solution {
    private final String studentName;
    private final StudentType studentType;
    private final String content;

    public Solution(String studentName, StudentType studentType, String content) {
        this.studentName = studentName;
        this.studentType = studentType;
        this.content = content;
    }

    public StudentType getStudentType() {
        return studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return String.format("Студент: %s (%s)\nРешение: %s", studentName, studentType, content);
    }
}