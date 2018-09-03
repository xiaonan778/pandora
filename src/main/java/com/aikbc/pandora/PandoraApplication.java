package com.aikbc.pandora;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

@SpringBootApplication
public class PandoraApplication extends WebMvcConfigurationSupport{
	
	private static final Logger log = LoggerFactory.getLogger(PandoraApplication.class);

    @Bean
    public ServletRegistrationBean druidServlet() {
    	log.info("init Druid Servlet Configuration ");
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new StatViewServlet());
        servletRegistrationBean.addUrlMappings("/druid/*");
        Map<String, String> initParameters = new HashMap<String, String>();
        initParameters.put("loginUsername", "admin");// 用户名
        initParameters.put("loginPassword", "admin");// 密码
        initParameters.put("resetEnable", "false");// 禁用HTML页面上的“Reset All”功能
        initParameters.put("allow", ""); // IP白名单 (没有配置或者为空，则允许所有访问)
        // initParameters.put("deny", "192.168.20.38");// IP黑名单
        // (存在共同时，deny优先于allow)
        servletRegistrationBean.setInitParameters(initParameters);
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }

    /**
     * 1、 extends WebMvcConfigurationSupport 2、重写下面方法; setUseSuffixPatternMatch:
     * 
     * 设置是否是后缀模式匹配，如“/user”是否匹配/user.*，默认真即匹配； setUseTrailingSlashMatch:
     * 设置是否自动后缀路径模式匹配，如“/user”是否匹配“/user/”，默认真即匹配；
     */
    protected void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseSuffixPatternMatch(false).setUseTrailingSlashMatch(true);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(PandoraApplication.class);
	}

}
