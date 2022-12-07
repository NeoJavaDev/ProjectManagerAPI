package neo.javadev.projectmanagerapi.dto.projectDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import neo.javadev.projectmanagerapi.mvc.entity.Task;
import neo.javadev.projectmanagerapi.mvc.entity.User;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProjectDto {

    private Long id;

    private String name;

    private Date startDate;

    private Date endDate;

    private String logo;

    private User user;

    private List<Task> tasks;

    private Integer management;

    private Integer developer;

    private Integer software;

    private Integer hardware;

    private Integer premises;

    private Integer furniture;

    private Integer sourcing;

    private Integer distribution;

    private Integer cost;
    private Integer revenue;

    private Boolean profitable;


    public ProjectDto(Long id, String name, Date startDate, Date endDate, String logo, User user, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.logo = logo;
        this.user = user;
        this.tasks = tasks;

        for (Task task : tasks) {
            this.management += task.getManagement();
            this.developer += task.getDeveloper();
            this.software += task.getSoftware();
            this.hardware += task.getHardware();
            this.premises += task.getPremises();
            this.furniture += task.getFurniture();
            this.sourcing += task.getSourcing();
            this.distribution += task.getDistribution();
            this.cost += task.getCost();
            this.revenue += task.getRevenue();
        }

        if (revenue - cost < 1) {
            this.profitable = true;
        } else {
            this.profitable = false;
        }
    }
}