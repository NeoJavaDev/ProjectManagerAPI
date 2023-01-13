package neo.javadev.projectmanagerapi.dto.projectDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import neo.javadev.projectmanagerapi.rest.entity.Task;
import neo.javadev.projectmanagerapi.rest.entity.User;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Integer getManagement() {
        return management;
    }

    public void setManagement(Integer management) {
        this.management = management;
    }

    public Integer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Integer developer) {
        this.developer = developer;
    }

    public Integer getSoftware() {
        return software;
    }

    public void setSoftware(Integer software) {
        this.software = software;
    }

    public Integer getHardware() {
        return hardware;
    }

    public void setHardware(Integer hardware) {
        this.hardware = hardware;
    }

    public Integer getPremises() {
        return premises;
    }

    public void setPremises(Integer premises) {
        this.premises = premises;
    }

    public Integer getFurniture() {
        return furniture;
    }

    public void setFurniture(Integer furniture) {
        this.furniture = furniture;
    }

    public Integer getSourcing() {
        return sourcing;
    }

    public void setSourcing(Integer sourcing) {
        this.sourcing = sourcing;
    }

    public Integer getDistribution() {
        return distribution;
    }

    public void setDistribution(Integer distribution) {
        this.distribution = distribution;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    public Boolean getProfitable() {
        return profitable;
    }

    public void setProfitable(Boolean profitable) {
        this.profitable = profitable;
    }
}