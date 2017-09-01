package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class ArchiveNeed {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long numNeed;
	@NotNull
	private String subject;
	private String numTheque;
	private String episodes;
	
	@ManyToOne
	@JoinColumn(name="num_request")
	private LoanRequest loanRequest;
	
	
	public ArchiveNeed() {
		// TODO Auto-generated constructor stub
	}


	public ArchiveNeed(Long numNeed, String subject, String numTheque, String episodes, LoanRequest loanRequest) {
		super();
		this.numNeed = numNeed;
		this.subject = subject;
		this.numTheque = numTheque;
		this.episodes = episodes;
		this.loanRequest = loanRequest;
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


	public String getNumTheque() {
		return numTheque;
	}


	public void setNumTheque(String numTheque) {
		this.numTheque = numTheque;
	}


	public String getEpisodes() {
		return episodes;
	}


	public void setEpisodes(String episodes) {
		this.episodes = episodes;
	}


	public LoanRequest getLoanRequest() {
		return loanRequest;
	}


	public void setLoanRequest(LoanRequest loanRequest) {
		this.loanRequest = loanRequest;
	}
	
	
}
