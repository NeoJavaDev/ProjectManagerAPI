package neo.javadev.projectmanagerapi.controller;

import neo.javadev.projectmanagerapi.dto.projectDto.ProjectDto;
import neo.javadev.projectmanagerapi.dto.projectDto.ProjectMapper;
import neo.javadev.projectmanagerapi.entity.Project;
import neo.javadev.projectmanagerapi.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200", originPatterns = "/project-manager/projects", maxAge = 3600)
@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    private ProjectMapper projectMapper;

    @GetMapping
    public List<Project> getAllProject(){
        List<Project> projects = projectService.getAllProjects();

        return projects;
    }
    @PostMapping
    public void createProject(@RequestBody Project project) {
        projectService.createProject(project);
    }

    // BY ID
    @GetMapping("/project/{id}")
    public ResponseEntity<ProjectDto> getProjectById(@PathVariable("id") Long id) {
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        Optional<Project> optionalProject = projectService.getProjectById(id);
        if(optionalProject.isPresent()){
            Project project = optionalProject.get();
            ProjectDto projectDto = projectMapper.buildProjectDto(project);
            return ResponseEntity.status(HttpStatus.OK).body(projectDto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @PutMapping("/project/{id}")
    public void updateProjectById(@RequestBody Project project) {
        projectService.updateProject(project);
    }
    @DeleteMapping("/project/{id}")
    public void deleteProjectById(@PathVariable("id") Long id) {
        projectService.deleteProjectById(id);
    }

    //BY NAME
    @GetMapping("/project/{name}")
    public ResponseEntity<Project> getProjectByName(@PathVariable("name") String name) {
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        Optional<Project> optionalProject = projectService.getProjectByName(name);
        if(optionalProject.isPresent()){
            Project project = optionalProject.get();
            return ResponseEntity.status(HttpStatus.OK).body(project);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
