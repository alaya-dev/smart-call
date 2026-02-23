package tn.esprit.youssefalaya_4arctic10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.youssefalaya_4arctic10.entities.Projects;

public interface IProjectsRepository extends JpaRepository<Projects, Long> {
}