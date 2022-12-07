package neo.javadev.projectmanagerapi.mvc.controller;

import neo.javadev.projectmanagerapi.dto.taskDto.TaskDto;
import neo.javadev.projectmanagerapi.dto.taskDto.TaskMapper;
import neo.javadev.projectmanagerapi.mvc.entity.Task;
import neo.javadev.projectmanagerapi.mvc.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", originPatterns = "/project-manager/projects", maxAge = 3600)
@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    private TaskMapper taskMapper;

    @GetMapping
    public List<TaskDto> getAllTasks(){
        List<Task> tasks = taskService.getAllTasks();
        List<TaskDto> taskDtos = new ArrayList<TaskDto>();
        for(Task task: tasks) {
            TaskDto taskDto = taskMapper.buildTaskDto(task);
            taskDtos.add(taskDto);
        }
        return taskDtos;
    }

    @GetMapping("/task/{id}")
    public ResponseEntity<TaskDto> getTask(@PathVariable("id") Long id) {
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        Optional<Task> optionalTask = taskService.getTaskById(id);
        if(optionalTask.isPresent()){
            Task task = optionalTask.get();
            TaskDto taskDto = taskMapper.buildTaskDto(task);
            return ResponseEntity.status(HttpStatus.OK).body(taskDto);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/task/add")
    public void createTask(@RequestBody Task task) {
        taskService.createTask(task);
    }

    @PutMapping("task/update/{id}")
    public void updateTask(@RequestBody Task task) {
        taskService.updateTask(task);
    }

    @DeleteMapping("task/delete/{id}")
    public void deleteTask(@PathVariable("id") Long id) {
        taskService.deleteTaskById(id);
    }
}
