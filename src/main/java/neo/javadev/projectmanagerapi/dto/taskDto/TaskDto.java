package neo.javadev.projectmanagerapi.dto.taskDto;

import neo.javadev.projectmanagerapi.entity.Project;

public class TaskDto {

    private Long id;

    private String name;

    private int management;

    private int developer;

    private int software;

    private int hardware;

    private int premises;

    private int furniture;

    private int sourcing;

    private int distribution;

    private int revenue;

    private String logoUrl;

    private Project project;

    private boolean profitable;

    public TaskDto() {
    }

    public TaskDto(Long id, String name, int management, int developer, int software, int hardware, int premises, int furniture, int sourcing, int distribution, int revenue, String logoUrl, Project project, boolean profitable) {
        this.id = id;
        this.name = name;
        this.management = management;
        this.developer = developer;
        this.software = software;
        this.hardware = hardware;
        this.premises = premises;
        this.furniture = furniture;
        this.sourcing = sourcing;
        this.distribution = distribution;
        this.logoUrl = logoUrl;
        this.project = project;
        this.revenue = management + developer + software + hardware + premises + furniture + sourcing + distribution;
        this.profitable = profitable;
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

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public boolean isProfitable() {
        return profitable;
    }

    public void setProfitable(boolean profitable) {
        this.profitable = profitable;
    }
}