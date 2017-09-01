package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SupportLoan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long numLoanDetail;
	private String barcodeSupport;
	@ManyToOne
	@JoinColumn(name="id_support_format")
	private SupportFormat supportFormat;
	
	@ManyToOne
	@JoinColumn(name="id_loan")
	Loan loan;
	
	public SupportLoan() {
		// TODO Auto-generated constructor stub
	}

	public SupportLoan(Long numLoanDetail, String barcodeSupport, SupportFormat supportFormat, Loan loan) {
		super();
		this.numLoanDetail = numLoanDetail;
		this.barcodeSupport = barcodeSupport;
		this.supportFormat = supportFormat;
		this.loan = loan;
	}

	public Long getNumLoanDetail() {
		return numLoanDetail;
	}

	public void setNumLoanDetail(Long numLoanDetail) {
		this.numLoanDetail = numLoanDetail;
	}

	public String getBarcodeSupport() {
		return barcodeSupport;
	}

	public void setBarcodeSupport(String barcodeSupport) {
		this.barcodeSupport = barcodeSupport;
	}

	public SupportFormat getSupportFormat() {
		return supportFormat;
	}

	public void setSupportFormat(SupportFormat supportFormat) {
		this.supportFormat = supportFormat;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
	
}
