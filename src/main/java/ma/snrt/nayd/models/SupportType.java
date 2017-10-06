package ma.snrt.nayd.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class SupportType {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idSupportType;
	@NotNull
	private String supportTypeName;
	private String usageType;// public or broadcast
	private String disposition;//bande magnétique or disque
	private Integer active;
	@OneToMany(targetEntity=SupportFormat.class, mappedBy="supportType", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<SupportFormat> supportFormats;

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


	public List<SupportFormat> getSupportFormats() {
		return supportFormats;
	}

	public void setSupportFormats(List<SupportFormat> supportFormats) {
		this.supportFormats = supportFormats;
	}

	public String getDisposition() {
		return disposition;
	}

	public void setDisposition(String disposition) {
		this.disposition = disposition;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}
}
