package com.example.rabbitMQExample;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="division")
@Data
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
