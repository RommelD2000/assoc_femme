package com.assoc_femme.association.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;

    @Column(unique= true, nullable= false)
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
    private LocalDate inscriptionDate;
    private boolean actif;

    @OneToMany(mappedBy =  "user")
    private Set<Donation> donations;

    @OneToMany(mappedBy = "user")
    private Set<Membership> memberships;

    @ManyToMany(mappedBy = "participants")
    private Set<Event> events;

    @OneToMany(mappedBy = "author")
    private Set<Article> articles;
}
