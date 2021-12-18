package az.abb.etaskifyapp.payload;

import az.abb.etaskifyapp.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskRequest {


    private String title;
    private String description;

    private Instant deadline;

    private int status;

    private String username;

    private Long idOrganization;
    private List<User> users;
}
