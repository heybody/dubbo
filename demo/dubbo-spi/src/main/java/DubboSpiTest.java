import com.cares.services.CarInterface;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * @program: dubbo-parent
 * @description:
 * @author: Mr.Wang
 * @create: 2020-09-22 20:19
 **/
public class DubboSpiTest {
    public static void main(String[] args) {
        ExtensionLoader<CarInterface> loader = ExtensionLoader.getExtensionLoader(CarInterface.class);
        CarInterface car = loader.getExtension("cares");
        car.open();
    }
}
