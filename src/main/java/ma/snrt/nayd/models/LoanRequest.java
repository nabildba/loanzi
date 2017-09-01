package ma.snrt.nayd.models;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class LoanRequest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long numRequest;
	@Temporal(TemporalType.DATE)
	private Date requestDate;
	
	private String subject;
	private String loanUsage;
	private String comments;
	
	@ManyToOne
	@JoinColumn(name="id_request_type")
	private LoanRequestType requestType;
	
	@ManyToOne
	@JoinColumn(name="id_request_state")
	private LoanRequestState requestState;
	
	@ManyToOne
	@JoinColumn(name="id_applicant")
	private User applicant;
	
	@OneToMany(targetEntity=ArchiveNeed.class, mappedBy="loanRequest")
	private List<ArchiveNeed> archivesNeeds;
	
	@OneToMany(targetEntity=DuplicationNeed.class, mappedBy="loanRequest")
	private List<DuplicationNeed> duplicationNeeds;
	
	@OneToMany(targetEntity=SupportsNeed.class, mappedBy="loanRequest")
	private List<SupportsNeed> supportsNeeds;
	
	public LoanRequest() {
		// TODO Auto-generated constructor stub
	}

	public LoanRequest(Long numRequest, Date requestDate, String subject, String usage, String comments,
			LoanRequestType requestType, LoanRequestState requestState, User applicant) {
		super();
		this.numRequest = numRequest;
		this.requestDate = requestDate;
		this.subject = subject;
		this.loanUsage = usage;
		this.comments = comments;
		this.requestType = requestType;
		this.requestState = requestState;
		this.applicant = applicant;
	}

	public Long getNumRequest() {
		return numRequest;
	}

	public void setNumRequest(Long numRequest) {
		this.numRequest = numRequest;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getUsage() {
		return loanUsage;
	}

	public void setUsage(String usage) {
		this.loanUsage = usage;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public LoanRequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(LoanRequestType requestType) {
		this.requestType = requestType;
	}

	public LoanRequestState getRequestState() {
		return requestState;
	}

	public void setRequestState(LoanRequestState requestState) {
		this.requestState = requestState;
	}

	public User getApplicant() {
		return applicant;
	}

	public void setApplicant(User applicant) {
		this.applicant = applicant;
	}

	public List<ArchiveNeed> getArchivesNeeds() {
		return archivesNeeds;
	}

	public void setArchivesNeeds(List<ArchiveNeed> archivesNeeds) {
		this.archivesNeeds = archivesNeeds;
	}

	public List<DuplicationNeed> getDuplicationNeeds() {
		return duplicationNeeds;
	}

	public void setDuplicationNeeds(List<DuplicationNeed> duplicationNeeds) {
		this.duplicationNeeds = duplicationNeeds;
	}

	public List<SupportsNeed> getSupportsNeeds() {
		return supportsNeeds;
	}

	public void setSupportsNeeds(List<SupportsNeed> supportsNeeds) {
		this.supportsNeeds = supportsNeeds;
	}
	
	
}
