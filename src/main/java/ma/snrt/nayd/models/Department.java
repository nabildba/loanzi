package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer IdDept;
	@NotNull
	private String deptName;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [IdDept=" + IdDept + ", deptName=" + deptName + "]";
	}

	public Integer getIdDept() {
		return IdDept;
	}

	public void setIdDept(Integer idDept) {
		IdDept = idDept;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
