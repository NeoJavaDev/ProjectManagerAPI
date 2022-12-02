package neo.javadev.projectmanagerapi.controller;

import neo.javadev.projectmanagerapi.entity.Project;
import neo.javadev.projectmanagerapi.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAllProject(){
        List<Project> projects = projectService.getAllProjects();
        return projects;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> getProject(@PathVariable("id") Long id) {
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        Optional<Project> optionalProject = projectService.getProjectById(id);
        if(optionalProject.isPresent()){
            Project project = optionalProject.get();
            return ResponseEntity.status(HttpStatus.OK).body(project);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @PostMapping
    public void createProject(@RequestBody Project project) {
        projectService.createProject(project);
    }
    @PutMapping
    public void updateProject(@RequestBody Project project) {
        projectService.updateProject(project);
    }
    @DeleteMapping
    public void deleteProject(@PathVariable("id") Long id) {
        projectService.deleteProjectById(id);
    }
}
