
package com.mycompany.capp.test;

import com.mycompany.capp.dao.UserDAO;
import com.mycompany.contact.config.SpringRootConfig;
import com.mycompany.contact.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDAOFindSingleRecord {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
    UserDAO userDAO = ctx.getBean(UserDAO.class);
    
    User u = userDAO.findById(1);
    System.out.println("---------User Details-----");
    System.out.println(u.getUserId());
    System.out.println(u.getName());
    System.out.println(u.getPhone());
    System.out.println(u.getEmail());
    System.out.println(u.getAddress());
    System.out.println(u.getLoginName());
    System.out.println(u.getLoginStatus());
    System.out.println(u.getRole());
    
    }
    
}
