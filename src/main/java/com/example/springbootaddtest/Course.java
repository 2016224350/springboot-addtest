package com.example.springbootaddtest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Entity
@Getter@Setter
public class Course {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String courseName;
    @OneToMany(mappedBy = "course")
    private List<Elective> electives;
    @Column(columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP",
    updatable = false,
    insertable = false)
    private LocalDateTime insertTime;

    public Course(String courseName) {
        this.courseName = courseName;
    }
}
