package neo.javadev.projectmanagerapi.dto.userDto;

import neo.javadev.projectmanagerapi.entity.Project;

import java.util.List;

public class UserDto {

    private Long id;

    private String surname;

    private String name;

    private String username;

    private String password;

    private String email;

    private String nationality;

    private List<Project> projects;

    public UserDto() {
    }

    public UserDto(Long id, String surname, String name, String username, String password, String email, String nationality, List<Project> projects) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.nationality = nationality;
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
