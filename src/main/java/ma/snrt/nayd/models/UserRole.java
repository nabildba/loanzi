package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;


@Entity
public class UserRole {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUserRole;
	@ManyToOne
	@JoinColumn(name="id_role")
	private Role role;
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	
	public UserRole() {
		// TODO Auto-generated constructor stub
	}

	public UserRole(Integer idUserRole, String roleName, Role role) {
		super();
		this.idUserRole = idUserRole;
		this.role = role;
		this.user = user;
	}

	public Integer getIdUserRole() {
		return idUserRole;
	}

	public void setIdUserRole(Integer idUserRole) {
		this.idUserRole = idUserRole;
	}

	public Role getRole() {
		return role;
	}

	public void setRoleName(Role role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
