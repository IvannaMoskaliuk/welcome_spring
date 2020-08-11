package mos.edu.welcome_spring.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Group {
    String id;
    String name;
    private String description;
    Cafedra cafedra;
    private LocalDateTime createdAt, updateAt;

    //пустий конструктор
    public Group() {
    }

    //без id, createdAt, updated
    public Group(String name, String description, Cafedra cafedra) {
        this.name = name;
        this.description = description;
        this.cafedra = cafedra;
    }

    // createdAt, updated
    public Group(String id, String name, String description, Cafedra cafedra) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cafedra = cafedra;
    }

    //повний конструктор
    public Group(String id, String name, String description, Cafedra cafedra, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cafedra = cafedra;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = description;
    }

    public Cafedra getCafedra() {
        return cafedra;
    }

    public void setCafedra(Cafedra cafedra) {
        this.cafedra = cafedra;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id.equals(group.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
