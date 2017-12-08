//package com.nk.config;
//
//import java.beans.PropertyVetoException;
//import javax.sql.DataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
///**
// * Created by JianHuangsh on 2017/12/8.
// */
//@Configuration
//public class DataSourceConfig {
//
//  @Autowired
//  Environment env;
//
//  @Bean(name = "datasource")
//  public DataSource dataSource() throws PropertyVetoException {
//    DriverManagerDataSource dataSource = new DriverManagerDataSource();
//    dataSource.setUrl(env.getProperty("spring.datasource.url"));
//    dataSource.setUsername(env.getProperty("spring.datasource.username"));
//    dataSource.setPassword(env.getProperty("spring.datasource.password"));
//    dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
//    return dataSource;
//  }
//
//
//}
