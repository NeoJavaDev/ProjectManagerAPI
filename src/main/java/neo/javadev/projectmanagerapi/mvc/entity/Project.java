package neo.javadev.projectmanagerapi.mvc.entity;


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

    @Column(name="logo")
    private String logo;

    @Column(name="management")
    private Integer management;

    @Column(name="developer")
    private Integer developer;

    @Column(name="software")
    private Integer software;

    @Column(name="hardware")
    private Integer hardware;

    @Column(name="premises")
    private Integer premises;

    @Column(name="furniture")
    private Integer furniture;

    @Column(name="sourcing")
    private Integer sourcing;

    @Column(name="distribution")
    private Integer distribution;

    @Column(name="cost")
    private Integer cost;

    @Column(name="revenue")
    private Integer revenue;

    @Column(name="profitability")
    private Boolean profitable;

    @ManyToOne
    @JoinColumn(name = "user_id_fk")
    @JsonBackReference
    private User user;

    @OneToMany(targetEntity = Task.class, cascade = CascadeType.ALL)
    @JoinColumn(name ="project_id_fk", referencedColumnName = "id")
    @JsonManagedReference
    private List<Task> tasks;


}
