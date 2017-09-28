package ma.snrt.nayd.models;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "details", types=SupportFormat.class)
public interface SuppFomatsDetails {

    String getIdSupportFormat();

    String getSupportName();

    SupportType getSupportType();

    Integer getDuration();

    String getSize();

    String getColor();

}
