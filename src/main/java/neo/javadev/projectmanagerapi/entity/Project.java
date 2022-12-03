package neo.javadev.projectmanagerapi.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="start_date")
    private Date startDate;

    @Column(name="end_date")
    private Date endDate;

    @Column(name="logo_url")
    private String logoUrl;

    @ManyToOne
    @JoinColumn(name = "user_id_fk")
    @JsonBackReference
    private User user;

    @OneToMany(targetEntity = Task.class, cascade = CascadeType.ALL)
    @JoinColumn(name ="project_id_fk", referencedColumnName = "id")
    @JsonManagedReference
    private List<Task> tasks;


}
