package com.gzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.util.pattern.PathPatternParser;

@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    private static final Long MAX_TIME = 6 * 60 * 100L;
    /**
     * 配置跨域
     * @return
     */
    @Bean
    public CorsWebFilter corsFilter() {

        CorsConfiguration config = new CorsConfiguration();
        // cookie跨域
        //config.setAllowCredentials(Boolean.TRUE);   //允许Cookie跨域
        config.addAllowedOrigin("*");//http://localhost:5555
        config.addAllowedHeader("*"); // 允许任何标头
        config.addAllowedMethod("*"); // 允许任何HTTP方法
        config.setMaxAge(MAX_TIME);

        //跨域解析器
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(new PathPatternParser());
        source.registerCorsConfiguration("/**", config); //所有请求路径都支持跨域
        return new CorsWebFilter(source);
    }
}
