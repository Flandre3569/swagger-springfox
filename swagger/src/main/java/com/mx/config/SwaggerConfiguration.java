package com.mx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
    /**
     * 创建Docket类型的对象，并使用spring容器管理
     * Docket是Swagger中全局配置对象
     * @return
     */
    @Bean
    public Docket docket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

//        API帮助文档的描述信息  information
//        配置swagger文档主体内容
        ApiInfo apiInfo = new ApiInfoBuilder()
                .contact(new Contact("Coisini_mx","暂无","XXXX"))
                .title("SpringBoot-Swagger-Demo开发文档")
                .description("Swagger框架学习帮助文档详细描述-Swagger框架是一个用于开发RestAPI帮助文档的框架")
                .version("1.1")
                .build();
//        给docket上下文配置api描述信息
        docket.apiInfo(apiInfo);

//        获取docket中的选择器，构建选择器。比如：扫描什么包的注解
        docket.select().apis(RequestHandlerSelectors.basePackage("com.mx.controller")); // 设定扫描哪个包中的注解(包含其子包)
        return docket;
    }
}
