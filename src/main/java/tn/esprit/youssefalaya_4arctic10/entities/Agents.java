package tn.esprit.youssefalaya_4arctic10.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Agents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long agentsId;

     String name;

     boolean available;

    @ElementCollection
    @Enumerated(EnumType.STRING)
     Set<CallSkills> skills;

    @OneToMany(mappedBy="assignedAgent")
    Set<Calls>myCalls;

    @ManyToMany(mappedBy = "agents")
    Set<Projects>project;
}
