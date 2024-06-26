package org.example.affabelbeanbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double price;
    private String description;
    private LocalDateTime lastUpdate;
    @JoinColumn(name = "category_id")
    @ManyToOne
    private Category category;
}
