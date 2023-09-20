package com.generation.EdeTodos.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.responses.ApiResponses;
import org.springdoc.core.customizers.OpenApiCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI springEdeTodosOpenAPI (){
        return new OpenAPI()
                .info(new Info()
                        .title("Projeto É de Todos")
                        .description("Projeto de plataforma complementar educacional ")
                        .version("v0.0.1")
                        .license(new License()
                                .name("Generation Brasil")
                                .url("https//brazil.generation.org/"))
                        .contact (new Contact()
                                .name("É de Todos")
                                .url("https://github.com/Projeto-Integrador-E-de-Todos")
                                .email("projetoedetodos@gmail.com")));
    }

    @Bean
    OpenApiCustomizer customerGlobalHeaderOPenApiCustomiser(){

        return openApi -> {
            openApi.getPaths().values().forEach(pathItem -> pathItem.readOperations()
                    .forEach(operation -> {

                        ApiResponses apiResponses = operation.getResponses();

                        apiResponses.addApiResponse("200", createApiResponse("Sucesso!"));
                        apiResponses.addApiResponse("201", createApiResponse("Objeto Persistido!"));
                        apiResponses.addApiResponse("204", createApiResponse("Objeto Excluído!"));
                        apiResponses.addApiResponse("400", createApiResponse("Erro na Requisição!"));
                        apiResponses.addApiResponse("401", createApiResponse("Acesso Não Autorizado!"));
                        apiResponses.addApiResponse("403", createApiResponse("Acesso Proibido!"));
                        apiResponses.addApiResponse("404", createApiResponse("Objeto Não Encontrado!"));
                        apiResponses.addApiResponse("500", createApiResponse("Erro na Aplicação!"));
                    }));
        };
    }

    private ApiResponse createApiResponse(String message) {

        return new ApiResponse().description(message);
    }
}
