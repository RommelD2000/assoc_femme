package com.assoc_femme.association.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "contact_messages")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ContactMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String firstname;
    private String lastname;
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String message;
    private LocalDateTime sendingDate;
    private boolean treated;
}
