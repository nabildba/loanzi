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
	private Integer IdDepartment;
	@NotNull
	private String deptName;
	private Integer loanDuration;
	public Department() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [IdDept=" + IdDepartment + ", deptName=" + deptName + "]";
	}

	public Integer getIdDept() {
		return IdDepartment;
	}

	public void setIdDept(Integer IdDepartment) {
		this.IdDepartment = IdDepartment;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public Integer getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(Integer loanDuration) {
		this.loanDuration = loanDuration;
	}
}
