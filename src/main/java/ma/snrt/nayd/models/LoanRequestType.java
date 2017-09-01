package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class LoanRequestType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idType;
	@NotNull
	private String typeName;
	
	public LoanRequestType() {
		// TODO Auto-generated constructor stub
	}

	public LoanRequestType(Integer idType, String typeName) {
		super();
		this.idType = idType;
		this.typeName = typeName;
	}

	public Integer getIdType() {
		return idType;
	}

	public void setIdType(Integer idType) {
		this.idType = idType;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
	
}
