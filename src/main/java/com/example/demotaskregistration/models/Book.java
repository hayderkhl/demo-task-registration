package com.example.demotaskregistration.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name ="author")
    private String author;

    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "genre")
    private String genre;

    @Column(name = "quantity")
    private String quantity;

}
