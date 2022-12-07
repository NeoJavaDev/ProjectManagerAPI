package neo.javadev.projectmanagerapi.dto.taskDto;

import neo.javadev.projectmanagerapi.mvc.entity.Task;

public class TaskMapper {

    public static TaskDto buildTaskDto(Task task) {

        TaskDto taskDto = new TaskDto();
        taskDto.setId(task.getId());
        taskDto.setName(task.getName());
        taskDto.setLogo(task.getLogo());
        taskDto.setManagement(task.getManagement());
        taskDto.setDeveloper(task.getDeveloper());
        taskDto.setSoftware(task.getSoftware());
        taskDto.setHardware(task.getHardware());
        taskDto.setPremises(task.getPremises());
        taskDto.setFurniture(task.getFurniture());
        taskDto.setSourcing(task.getSourcing());
        taskDto.setDistribution(task.getDistribution());
        taskDto.setProject(task.getProject());

        return taskDto;
    }

    public static Task buildTak(TaskDto taskDto) {

        Task task = new Task();
        task.setId(taskDto.getId());
        task.setName(taskDto.getName());
        task.setLogo(taskDto.getLogo());
        task.setManagement(taskDto.getManagement());
        task.setDeveloper(taskDto.getDeveloper());
        task.setSoftware(taskDto.getSoftware());
        task.setHardware(taskDto.getHardware());
        task.setPremises(taskDto.getPremises());
        task.setFurniture(taskDto.getFurniture());
        task.setSourcing(taskDto.getSourcing());
        task.setDistribution(taskDto.getDistribution());
        task.setProject(taskDto.getProject());

        return task;

    }
}
