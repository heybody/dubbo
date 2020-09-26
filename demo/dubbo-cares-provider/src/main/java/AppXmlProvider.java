import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: demo
 * @description:
 * @author: Mr.Wang
 * @create: 2020-09-25 22:45
 **/
public class AppXmlProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        context.start();
        System.in.read();

    }
}
