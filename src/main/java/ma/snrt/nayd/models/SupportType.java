package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class SupportType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idSupportType;
	@NotNull
	private String supportTypeName;
	private String usageType;// public or broadcast
	
	public SupportType() {
		// TODO Auto-generated constructor stub
	}

	public SupportType(Integer idSupportType, String supportTypeName, String usageType) {
		super();
		this.idSupportType = idSupportType;
		this.supportTypeName = supportTypeName;
		this.usageType = usageType;
	}

	public Integer getIdSupportType() {
		return idSupportType;
	}

	public void setIdSupportType(Integer idSupportType) {
		this.idSupportType = idSupportType;
	}

	public String getSupportTypeName() {
		return supportTypeName;
	}

	public void setSupportTypeName(String supportTypeName) {
		this.supportTypeName = supportTypeName;
	}

	public String getUsageType() {
		return usageType;
	}

	public void setUsageType(String usageType) {
		this.usageType = usageType;
	}
	
	
}
