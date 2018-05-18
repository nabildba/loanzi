package ma.snrt.nayd.views;

import ma.snrt.nayd.models.Document;
import ma.snrt.nayd.models.SupportFormat;

import java.util.List;

public class Support {
    private String numSupport;
    private String idSupportFormat;
    private String supportName;
    private String supportType;
    private String disposition;
    private Integer duration;
    private String size;
    private String color;
    private List<Document> doc;
    //TODO localisation (magasin, rayonnage, shelf)
    //TODO emprunteur date emprunt (LOAN info)



    public Support(String numSupport,SupportFormat format, List<Document> doc) {
        this.setNumSupport(numSupport);
        this.setIdSupportFormat(format.getIdSupportFormat());
        this.setSupportName(format.getSupportName());
        this.setSupportType(format.getSupportType().getSupportTypeName());
        this.setDisposition(format.getSupportType().getDisposition());
        this.setDuration(format.getDuration());
        this.setSize(format.getSize());
        this.setColor(format.getColor());
        this.setDoc(doc);
    }


    public List<Document> getDoc() {
        return doc;
    }

    public void setDoc(List<Document> doc) {
        this.doc = doc;
    }

    public String getNumSupport() {
        return numSupport;
    }

    public void setNumSupport(String numSupport) {
        this.numSupport = numSupport;
    }

    public String getIdSupportFormat() {
        return idSupportFormat;
    }

    public void setIdSupportFormat(String idSupportFormat) {
        this.idSupportFormat = idSupportFormat;
    }

    public String getSupportName() {
        return supportName;
    }

    public void setSupportName(String supportName) {
        this.supportName = supportName;
    }

    public String getSupportType() {
        return supportType;
    }

    public void setSupportType(String supportType) {
        this.supportType = supportType;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDisposition() {
        return disposition;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }
}
