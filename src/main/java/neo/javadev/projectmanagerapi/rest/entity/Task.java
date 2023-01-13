package neo.javadev.projectmanagerapi.rest.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name="logo")
    private String logo;

    @Column(name="management")
    private int management;

    @Column(name="developer")
    private int developer;

    @Column(name="software")
    private int software;

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

    @Column(name="cost")
    private Integer cost;

    @Column(name="revenue")
    private int revenue;

    @Column(name="profitability")
    private Boolean profitable;

    @ManyToOne
    @JoinColumn(name = "project_id_fk")
    @JsonBackReference
    private Project project;

}
