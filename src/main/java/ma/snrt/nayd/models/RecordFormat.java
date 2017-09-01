package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class RecordFormat {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer numFormat;
	@NotNull
	private String formatName;
	private String fileType;
	private String ratio;
	private String quality;
	private String mode;
	private Integer neededTime;
	
	public RecordFormat() {
		// TODO Auto-generated constructor stub
	}

	
	
	public RecordFormat(Integer numFormat, String formatName, String fileType, String ratio, String quality,
			String mode, Integer neededTime) {
		super();
		this.numFormat = numFormat;
		this.formatName = formatName;
		this.fileType = fileType;
		this.ratio = ratio;
		this.quality = quality;
		this.mode = mode;
		this.neededTime = neededTime;
	}



	public Integer getNumFormat() {
		return numFormat;
	}

	public void setNumFormat(Integer numFormat) {
		this.numFormat = numFormat;
	}

	public String getFormatName() {
		return formatName;
	}

	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getRatio() {
		return ratio;
	}

	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Integer getNeededTime() {
		return neededTime;
	}

	public void setNeededTime(Integer neededTime) {
		this.neededTime = neededTime;
	}
	
	
	
}
