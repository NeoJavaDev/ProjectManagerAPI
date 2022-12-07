package neo.javadev.projectmanagerapi.dto.projectDto;

import neo.javadev.projectmanagerapi.mvc.entity.Project;
import neo.javadev.projectmanagerapi.mvc.entity.Task;

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
        projectDto.setLogo(project.getLogo());
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

        List<Task> tasks = projectDto.getTasks();
        int revenue = 0;

        Project project = new Project();
        project.setId(projectDto.getId());
        project.setId(projectDto.getId());
        project.setStartDate(projectDto.getStartDate());
        project.setEndDate(projectDto.getEndDate());
        project.setLogo(project.getLogo());
        project.setUser(projectDto.getUser());
        project.setTasks(projectDto.getTasks());
        for(Task task: tasks) {
            project.setManagement(task.getManagement());
            project.setDeveloper(task.getDeveloper());
            project.setSoftware(task.getSoftware());
            project.setHardware(task.getHardware());
            project.setPremises(task.getPremises());
            project.setFurniture(task.getFurniture());
            project.setSourcing(task.getSourcing());
            project.setDistribution(task.getDistribution());
            revenue += task.getRevenue();
        }
        project.setRevenue(revenue);
        if (revenue > 0 ) {
            project.setProfitable(true);
        } else {
            project.setProfitable(false);
        }

        return project;
    }
}
