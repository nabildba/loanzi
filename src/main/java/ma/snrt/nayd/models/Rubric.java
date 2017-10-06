package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Rubric {
	@Id
	private String idRubric;
	@NotNull
	private String rubricName;
	
	public Rubric() {
		// TODO Auto-generated constructor stub
	}

	public Rubric(String idRubric, String rubricName) {
		super();
		this.idRubric = idRubric;
		this.rubricName = rubricName;
	}

	public String getIdRubric() {
		return idRubric;
	}

	public void setIdRubric(String idRubric) {
		this.idRubric = idRubric;
	}

	public String getRubricName() {
		return rubricName;
	}

	public void setRubricName(String rubricName) {
		this.rubricName = rubricName;
	}
	
}	
