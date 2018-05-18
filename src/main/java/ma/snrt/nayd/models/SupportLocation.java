package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by nabil on 26/11/2017.
 */
@Entity
public class SupportLocation {
    @Id
    private
    String barcode;
    //TODO let only shelf barcode
    private int armoire;
    private int etagere;
    @ManyToOne
    @JoinColumn(name="id_magasin")
    private
    Magasin magasin;

    public SupportLocation() {
    }

    public SupportLocation(String barcode, int armoire, int etagere, Magasin magasin) {
        this.barcode = barcode;
        this.armoire = armoire;
        this.etagere = etagere;
        this.magasin = magasin;
    }

    @Override
    public String toString() {
        return "SupportLocation{" +
                "barcode='" + barcode + '\'' +
                ", armoire=" + armoire +
                ", etagere=" + etagere +
                ", magasin=" + magasin +
                '}';
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getArmoire() {
        return armoire;
    }

    public void setArmoire(int armoire) {
        this.armoire = armoire;
    }

    public int getEtagere() {
        return etagere;
    }

    public void setEtagere(int etagere) {
        this.etagere = etagere;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }
}
