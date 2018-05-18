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
public class Loan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idLoan;
	@Temporal(TemporalType.DATE)
	private Date dateDue;
	@ManyToOne
	@JoinColumn(name="id_applicant")
	private User applicant;
	@ManyToOne
	@JoinColumn(name="id_archivist")
	private User archivist;
	
	@ManyToOne(optional=true)
	@JoinColumn(name="num_request")
	private LoanRequest loanRequest;



	//TODO details Loan
	@OneToMany(targetEntity=DetailLoan.class, mappedBy="loan")
	private List<DetailLoan> detailLoans;
//	@OneToMany(targetEntity=SupportLoan.class, mappedBy="loan")
//	private List<SupportLoan> supportLoans;
//
	
	public Loan() {
		// TODO Auto-generated constructor stub
	}


	public Loan(Long idLoan, Date dateDue, User applicant, User archivist, LoanRequest loanRequest,
				List<DetailLoan> detailLoans) {
		super();
		this.idLoan = idLoan;
		this.dateDue = dateDue;
		this.applicant = applicant;
		this.archivist = archivist;
		this.loanRequest = loanRequest;
		this.detailLoans = detailLoans;
//		this.supportLoans = supportLoans;
	}


	public Long getIdLoan() {
		return idLoan;
	}


	public void setIdLoan(Long idLoan) {
		this.idLoan = idLoan;
	}


	public Date getDateDue() {
		return dateDue;
	}


	public void setDateDue(Date dateDue) {
		this.dateDue = dateDue;
	}


	public User getApplicant() {
		return applicant;
	}


	public void setApplicant(User applicant) {
		this.applicant = applicant;
	}


	public User getArchivist() {
		return archivist;
	}


	public void setArchivist(User archivist) {
		this.archivist = archivist;
	}


	public LoanRequest getLoanRequest() {
		return loanRequest;
	}


	public void setLoanRequest(LoanRequest loanRequest) {
		this.loanRequest = loanRequest;
	}

	public List<DetailLoan> getDetailLoans() {
		return detailLoans;
	}

	public void setDetailLoans(List<DetailLoan> detailLoans) {
		this.detailLoans = detailLoans;
	}
}
