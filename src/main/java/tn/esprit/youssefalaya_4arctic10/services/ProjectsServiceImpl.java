package tn.esprit.youssefalaya_4arctic10.services;


import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.youssefalaya_4arctic10.entities.Agents;
import tn.esprit.youssefalaya_4arctic10.entities.Projects;
import tn.esprit.youssefalaya_4arctic10.repositories.IProjectsRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProjectsServiceImpl implements IProjectsServices {
    private final IProjectsRepository projectsRepository;


    @Override
    public List<Agents> getAgents(Long idProject) {
        Projects project = projectsRepository
                .findById(idProject)
                .orElseThrow(() -> new EntityNotFoundException("Projet introuvable"));
        return project.getAgents().stream().toList();
    }
}
