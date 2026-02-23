package tn.esprit.youssefalaya_4arctic10.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class ProjectDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long detailsId;

     Double budget;

     String client;
    // OneToOne(mappedBy = "details")
    //Projects project;
}
