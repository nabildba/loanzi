package ma.snrt.nayd.models;

import javax.persistence.*;

/**
 * Created by nabil on 22/01/2018.
 */
@Entity
public class SupportLastVal {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer numLastVal;
    private String idSupportFormat;
    private int year;
    private int lastVal;

    public SupportLastVal() {
    }

    public SupportLastVal(String idSupportFormat, int year, int lastVal) {
        this.setSupportFormat(idSupportFormat);
        this.setYear(year);
        this.setLastVal(lastVal);
    }


    public Integer getNumLastVal() {
        return numLastVal;
    }

    public void setNumLastVal(Integer numLastVal) {
        this.numLastVal = numLastVal;
    }

    public String getSupportFormat() {
        return idSupportFormat;
    }

    public void setSupportFormat(String idSupportFormat) {
        this.idSupportFormat = idSupportFormat;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLastVal() {
        return lastVal;
    }

    public void setLastVal(int lastVal) {
        this.lastVal = lastVal;
    }
}
