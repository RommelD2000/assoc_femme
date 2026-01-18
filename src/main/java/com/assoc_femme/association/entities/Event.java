package com.assoc_femme.association.entities;


import jakarta.persistence.*;
import lombok.*;

import javax.print.attribute.standard.Media;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private LocalDateTime startingDate;
    private LocalDateTime endingDate;

    private String place;
    private Integer capacity;

    @ManyToMany
    @JoinTable(
            name = "event_participants",
            joinColumns = @JoinColumn(name=  "event_id"),
            inverseJoinColumns = @JoinColumn(name ="user_id")
    )
    private Set<User> participants;

    @OneToMany(mappedBy = "event")
    private Set<Media> medias;
}
