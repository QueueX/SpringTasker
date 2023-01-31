package com.exemple.springtasker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tasker")
public class TaskerController {

    private final TaskerRepository taskerRepository;

    public TaskerController(TaskerRepository taskerRepository) {
        this.taskerRepository = taskerRepository;
    }

    @GetMapping("/list")
    Iterable<Task> getTaskList(){
        return taskerRepository.findAll();
    }

    @GetMapping("/id/{id}")
    Optional<Task> getTaskById(@PathVariable String id){
        return taskerRepository.findById(Integer.valueOf(id));
    }

    @PostMapping("/")
    Task addTask(@RequestBody Task task){
        return taskerRepository.save(task);
    }

    @PutMapping("/id/{id}")
    ResponseEntity<Task> putTask(@PathVariable String id, @RequestBody Task task){
        return (taskerRepository.existsById(Integer.valueOf(id)))
                ? new ResponseEntity<>(taskerRepository.save(task), HttpStatus.OK)
                : new ResponseEntity<>(taskerRepository.save(task), HttpStatus.CREATED);
    }


}
