package neo.javadev.projectmanagerapi.mvc.controller;

import neo.javadev.projectmanagerapi.dto.taskDto.TaskDto;
import neo.javadev.projectmanagerapi.dto.taskDto.TaskMapper;
import neo.javadev.projectmanagerapi.mvc.entity.Task;
import neo.javadev.projectmanagerapi.mvc.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    private TaskMapper taskMapper;

    @GetMapping("tasks")
    public List<TaskDto> getAllTasks() {
        List<Task> tasks = taskService.getAllTasks();
        List<TaskDto> taskDtos = new ArrayList<TaskDto>();
        for (Task task : tasks) {
            TaskDto taskDto = taskMapper.buildTaskDto(task);
            taskDtos.add(taskDto);
        }
        return taskDtos;
    }

    @GetMapping("task/{id}")
    public ResponseEntity<TaskDto> getTaskById(@PathVariable("id") Long id) {
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        Optional<Task> optionalTask = taskService.getTaskById(id);
        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            TaskDto taskDto = taskMapper.buildTaskDto(task);
            return ResponseEntity.status(HttpStatus.OK).body(taskDto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @RequestMapping(value = "task/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createTask(@RequestBody Task task) {taskService.createTask(task);}
    @RequestMapping(value = "task/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateTask(@RequestBody Task task) {taskService.updateTask(task);}
    @DeleteMapping("task/delete/{id}")
    public void deleteTaskById(@PathVariable("id") Long id) {
        taskService.deleteTaskById(id);
    }

}
