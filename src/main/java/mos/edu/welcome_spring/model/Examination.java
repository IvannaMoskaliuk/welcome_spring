package mos.edu.welcome_spring.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Examination {
    private String id;
    private String student;
    private int mark;
    private String subject;
    private LocalDateTime date;
    private String teacher;

    public Examination() {
    }

    public Examination(String student, int mark, String subject) {
        this.student = student;
        this.mark = mark;
        this.subject = subject;
    }

    public Examination(String id, String student, int mark, String subject) {
        this.id = id;
        this.student = student;
        this.mark = mark;
        this.subject = subject;
    }

    public Examination(String id, String student, int mark, String subject, LocalDateTime date, String teacher) {
        this.id = id;
        this.student = student;
        this.mark = mark;
        this.subject = subject;
        this.date = date;
        this.teacher = teacher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Examination{" +
                "id='" + id + '\'' +
                ", student='" + student + '\'' +
                ", mark=" + mark +
                ", subject='" + subject + '\'' +
                ", date=" + date +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Examination that = (Examination) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
