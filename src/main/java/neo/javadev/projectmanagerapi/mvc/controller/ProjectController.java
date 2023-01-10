package neo.javadev.projectmanagerapi.mvc.controller;

import neo.javadev.projectmanagerapi.dto.projectDto.ProjectDto;
import neo.javadev.projectmanagerapi.dto.projectDto.ProjectMapper;
import neo.javadev.projectmanagerapi.mvc.entity.Project;
import neo.javadev.projectmanagerapi.mvc.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    private ProjectMapper projectMapper;

    @GetMapping("projects")
    public List<ProjectDto> getAllProjects(){
        List<Project> projects = projectService.getAllProjects();
        List<ProjectDto> projectDtos = new ArrayList<ProjectDto>();
        for(Project project: projects) {
            ProjectDto projectDto = projectMapper.buildProjectDto(project);
            projectDtos.add(projectDto);
        }
        return projectDtos;
    }

    // BY ID
    @GetMapping("project/{id}")
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
    @RequestMapping(value ="project/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createProject(@RequestBody Project project) {
        projectService.createProject(project);
    }
    @RequestMapping(value ="project/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateProjectById(@RequestBody Project project) {
        projectService.updateProject(project);
    }
    @DeleteMapping("project/delete/{id}")
    public void deleteProjectById(@PathVariable("id") Long id) {
        projectService.deleteProjectById(id);
    }

    //BY NAME
    /*@GetMapping("/project/{name}")
    public ResponseEntity<ProjectDto> getProjectByName(@PathVariable("name") String name) {
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        Optional<Project> optionalProject = projectService.getProjectByName(name);
        if(optionalProject.isPresent()){
            Project project = optionalProject.get();
            ProjectDto projectDto = projectMapper.buildProjectDto(project);
            return ResponseEntity.status(HttpStatus.OK).body(projectDto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }*/
}
