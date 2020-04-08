package com.zhouyou.sb.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfigurer {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zhouyou.sb.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("mySpringBoot 使用Swagger2构建RESTful APIs")
                .description("更多Spring Boot相关文章请关注：https://juejin.im/user/59e7fb9451882578e1406a51/posts")
                .termsOfServiceUrl("https://juejin.im/user/59e7fb9451882578e1406a51/posts")
                .contact(new Contact("zhouyou", "https://gitee.com/beany/mySpringBoot", null))
                .version("1.0")
                .build();
    }

}
