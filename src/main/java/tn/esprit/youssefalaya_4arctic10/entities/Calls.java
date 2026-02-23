package tn.esprit.youssefalaya_4arctic10.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Calls {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;

     String phoneNumber;
    @Column(unique = true , nullable = false)
     LocalDateTime callsDatetime;

    @Enumerated(EnumType.STRING)
     CallStatus status;

    @ElementCollection
    @Enumerated(EnumType.STRING)
     Set<CallSkills> requiredSkills;

    @ManyToOne
    Agents assignedAgent;

    @ManyToOne
    private AISystems assignedAiSystem;
}
