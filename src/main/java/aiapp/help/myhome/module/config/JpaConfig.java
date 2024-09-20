package aiapp.help.myhome.module.config;

import aiapp.help.myhome.AuditorAwareImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;

@Configuration
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorAware(){ //AuditorAware을 빈으로 등록
        return new AuditorAwareImpl();
    }

}
