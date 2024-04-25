package com.example.GTICS-LAB4-20192663.entity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name="Jobs")
public class jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_id")
    private int id;
    @Column(nullable = false)
    private String job_title;
    private int min_salary;
    private int max_salary;


}
