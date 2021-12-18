package az.abb.etaskifyapp.service;

import az.abb.etaskifyapp.entity.Task;
import az.abb.etaskifyapp.entity.TaskAssign;
import az.abb.etaskifyapp.entity.User;
import az.abb.etaskifyapp.payload.ApiResponse;
import az.abb.etaskifyapp.payload.TaskRequest;
import az.abb.etaskifyapp.repository.TaskRepository;
import az.abb.etaskifyapp.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private TaskRepository taskRepository;
    private UserRepository userRepository;

    public ResponseEntity createTask(TaskRequest taskRequest){
        User user = userRepository.getByUsername(taskRequest.getUsername());
//        Task task = new Task(taskRequest.getTitle(),taskRequest.getDescription(),taskRequest.getDeadline(),
//                0, user.getIdOrganization());
//
//        taskRepository.save(task);

        return ResponseEntity.ok((new ApiResponse(true, "Task created successfully")));
    }

    public ResponseEntity assignTaskToUser(TaskRequest taskRequest){
        for (int i = 0; i < taskRequest.getUsers().size(); i++) {
            User user = userRepository.getByUsername(taskRequest.getUsers().get(i).getUsername());
        }

        TaskAssign taskAssign = new TaskAssign();

        return ResponseEntity.ok((new ApiResponse(true, "Task created successfully")));
    }

}
