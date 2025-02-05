package com.example.app_with_argocd.entity;

import com.example.app_with_argocd.dto.StudentDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    Long id;

    @Column(name = "s_name")
    String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public static Student toEntity(StudentDto studentDto) {
        Student student = new Student();
        student.setName(studentDto.getName());
        return student;
    }
}