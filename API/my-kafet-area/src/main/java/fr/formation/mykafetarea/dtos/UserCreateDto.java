package fr.formation.mykafetarea.dtos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import fr.formation.mykafetarea.entities.Role;

public class UserCreateDto {

    @NotNull
    @Size(max = 8, message = "{E_MAX_LENGTH_EXCEEDED}")
    private String id;

    @NotNull
    @Size(max = 40, message = "{E_MAX_LENGTH_EXCEEDED}")
    private  String name;

    @NotNull
    @Size(max = 40, message = "{E_MAX_LENGTH_EXCEEDED}")
    private String firstname;

    @NotNull
    @Size(max = 70, message = "{E_MAX_LENGTH_EXCEEDED}")
    private String email;

    @NotNull
    @Size(max = 10, message = "{E_MAX_LENGTH_EXCEEDED}")
    private String password;

    @NotNull
    private Role role;

    public UserCreateDto() {
        super();
    }

	@Override
	public String toString() {
		return "UserCreateDto [email=" + email + ", firstname=" + firstname + ", id=" + id + ", name=" + name
				+ ", password=" + password + ", role=" + role + "]";
	}

}
