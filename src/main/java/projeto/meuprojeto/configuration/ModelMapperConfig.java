package projeto.meuprojeto.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Específica para classes que definem beans. Ela é escaneada pelo Spring e seus métodos @Bean são processados para instanciar e configurar os beans.
public class ModelMapperConfig {

    @Bean // Usada para definir um método dentro de uma classe @Configuration
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
