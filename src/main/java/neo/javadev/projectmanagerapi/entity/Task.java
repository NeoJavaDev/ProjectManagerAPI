package neo.javadev.projectmanagerapi.entity;

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
@Table(name="task")
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

}
