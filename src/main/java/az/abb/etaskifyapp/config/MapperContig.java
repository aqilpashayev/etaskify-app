package az.abb.etaskifyapp.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperContig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
