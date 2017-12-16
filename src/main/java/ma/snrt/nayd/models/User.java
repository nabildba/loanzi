package ma.snrt.nayd.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUser;
	
	@NotNull
	private String name;
	private String lastName;
	private String departement;
	private String email;
	private String phone;
	private String phoneIP;
	
	//load roles with user = eager fetching
	@OneToMany(targetEntity=UserRole.class, mappedBy="user", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<UserRole> roles;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(User u) {
		this.name = u.name;
		this.lastName = u.lastName;
		this.departement = u.departement;
		this.email = u.email;
		this.phone = u.phone;
		this.phoneIP = u.phoneIP;
		this.roles = u.roles;
	}

	public Long getIdUser() {
		return idUser;
	}


	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDepartement() {
		return departement;
	}


	public void setDepartement(String departement) {
		this.departement = departement;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPhoneIP() {
		return phoneIP;
	}


	public void setPhoneIP(String phoneIP) {
		this.phoneIP = phoneIP;
	}


	public List<UserRole> getRoles() {
		return roles;
	}


	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}
	
	
	
}
