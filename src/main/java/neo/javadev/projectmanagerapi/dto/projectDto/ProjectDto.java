package neo.javadev.projectmanagerapi.dto.projectDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import neo.javadev.projectmanagerapi.entity.Task;
import neo.javadev.projectmanagerapi.entity.User;

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

    private String logoUrl;

    private User user;

    private List<Task> tasks;

    private int management;

    private int developer;

    private int software;

    private int hardware;

    private int premises;

    private int furniture;

    private int sourcing;

    private int distribution;

    private int revenue;

    private boolean profitable;


    public ProjectDto(Long id, String name, Date startDate, Date endDate, String logoUrl, User user, List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.logoUrl = logoUrl;
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
        }

        this.revenue += this.management + this.developer + this.software + this.hardware + this.premises + this.furniture + this.sourcing + this.distribution;
        if (revenue > 0) {
            this.profitable = true;
        } else {
            this.profitable = false;
        }
    }

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

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
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

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public boolean isProfitable() {
        return profitable;
    }

    public void setProfitable(boolean profitable) {
        this.profitable = profitable;
    }
}