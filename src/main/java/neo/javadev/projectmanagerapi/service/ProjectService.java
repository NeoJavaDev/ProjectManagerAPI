package neo.javadev.projectmanagerapi.service;

import neo.javadev.projectmanagerapi.entity.Project;
import neo.javadev.projectmanagerapi.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects(){
        return projectRepository.findAll();
    }

    public void createProject(Project project){
        projectRepository.save(project);
    }

    public Optional<Project> getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    public void updateProject(Project project) {
        projectRepository.save(project);
    }

    public void deleteProjectById(Long id) {
        projectRepository.deleteById(id);
    }
}
