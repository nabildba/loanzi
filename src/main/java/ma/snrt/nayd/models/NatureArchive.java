package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NatureArchive {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idNature;
	private String natureName; // origin . copie . pad ...
	
	public NatureArchive() {
		// TODO Auto-generated constructor stub
	}

	public NatureArchive(Integer idNature, String natureName) {
		super();
		this.idNature = idNature;
		this.natureName = natureName;
	}

	public Integer getIdNature() {
		return idNature;
	}

	public void setIdNature(Integer idNature) {
		this.idNature = idNature;
	}

	public String getNatureName() {
		return natureName;
	}

	public void setNatureName(String natureName) {
		this.natureName = natureName;
	}
	
	
}
