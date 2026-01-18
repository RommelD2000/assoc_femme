package com.assoc_femme.association.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name="memberships")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate startingDate;
    private LocalDate endingDate;
    private  double amount;

    @Enumerated(EnumType.STRING)
    private StatutAdhesion statut;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
