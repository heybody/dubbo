import com.cares.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: demo
 * @description:
 * @author: Mr.Wang
 * @create: 2020-09-25 22:43
 **/
public class AppXmlConsumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
        long timeCost = System.currentTimeMillis();
        String hello = demoService.hello();
        timeCost = System.currentTimeMillis() - timeCost;
        System.out.println(hello); // 显示调用结果
        System.out.println("timeCost:" + timeCost + "ms");
    }
}
