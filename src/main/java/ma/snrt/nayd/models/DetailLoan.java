package ma.snrt.nayd.models;

import javax.persistence.*;

/**
 * Created by nabil on 22/01/2018.
 */
@Entity
public class DetailLoan {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idDetail;
    private String idSupport;
    @ManyToOne
    @JoinColumn(name="id_loan")
    private
    Loan loan;

    public DetailLoan() {
    }

    public DetailLoan(String idSupport, Loan loan) {
        this.setIdSupport(idSupport);
        this.setLoan(loan);
    }

    public Long getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(Long idDetail) {
        this.idDetail = idDetail;
    }

    public String getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(String idSupport) {
        this.idSupport = idSupport;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
}
