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
	@NotNull
	private String roleName;
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	
	public UserRole() {
		// TODO Auto-generated constructor stub
	}

	public UserRole(Integer idUserRole, String roleName, User user) {
		super();
		this.idUserRole = idUserRole;
		this.roleName = roleName;
		this.user = user;
	}

	public Integer getIdUserRole() {
		return idUserRole;
	}

	public void setIdUserRole(Integer idUserRole) {
		this.idUserRole = idUserRole;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
