package az.abb.etaskifyapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "organization")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization extends DateAudit {


    public Organization(String orgName, String phoneNumber, String address) {
        this.orgName = orgName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String orgName;

    @NotBlank
    @Size(max = 40)
    private String phoneNumber;

    @NotBlank
    @Size(max = 40)
    private String address;

    @OneToMany
    private List<User> users;
}
