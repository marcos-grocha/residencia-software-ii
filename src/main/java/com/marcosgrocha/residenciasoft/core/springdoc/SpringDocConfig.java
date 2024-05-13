package com.marcosgrocha.residenciasoft.core.springdoc;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;

@Configuration
public class SpringDocConfig {
    
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title("Residência de Software II")
                    .version("v1.1")
                    .description("Modelo básico de um CRUD")
                ).externalDocs(new ExternalDocumentation()
                        .description("marcosgrocha - github")
                        .url("https://github.com/marcos-grocha")
                ).tags(Arrays.asList(
                    new Tag().name("API - CRUD").description("Create, Read, Update e Delete"),
                    new Tag().name("Tag Extra").description("Extras")
                    )
                );
    }
}
