package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class LoanRequestState {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idState;
	@NotNull
	private String stateName;
	
	public LoanRequestState() {
		// TODO Auto-generated constructor stub
	}

	public LoanRequestState(Long idState, String stateName) {
		super();
		this.idState = idState;
		this.stateName = stateName;
	}

	public Long getIdState() {
		return idState;
	}

	public void setIdState(Long idState) {
		this.idState = idState;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	
}
