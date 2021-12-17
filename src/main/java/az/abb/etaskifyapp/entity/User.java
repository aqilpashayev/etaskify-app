package az.abb.etaskifyapp.entity;

import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table( name = "user")
@Data
public class User {

    public User() {
    }

    public User(String name, String surName, String username, String email, String password) {
        this.name = name;
        this.surName = surName;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String name;

    @NotBlank
    @Size(max = 40)
    private String surName;

    @NotBlank
    @Size(max = 15)
    private String username;

    @NaturalId
    @NotBlank
    @Size(max = 40)
    @Email
    private String email;

    @NotBlank
    @Size(max = 40, min = 6)
    private String password;
    private String confirmationToken;

    @NotBlank
    private Long idOrganization;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "roles",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))

//    @OneToMany(mappedBy="roles")
//    private Set<Role> roles;
}
