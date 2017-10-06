package ma.snrt.nayd;


import ma.snrt.nayd.models.Rubric;
import ma.snrt.nayd.models.SupportFormat;
import ma.snrt.nayd.models.SupportType;
import ma.snrt.nayd.repositories.RubricRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

/**
 * Created by nabil on 21/09/2017.
 */
@Configuration
public class RepositoryConfig extends
        RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(
            RepositoryRestConfiguration config) {
        config.exposeIdsFor(Rubric.class, SupportType.class, SupportFormat.class);
    }
}