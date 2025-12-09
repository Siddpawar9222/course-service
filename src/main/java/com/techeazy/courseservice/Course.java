package com.techeazy.courseservice;

public class Course {
    private Long id;
    private Long studentId;
    private String courseName;

    public Course(Long id, Long studentId, String courseName) {
         this.id = id ;
         this.studentId = studentId;
         this.courseName = courseName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }



    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
