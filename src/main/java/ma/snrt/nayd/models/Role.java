package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer IdRole;
	
	@NotNull
	private String roleName;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}
	
	public Role(Integer idRole, String roleName) {
		super();
		IdRole = idRole;
		this.roleName = roleName;
	}



	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Integer getIdRole() {
		return IdRole;
	}
	public void setIdRole(Integer idRole) {
		IdRole = idRole;
	}
	
}
