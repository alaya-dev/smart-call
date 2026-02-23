package tn.esprit.youssefalaya_4arctic10.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class AISystems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long aiSystemsId;

    String type;

    boolean available;

    @ElementCollection(targetClass = CallSkills.class)
    @Enumerated(EnumType.STRING)
    Set<CallSkills> skills;
    @OneToMany (mappedBy = "assignedAiSystem")
    Set<Calls> myCalls;

}