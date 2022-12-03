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
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

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

    @Column(name="logo_url")
    private String logoUrl;

    @ManyToOne
    @JoinColumn(name = "project_id_fk")
    @JsonBackReference
    private Project project;

}
