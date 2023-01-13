package neo.javadev.projectmanagerapi.dto.userDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import neo.javadev.projectmanagerapi.rest.entity.Project;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDto {

    private Long id;

    private String surname;

    private String name;

    private String username;

    private String password;

    private String email;

    private String nationality;

    private List<Project> projects;

}
