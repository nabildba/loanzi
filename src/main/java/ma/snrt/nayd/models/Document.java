package ma.snrt.nayd.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by nabil on 04/12/2017.
 */
@Entity
@Table(name = "docs")
public class Document {
    @Id
    private Long idCont;
    private String idTech;
    private String title;
    private String shorttitle;
    private String gender;
    private String subgender;
    @Temporal(TemporalType.DATE)
    private Date dcreation;
    @Temporal(TemporalType.DATE)
    private Date dateEntree;
    @Temporal(TemporalType.DATE)
    private Date premiereDiff;
    @Temporal(TemporalType.DATE)
    private Date dateProd;
    private Long nbrEpisodes;
    private String droits;
    private String noteTechnique;
    private String materiel;
    private Long duration;
    private String resume;
    private String sequences;
    private String commentaires;
    private String creditsCap;
    private String tags;
    private String chaineFirstDiff;
    private String collection;
    private String langues;
    private String producteur;
    private String executeur;
    private String coproducteur;
    private String natureProd;
    private String lieu;
    private String organismes;
    private String genre;
    private String personalites;
    private String credit;
    private String rediffs;
    private String subtitle;
    //lise des supports to test
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private List<String> supports;

    public Document() {
    }

    public Document(Long idCont, String idTech, String title, String subtitle,
                    String shorttitle, String gender, String subgender, Date dcreation, Date dateEntree,
                    Date premiereDiff, Date dateProd, Long nbrEpisodes, String droits, String noteTechnique,
                    String materiel, Long duration, String resume, String sequences, String commentaires,
                    String creditsCap, String tags, String chaineFirstDiff, String collection, String langues,
                    String producteur, String executeur, String coproducteur, String natureProd, String lieu,
                    String organismes, String genre, String personalites, String credit, String rediffs) {
        this.idCont = idCont;
        this.idTech = idTech;
        this.title = title;
        this.shorttitle = shorttitle;
        this.gender = gender;
        this.subgender = subgender;
        this.dcreation = dcreation;
        this.dateEntree = dateEntree;
        this.premiereDiff = premiereDiff;
        this.dateProd = dateProd;
        this.nbrEpisodes = nbrEpisodes;
        this.droits = droits;
        this.noteTechnique = noteTechnique;
        this.materiel = materiel;
        this.duration = duration;
        this.resume = resume;
        this.sequences = sequences;
        this.commentaires = commentaires;
        this.creditsCap = creditsCap;
        this.tags = tags;
        this.chaineFirstDiff = chaineFirstDiff;
        this.collection = collection;
        this.langues = langues;
        this.producteur = producteur;
        this.executeur = executeur;
        this.coproducteur = coproducteur;
        this.natureProd = natureProd;
        this.lieu = lieu;
        this.organismes = organismes;
        this.genre = genre;
        this.personalites = personalites;
        this.credit = credit;
        this.rediffs = rediffs;
        this.subtitle = subtitle;
    }

    public Long getIdCont() {
        return idCont;
    }

    public void setIdCont(Long idCont) {
        this.idCont = idCont;
    }

    public String getIdTech() {
        return idTech;
    }

    public void setIdTech(String idTech) {
        this.idTech = idTech;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShorttitle() {
        return shorttitle;
    }

    public void setShorttitle(String shorttitle) {
        this.shorttitle = shorttitle;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSubgender() {
        return subgender;
    }

    public void setSubgender(String subgender) {
        this.subgender = subgender;
    }

    public Date getDcreation() {
        return dcreation;
    }

    public void setDcreation(Date dcreation) {
        this.dcreation = dcreation;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Date getPremiereDiff() {
        return premiereDiff;
    }

    public void setPremiereDiff(Date premiereDiff) {
        this.premiereDiff = premiereDiff;
    }

    public Date getDateProd() {
        return dateProd;
    }

    public void setDateProd(Date dateProd) {
        this.dateProd = dateProd;
    }

    public Long getNbrEpisodes() {
        return nbrEpisodes;
    }

    public void setNbrEpisodes(Long nbrEpisodes) {
        this.nbrEpisodes = nbrEpisodes;
    }

    public String getDroits() {
        return droits;
    }

    public void setDroits(String droits) {
        this.droits = droits;
    }

    public String getNoteTechnique() {
        return noteTechnique;
    }

    public void setNoteTechnique(String noteTechnique) {
        this.noteTechnique = noteTechnique;
    }

    public String getMateriel() {
        return materiel;
    }

    public void setMateriel(String materiel) {
        this.materiel = materiel;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getSequences() {
        return sequences;
    }

    public void setSequences(String sequences) {
        this.sequences = sequences;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public String getCreditsCap() {
        return creditsCap;
    }

    public void setCreditsCap(String creditsCap) {
        this.creditsCap = creditsCap;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getChaineFirstDiff() {
        return chaineFirstDiff;
    }

    public void setChaineFirstDiff(String chaineFirstDiff) {
        this.chaineFirstDiff = chaineFirstDiff;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getLangues() {
        return langues;
    }

    public void setLangues(String langues) {
        this.langues = langues;
    }

    public String getProducteur() {
        return producteur;
    }

    public void setProducteur(String producteur) {
        this.producteur = producteur;
    }

    public String getExecuteur() {
        return executeur;
    }

    public void setExecuteur(String executeur) {
        this.executeur = executeur;
    }

    public String getCoproducteur() {
        return coproducteur;
    }

    public void setCoproducteur(String coproducteur) {
        this.coproducteur = coproducteur;
    }

    public String getNatureProd() {
        return natureProd;
    }

    public void setNatureProd(String natureProd) {
        this.natureProd = natureProd;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getOrganismes() {
        return organismes;
    }

    public void setOrganismes(String organismes) {
        this.organismes = organismes;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPersonalites() {
        return personalites;
    }

    public void setPersonalites(String personalites) {
        this.personalites = personalites;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getRediffs() {
        return rediffs;
    }

    public void setRediffs(String rediffs) {
        this.rediffs = rediffs;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @Override
    public String toString() {
        return "Document{" +
                "idCont=" + idCont +
                ", idTech='" + idTech + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public List<String> getSupports() {
        return supports;
    }

    public void setSupports(List<String> supports) {
        this.supports = supports;
    }
}
