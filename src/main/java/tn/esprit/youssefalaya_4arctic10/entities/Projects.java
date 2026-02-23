package tn.esprit.youssefalaya_4arctic10.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Projects implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long projectsId;
    @Column(unique = true,nullable = false)
    String libelle;
    LocalDate startDate;

    LocalDate endDate;



    @OneToOne(cascade = {CascadeType.PERSIST , CascadeType.REMOVE})
    ProjectDetails details;

    @ManyToMany(fetch = FetchType.EAGER)
    Set<Agents> agents;


}