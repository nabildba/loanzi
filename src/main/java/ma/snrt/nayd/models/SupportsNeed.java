package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SupportsNeed {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long numNeed;
	private Integer quantity;
	
	@ManyToOne
	@JoinColumn(name="id_support_format")
	private SupportFormat supportFormat;
	
	
	@ManyToOne
	@JoinColumn(name="num_request")
	private LoanRequest loanRequest;
	
	public SupportsNeed() {
		// TODO Auto-generated constructor stub
	}

	public Long getNumNeed() {
		return numNeed;
	}

	public void setNumNeed(Long numNeed) {
		this.numNeed = numNeed;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public SupportFormat getSupportFormat() {
		return supportFormat;
	}

	public void setSupportFormat(SupportFormat supportFormat) {
		this.supportFormat = supportFormat;
	}

	public LoanRequest getLoanRequest() {
		return loanRequest;
	}

	public void setLoanRequest(LoanRequest loanRequest) {
		this.loanRequest = loanRequest;
	}
	
	
}
