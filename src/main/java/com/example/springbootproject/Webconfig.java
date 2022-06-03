package com.example.springbootproject;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.servlet.http.HttpServlet;

@Configuration
public class Webconfig {

    @Bean
    public ServletRegistrationBean<HttpServlet> studentServlet() {
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.setServlet(new StudentServlet());
        servRegBean.addUrlMappings("/");
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }

    @Bean
    public ServletRegistrationBean<HttpServlet> objectifyServlet() {
        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
        servRegBean.setServlet(new ObjectifyServlet());
        servRegBean.addUrlMappings("/objectify");
        servRegBean.setLoadOnStartup(1);
        return servRegBean;
    }
}
