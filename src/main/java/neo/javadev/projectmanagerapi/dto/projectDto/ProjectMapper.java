package neo.javadev.projectmanagerapi.dto.projectDto;

import neo.javadev.projectmanagerapi.entity.Project;
import neo.javadev.projectmanagerapi.entity.Task;

import java.util.List;

public class ProjectMapper {

    public static ProjectDto buildProjectDto(Project project) {

        List<Task> tasks = project.getTasks();
        int revenue = 0;

        ProjectDto projectDto = new ProjectDto();
        projectDto.setId(project.getId());
        projectDto.setName(project.getName());
        projectDto.setStartDate(project.getStartDate());
        projectDto.setEndDate(project.getEndDate());
        projectDto.setLogoUrl(project.getLogoUrl());
        projectDto.setUser(project.getUser());
        projectDto.setTasks(project.getTasks());
        for(Task task: tasks) {
            projectDto.setManagement(task.getManagement());
            projectDto.setDeveloper(task.getDeveloper());
            projectDto.setSoftware(task.getSoftware());
            projectDto.setHardware(task.getHardware());
            projectDto.setPremises(task.getPremises());
            projectDto.setFurniture(task.getFurniture());
            projectDto.setSourcing(task.getSourcing());
            projectDto.setDistribution(task.getDistribution());
            revenue += task.getRevenue();
        }
        projectDto.setRevenue(revenue);
        if (revenue > 0 ) {
            projectDto.setProfitable(true);
        } else {
            projectDto.setProfitable(false);
        }

        return projectDto;
    }

    public static Project buildProject(ProjectDto projectDto) {

        Project project = new Project();
        project.setId(projectDto.getId());
        project.setId(projectDto.getId());
        project.setStartDate(projectDto.getStartDate());
        project.setEndDate(projectDto.getEndDate());
        project.setLogoUrl(project.getLogoUrl());
        project.setUser(projectDto.getUser());
        project.setTasks(projectDto.getTasks());

        return project;
    }
}
