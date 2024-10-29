package api.trivia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("\n" +
                                "\uD83C\uDF83 Backend Challenge (Java): API for a Halloween Trivia! \uD83C\uDF83")
                        .version("1.0.0")
                        .description("👻 Theme: Develop a RESTful API in Java for a trivia game with questions about Halloween myths and legends. The API should manage questions and answers related to Halloween.👻")
                );
    }
}