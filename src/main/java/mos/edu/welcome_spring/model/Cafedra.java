package mos.edu.welcome_spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Cafedra {
    @Id
    private String id;
    private String name;
    private String chief;
    private String description;
    private LocalDateTime createdAt, updateAt;

    public Cafedra() {
    }

    public Cafedra(String id, String name, String chief, String description, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.chief = chief;
        this.description = description;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Cafedra(String name, String chief, String description) {
        this.name = name;
        this.chief = chief;
        this.description = description;
    }

    public Cafedra(String id, String name, String chief, String description) {
        this.id = id;
        this.name = name;
        this.chief = chief;
        this.description = description;
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

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    public String toString() {
        return "Cafedra{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", chief='" + chief + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cafedra cafedra = (Cafedra) o;
        return id.equals(cafedra.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



}
