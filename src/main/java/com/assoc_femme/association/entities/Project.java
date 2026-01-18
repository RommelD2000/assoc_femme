package com.assoc_femme.association.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="projects")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String description;
    private LocalDate startingDate;
    private LocalDate endingDate;

    @Enumerated(EnumType.STRING)
    private  ProjectStatus statut;
    @ManyToMany(mappedBy = "project")
    private Set<Media> medias;

}
