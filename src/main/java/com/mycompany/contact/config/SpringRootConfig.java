
package com.mycompany.contact.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author 55ans
 */

@Configuration
@ComponentScan(basePackages = {"com.mycompany.capp.dao","com.mycompany.contact.service"})
public class SpringRootConfig {
    //TODO:
    
    @Bean
    public BasicDataSource getDataSource(){
     BasicDataSource ds = new BasicDataSource();
     ds.setDriverClassName("com.mysql.jdbc.Driver");
     ds.setUrl("jdbc:mysql://localhost:3306/capp_db");
     ds.setUsername("root");
     ds.setPassword("");
     ds.setMaxTotal(2);
     ds.setInitialSize(1);
     ds.setTestOnBorrow(true);
     ds.setValidationQuery("SELECT 1");
     ds.setDefaultAutoCommit(true);
     return ds;
       
   }
}
