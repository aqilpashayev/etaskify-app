package az.abb.etaskifyapp.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskAssignRequest {

    private Long idtask;
    private Long idUser;
}
