package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by nabil on 26/11/2017.
 */
@Entity
public class Magasin {
    @Id
    private
    Long idMagasin;
    @NotNull
    private
    String nomMagasin;
    private String batiment;
    private String description;
    private int nbrArmoires;
    private int nbrEtageres;

    public Magasin() {
    }

    public Magasin(Long idMagasin, String nomMagasin, String batiment, String description, int nbrArmoires, int nbrEtageres) {
        this.idMagasin = idMagasin;
        this.nomMagasin = nomMagasin;
        this.batiment = batiment;
        this.description = description;
        this.nbrArmoires = nbrArmoires;
        this.nbrEtageres = nbrEtageres;
    }

    public Long getIdMagasin() {
        return idMagasin;
    }

    public void setIdMagasin(Long idMagasin) {
        this.idMagasin = idMagasin;
    }

    public String getNomMagasin() {
        return nomMagasin;
    }

    public void setNomMagasin(String nomMagasin) {
        this.nomMagasin = nomMagasin;
    }

    public String getBatiment() {
        return batiment;
    }

    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbrArmoires() {
        return nbrArmoires;
    }

    public void setNbrArmoires(int nbrArmoires) {
        this.nbrArmoires = nbrArmoires;
    }

    public int getNbrEtageres() {
        return nbrEtageres;
    }

    public void setNbrEtageres(int nbrEtageres) {
        this.nbrEtageres = nbrEtageres;
    }


    @Override
    public String toString() {
        return "Magasin{" +
                "nomMagasin='" + nomMagasin + '\'' +
                '}';
    }
}
