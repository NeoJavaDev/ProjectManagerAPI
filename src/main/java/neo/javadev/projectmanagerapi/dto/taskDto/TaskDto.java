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

}