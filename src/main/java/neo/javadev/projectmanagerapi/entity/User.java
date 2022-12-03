package neo.javadev.projectmanagerapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name="surname")
    private String surname;

    @Column(name="name")
    private String name;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

    @Column(name="nationality")
    private String nationality;

    @OneToMany(targetEntity = Project.class, cascade = CascadeType.ALL)
    @JoinColumn(name ="user_id_fk", referencedColumnName = "id")
    @JsonManagedReference
    private List<Project> projects;

}
