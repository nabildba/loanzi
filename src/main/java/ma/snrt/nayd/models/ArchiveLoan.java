
package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ArchiveLoan {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long numLoanDetail;
		private String barcodeSupport;
		private String numtheque;
		private String natureArchive; //origine , copie , pad
		private String rubric;
		
		
		@ManyToOne
		@JoinColumn(name="id_loan")
		private Loan loan;
		
		public ArchiveLoan() {
			// TODO Auto-generated constructor stub
		}

		public ArchiveLoan(Long numLoanDetail, String barcodeSupport, String numtheque, String natureArchive,
				String rubric, Loan loan) {
			super();
			this.numLoanDetail = numLoanDetail;
			this.barcodeSupport = barcodeSupport;
			this.numtheque = numtheque;
			this.natureArchive = natureArchive;
			this.rubric = rubric;
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

		public String getNumtheque() {
			return numtheque;
		}

		public void setNumtheque(String numtheque) {
			this.numtheque = numtheque;
		}

		public String getNatureArchive() {
			return natureArchive;
		}

		public void setNatureArchive(String natureArchive) {
			this.natureArchive = natureArchive;
		}

		public String getRubric() {
			return rubric;
		}

		public void setRubric(String rubric) {
			this.rubric = rubric;
		}

		public Loan getLoan() {
			return loan;
		}

		public void setLoan(Loan loan) {
			this.loan = loan;
		}
		
		
		
}
