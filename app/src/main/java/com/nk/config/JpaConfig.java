//package com.nk.config;
//
//import java.util.HashMap;
//import java.util.Map;
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
///**
// * @author : nk
// * @date : Created on 2017/9/22.
// */
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories("com.nk.repository")
//public class JpaConfig {
//
//  @Autowired
//  Environment env;
//
//  @Bean(name = "datasource")
//  public DataSource dataSource() throws Exception {
//    DriverManagerDataSource dataSource = new DriverManagerDataSource();
//    dataSource.setUrl(env.getProperty("spring.datasource.url"));
//    dataSource.setUsername(env.getProperty("spring.datasource.username"));
//    dataSource.setPassword(env.getProperty("spring.datasource.password"));
//    dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
//    return dataSource;
//  }
//
//  @Bean
//  public EntityManagerFactory entityManagerFactory() throws Exception {
//    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//    LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//    factory.setJpaVendorAdapter(vendorAdapter);
//    //此处com.example.*.model是你的java bean所在的包名
//    factory.setPackagesToScan("com.nk.model");
//    factory.setDataSource(dataSource());
//    Map<String, Object> jpaProperties = new HashMap<String, Object>();
//    jpaProperties.put("hibernate.ejb.naming_strategy", "org.hibernate.cfg.ImprovedNamingStrategy");
//    jpaProperties.put("hibernate.jdbc.batch_size", 50);
//    factory.setJpaPropertyMap(jpaProperties);
//    factory.afterPropertiesSet();
//    return factory.getObject();
//  }
//
//  @Bean(name = "transactionManager")
//  public PlatformTransactionManager annotationDrivenTransactionManager() {
//    return new JpaTransactionManager();
//  }
//
//
//}
