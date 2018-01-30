package pp.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pp.dubbo.demo.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        UserService demoService = context.getBean(UserService.class);
        System.out.println("consumer");
        System.out.println(demoService.getName("喻喻喻"));
    }
}
