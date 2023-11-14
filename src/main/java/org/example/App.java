package org.example;

import org.example.entities.Goal;
import org.example.entities.User;
import org.example.repositories.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        User user = (User) context.getBean("user");
//        Goal goal = (Goal) context.getBean("goal");
//
//        ServiceProgressTracker service = new ServiceProgressTracker(user, goal);
//
//        UserRepository userRepository = context.getBean(UserRepository.class);
//
//        List<User> list = userRepository.findAll();
//        for (User user1 : list) {
//            System.out.println(user1);
//        }
    }
}
