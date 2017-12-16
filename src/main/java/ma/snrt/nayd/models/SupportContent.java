package ma.snrt.nayd.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by nabil on 26/11/2017.
 */
@Entity
public class SupportContent {
    @Id
    private
    String barcode;
    private String title;
    @NotNull
    private
    String techId;

    public SupportContent() {
    }

    public SupportContent(String barcode, String title, String techId) {
        this.barcode = barcode;
        this.title = title;
        this.techId = techId;
    }

    @Override
    public String toString() {
        return "SupportContentRepository{" +
                "barcode='" + barcode + '\'' +
                ", title='" + title + '\'' +
                ", techId='" + techId + '\'' +
                '}';
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTechId() {
        return techId;
    }

    public void setTechId(String techId) {
        this.techId = techId;
    }
}
