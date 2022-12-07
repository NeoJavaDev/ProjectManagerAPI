package neo.javadev.projectmanagerapi.dto.taskDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import neo.javadev.projectmanagerapi.mvc.entity.Project;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TaskDto {

    private Long id;
    private String name;
    private String logo;
    private int management;
    private int developer;
    private int software;
    private int hardware;
    private int premises;
    private int furniture;
    private int sourcing;
    private int distribution;
    private Integer cost;
    private int revenue;
    private Boolean profitable;
    private Project project;

    public TaskDto(Long id, String name, int management, int developer, int software, int hardware, int premises, int furniture, int sourcing, int distribution, int revenue, String logo, Project project) {
        this.id = id;
        this.name = name;
        this.logo = logo;
        this.management = management;
        this.developer = developer;
        this.software = software;
        this.hardware = hardware;
        this.premises = premises;
        this.furniture = furniture;
        this.sourcing = sourcing;
        this.distribution = distribution;
        this.project = project;
        this.cost = management + developer + software + hardware + premises + furniture + sourcing + distribution;
        this.revenue = revenue;
        if (revenue - cost < 1) {
            this.profitable = true;
        } else {
            this.profitable = false;
        }
    }
}