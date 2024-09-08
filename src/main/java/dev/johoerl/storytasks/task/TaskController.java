package dev.johoerl.storytasks.task;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import lombok.extern.java.Log;

@RestController
@Log
public class TaskController {

    private final TaskRepository taskRepository;

    TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping
    List<Task> findAll() {
        return taskRepository.findAll();
    }

    @GetMapping("Task/{id}")
    Task findById(@PathVariable Integer id) {
        log.info("Id: " + id);
        Optional<Task> task = taskRepository.findById(id);
        if(task.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Task not found");
        }
        return task.get();
    }
}
