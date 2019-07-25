package com.test.proFilters;

import org.sitemesh.config.ConfigurableSiteMeshFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class Webconfig extends WebMvcConfigurerAdapter {
	
	@Bean
    public FilterRegistrationBean siteMeshFilter(){
        FilterRegistrationBean fitler = new FilterRegistrationBean();
        ConfigurableSiteMeshFilter siteMeshFilter = new ConfigurableSiteMeshFilter();
        fitler.setFilter(siteMeshFilter);
        return fitler;
    }
	
}
