package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class SupportFormat {
	@Id
	private String idSupportFormat;
	@NotNull
	private String supportName;
	@ManyToOne
	@JoinColumn(name="id_support_type")
	private SupportType supportType;
	private Integer duration;
	private String size;
	private String color;
	
	public SupportFormat() {
		// TODO Auto-generated constructor stub
	}

	public SupportFormat(String idSupportFormat, String supportName, SupportType supportType, Integer duration, String size,
			String color) {
		super();
		this.idSupportFormat = idSupportFormat;
		this.supportName = supportName;
		this.supportType = supportType;
		this.duration = duration;
		this.size = size;
		this.color = color;
	}

	public String getIdSupportFormat() {
		return idSupportFormat;
	}

	public void setIdSupportFormat(String idSupportFormat) {
		this.idSupportFormat = idSupportFormat;
	}

	public String getSupportName() {
		return supportName;
	}

	public void setSupportName(String supportName) {
		this.supportName = supportName;
	}

	public SupportType getSupportType() {
		return supportType;
	}

	public void setSupportType(SupportType supportType) {
		this.supportType = supportType;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
