package endorphin;

import endorphin.selftag.beans.City;
import endorphin.selftag.beans.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Object student = applicationContext.getBean("student");
//        System.out.println(student);
        System.out.println(applicationContext.getBean(User.class));;
        System.out.println(applicationContext.getBean(City.class));;
    }
}
