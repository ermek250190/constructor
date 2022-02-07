package com.company;

public class Course {
    private String nameCourse;
    private int timeCourse;
    private String denCourse;
   private Studeent [] students;

      public Course(){

    }

    public Course(String nameCourse, int timeCourse, String denCourse, Studeent[] cours) {
        this.nameCourse = nameCourse;
        this.timeCourse = timeCourse;
        this.denCourse = denCourse;
        this.students = cours;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public Studeent[] getStudents() {
        return students;
    }

    public void setStudents(Studeent[] students) {
        this.students = students;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getTimeCourse() {
        return timeCourse;
    }

    public void setTimeCourse(int timeCourse) {
        this.timeCourse = timeCourse;
    }

    public String getDenCourse() {
        return denCourse;
    }

    public void setDenCourse(String denCourse) {
        this.denCourse = denCourse;
    }

    void Studentinfo(){
        System.out.println(getDenCourse()+getNameCourse()+ +getTimeCourse());

        for (Studeent res:getStudents()
             ) { res.student();

        }
      }

}
