package az.abb.etaskifyapp.controller;

import az.abb.etaskifyapp.payload.ApiResponse;
import az.abb.etaskifyapp.payload.TaskAssignRequest;
import az.abb.etaskifyapp.payload.TaskRequest;
import az.abb.etaskifyapp.repository.TaskAssignRepository;
import az.abb.etaskifyapp.repository.TaskRepository;
import az.abb.etaskifyapp.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/task")
@AllArgsConstructor
public class TaskController {

    private TaskService taskService;

    @PostMapping("/create")
    public ResponseEntity createTask(@Valid @RequestBody TaskRequest taskRequest){
        taskService.createTask(taskRequest);
        return ResponseEntity.ok(new ApiResponse(true,"Task created successfully!"));

    }

    @PostMapping("/assign")
    public ResponseEntity assignTask(@Valid @RequestBody TaskAssignRequest taskAssignRequest){
        taskService.assignTaskToUser(taskAssignRequest);
        return ResponseEntity.ok(new ApiResponse(true,"Task created successfully!"));

    }
}
