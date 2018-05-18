package ma.snrt.nayd.repositories;

import ma.snrt.nayd.models.SupportFormat;
import ma.snrt.nayd.models.SupportType;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "details", types=SupportType.class)
public interface SuppTypeDetails {
    public Integer getIdSupportType();
    public String getSupportTypeName();
    public String getUsageType();
    public List<SupportFormat> getSupportFormats();
    public String getDisposition();
    public Integer getActive();
}
