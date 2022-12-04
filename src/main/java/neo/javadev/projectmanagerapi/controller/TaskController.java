package neo.javadev.projectmanagerapi.controller;

import neo.javadev.projectmanagerapi.entity.Task;
import neo.javadev.projectmanagerapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", originPatterns = "/project-manager/projects", maxAge = 3600)
@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks(){
        List<Task> tasks = taskService.getAllTasks();
        return tasks;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTask(@PathVariable("id") Long id) {
        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
        Optional<Task> optionalTask = taskService.getTaskById(id);
        if(optionalTask.isPresent()){
            Task task = optionalTask.get();
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping
    public void createTask(@RequestBody Task task) {
        taskService.createTask(task);
    }

    @PutMapping("task/{id}")
    public void updateTask(@RequestBody Task task) {
        taskService.updateTask(task);
    }

    @DeleteMapping("task/{id}")
    public void deleteTask(@PathVariable("id") Long id) {
        taskService.deleteTaskById(id);
    }
}
