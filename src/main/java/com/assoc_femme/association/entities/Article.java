package com.assoc_femme.association.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "articles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    private LocalDate publicationDate;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private  User author;

    @OneToMany(mappedBy = "article")
    private Set<Media> medias;

}
