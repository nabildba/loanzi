package ma.snrt.nayd.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


/**
 * Created by nabil on 18/01/2018.
 */
@Entity
@Table(name = "support_docs")
public class SupportDoc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Integer idSupportDocs;
    private Integer idCont;
    private String idSupport;


    public SupportDoc() {
    }


    public Integer getIdSupportDocs() {
        return idSupportDocs;
    }

    public void setIdSupportDocs(Integer idSupportDocs) {
        this.idSupportDocs = idSupportDocs;
    }


    public String getIdSupport() {
        return idSupport;
    }

    public void setIdSupport(String idSupport) {
        this.idSupport = idSupport;
    }

    public Integer getIdCont() {
        return idCont;
    }

    public void setIdCont(Integer idCont) {
        this.idCont = idCont;
    }
}
