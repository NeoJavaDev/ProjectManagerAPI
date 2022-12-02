package neo.javadev.projectmanagerapi.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="project")
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

    @Column(name="management")
    private int management;

    @Column(name="developer")
    private int developer;

    @Column(name="software")
    private int sofware;

    @Column(name="hardware")
    private int hardware;

    @Column(name="premises")
    private int premises;

    @Column(name="furniture")
    private int furniture;

    @Column(name="sourcing")
    private int sourcing;

    @Column(name="distribution")
    private int distribution;

    @Column(name="revenue")
    private int revenue;

    @ManyToOne
    @JoinColumn(name="id", referencedColumnName = "id")
    @JsonBackReference
    private User user;

    @OneToMany(targetEntity = Task.class, cascade = CascadeType.ALL)
    @JoinColumn(name="task_id")
    private List<Task> tasks;
}
