package az.abb.etaskifyapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskAssign {

    private Long id;
    private Long idtask;
    private Long iduser;
    private int isActive;



}
