package com.example.springbootaddtest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Entity
@Getter @Setter
public class Elective {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Course course;
    @Column(columnDefinition = "TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP",
    updatable = false,
    insertable = false)
    private LocalDateTime insertTime;

    public Elective(Student student,Course course) {
        this.student = student;
        this.course = course;
    }
}
