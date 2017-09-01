package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class DuplicationNeed {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long numNeed;
	@NotNull
	private String subject;
	private Integer nbrCopies;
	@ManyToOne
	@JoinColumn(name="id_support_type")
	private SupportType supportType;
	
	@ManyToOne
	@JoinColumn(name="num_format")
	private RecordFormat recordFormat;
	
	@ManyToOne
	@JoinColumn(name="num_reuquest")
	private LoanRequest loanRequest;
	
	public DuplicationNeed() {
		// TODO Auto-generated constructor stub
	}

	public DuplicationNeed(Long numNeed, String subject, Integer nbrCopies, SupportType supportType,
			RecordFormat recordFormat, LoanRequest loandRequest) {
		super();
		this.numNeed = numNeed;
		this.subject = subject;
		this.nbrCopies = nbrCopies;
		this.supportType = supportType;
		this.recordFormat = recordFormat;
		this.loanRequest = loandRequest;
	}

	public Long getNumNeed() {
		return numNeed;
	}

	public void setNumNeed(Long numNeed) {
		this.numNeed = numNeed;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getNbrCopies() {
		return nbrCopies;
	}

	public void setNbrCopies(Integer nbrCopies) {
		this.nbrCopies = nbrCopies;
	}

	public SupportType getSupportType() {
		return supportType;
	}

	public void setSupportType(SupportType supportType) {
		this.supportType = supportType;
	}

	public RecordFormat getRecordFormat() {
		return recordFormat;
	}

	public void setRecordFormat(RecordFormat recordFormat) {
		this.recordFormat = recordFormat;
	}

	public LoanRequest getLoandRequest() {
		return loanRequest;
	}

	public void setLoandRequest(LoanRequest loandRequest) {
		this.loanRequest = loandRequest;
	}
	
	
	
}
