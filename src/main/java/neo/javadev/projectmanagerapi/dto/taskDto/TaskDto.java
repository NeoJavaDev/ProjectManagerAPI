package neo.javadev.projectmanagerapi.dto.taskDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import neo.javadev.projectmanagerapi.rest.entity.Project;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getManagement() {
        return management;
    }

    public void setManagement(int management) {
        this.management = management;
    }

    public int getDeveloper() {
        return developer;
    }

    public void setDeveloper(int developer) {
        this.developer = developer;
    }

    public int getSoftware() {
        return software;
    }

    public void setSoftware(int software) {
        this.software = software;
    }

    public int getHardware() {
        return hardware;
    }

    public void setHardware(int hardware) {
        this.hardware = hardware;
    }

    public int getPremises() {
        return premises;
    }

    public void setPremises(int premises) {
        this.premises = premises;
    }

    public int getFurniture() {
        return furniture;
    }

    public void setFurniture(int furniture) {
        this.furniture = furniture;
    }

    public int getSourcing() {
        return sourcing;
    }

    public void setSourcing(int sourcing) {
        this.sourcing = sourcing;
    }

    public int getDistribution() {
        return distribution;
    }

    public void setDistribution(int distribution) {
        this.distribution = distribution;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public Boolean getProfitable() {
        return profitable;
    }

    public void setProfitable(Boolean profitable) {
        this.profitable = profitable;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}