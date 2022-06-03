package com.example.springbootproject;

import com.googlecode.objectify.ObjectifyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;

@Configuration
@WebFilter
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

    @Bean
    public FilterRegistrationBean<ObjectifyFilter> objectifyFilterRegistration() {
        final FilterRegistrationBean<ObjectifyFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new ObjectifyFilter());
        registration.addUrlPatterns("/objectify");
        registration.setOrder(1);
        return registration;
    }
}
