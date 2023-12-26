package com.example.pdfbackend.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class OpenApiConfig {
    @Bean
    public OpenAPI springOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("PDF Generator")
                        .description("Application to create PDF")
                        .contact(new Contact().name("Rashid").url("https://github.com/rashidintheworld"))
                        .version("v1"))
                .externalDocs(new ExternalDocumentation()
                        .description("itext Website")
                        .url("https://itextpdf.com/"));
    }
}
