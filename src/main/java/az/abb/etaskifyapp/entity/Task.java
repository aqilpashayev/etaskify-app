package az.abb.etaskifyapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "task")
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private Instant deadline;

    @Column
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
