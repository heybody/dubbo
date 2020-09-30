import com.cares.services.CarInterface;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

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

        Map<String, String> mapW = new HashMap<>();
        mapW.put("car", "who");
        URL urlW = new URL("", "", 1, mapW);

        Map<String, String> mapC = new HashMap<>();
        mapC.put("car", "cares");
        URL urlC = new URL("", "", 1, mapC);
        CarInterface ttcar = loader.getExtension("ttcar");
        ttcar.move(urlW);
        ttcar.move(urlC);
//        ttcar.open();
//        ServiceLoader<CarInterface> sl = ServiceLoader.load()
    }
}
