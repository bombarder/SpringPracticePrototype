package skillsup.practice.spring.core.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.*;

@ComponentScan(basePackages = "skillsup.practice.spring")
@ImportResource(locations = "spring/dao-context.xml")
@PropertySource(value = "auction.properties")
@Configuration
public class ApplicationConfig {

    @Bean
    public Gson getGson(){
        return new GsonBuilder().create();
    }
}
