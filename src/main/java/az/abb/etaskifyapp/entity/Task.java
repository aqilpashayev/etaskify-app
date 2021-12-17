package az.abb.etaskifyapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    private Long id;
    private String title;
    private String description;
    private Instant deadline;
    private int status;

    private Long idorganization;

    public Task(String title, String description, Instant deadline, int status, Long idorganization) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.status = status;
        this.idorganization = idorganization;
    }
}
