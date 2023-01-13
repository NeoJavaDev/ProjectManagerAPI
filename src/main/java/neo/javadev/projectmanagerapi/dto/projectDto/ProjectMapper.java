package neo.javadev.projectmanagerapi.dto.projectDto;

import neo.javadev.projectmanagerapi.rest.entity.Project;
import neo.javadev.projectmanagerapi.rest.entity.Task;

import java.util.List;

public class ProjectMapper {



    public static ProjectDto buildProjectDto(Project project) {

        List<Task> tasks = project.getTasks();
        int management = 0;
        int developer = 0;
        int software = 0;
        int hardware = 0;
        int premises = 0;
        int furniture = 0;
        int sourcing = 0;
        int distribution = 0;
        int cost = 0;
        int revenue = 0;

        ProjectDto projectDto = new ProjectDto();
        projectDto.setId(project.getId());
        projectDto.setName(project.getName());
        projectDto.setStartDate(project.getStartDate());
        projectDto.setEndDate(project.getEndDate());
        projectDto.setLogo(project.getLogo());
        projectDto.setUser(project.getUser());
        for(Task task: tasks) {
            management += task.getManagement();
            developer += task.getDeveloper();
            software += task.getSoftware();
            hardware += task.getHardware();
            premises += task.getPremises();
            furniture += task.getFurniture();
            sourcing += task.getSourcing();
            distribution += task.getDistribution();
            cost += task.getCost();
            revenue += task.getRevenue();
        }
        projectDto.setTasks(tasks);
        projectDto.setManagement(management);
        projectDto.setDeveloper(developer);
        projectDto.setSoftware(software);
        projectDto.setHardware(hardware);
        projectDto.setPremises(premises);
        projectDto.setFurniture(furniture);
        projectDto.setSourcing(sourcing);
        projectDto.setDistribution(distribution);
        projectDto.setCost(cost);
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
        int management = 0;
        int developer = 0;
        int software = 0;
        int hardware = 0;
        int premises = 0;
        int furniture = 0;
        int sourcing = 0;
        int distribution = 0;
        int revenue = 0;
        int cost = 0;

        Project project = new Project();
        project.setId(projectDto.getId());
        project.setId(projectDto.getId());
        project.setStartDate(projectDto.getStartDate());
        project.setEndDate(projectDto.getEndDate());
        project.setLogo(project.getLogo());
        project.setUser(projectDto.getUser());
        project.setTasks(projectDto.getTasks());
        for(Task task: tasks) {
            management += task.getManagement();
            developer += task.getDeveloper();
            software += task.getSoftware();
            hardware += task.getHardware();
            premises += task.getPremises();
            furniture += task.getFurniture();
            sourcing += task.getSourcing();
            distribution += task.getDistribution();
            cost += task.getCost();
            revenue += task.getRevenue();
        }
        project.setManagement(management);
        project.setDeveloper(developer);
        project.setSoftware(software);
        project.setHardware(hardware);
        project.setPremises(premises);
        project.setFurniture(furniture);
        project.setSourcing(sourcing);
        project.setDistribution(distribution);
        project.setCost(cost);
        project.setRevenue(revenue);
        if (revenue > 0 ) {
            projectDto.setProfitable(true);
        } else {
            projectDto.setProfitable(false);
        }

        return project;
    }
}
