package endorphin;

import endorphin.context.MyClassPathXmlApplicationContext;
import endorphin.selfEditor.beans.Person;
import endorphin.selftag.beans.City;
import endorphin.selftag.beans.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Object student = applicationContext.getBean("student");
//        System.out.println(student);
//        System.out.println(applicationContext.getBean(User.class));;
//        System.out.println(applicationContext.getBean(City.class));;
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext1.xml");
//        System.out.println(applicationContext.getBean(Person.class));;
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        System.out.println(applicationContext.getBean(Person.class));;
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
//        ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("applicationContext3.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext4.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext5.xml");
    }
}
