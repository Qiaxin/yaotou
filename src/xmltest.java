import com.thoughtworks.xstream.XStream;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Qiaxin
 * @description:
 * @Date: Create in 15:50 2018-4-2
 * @Modified:
 */

public class xmltest {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
        Long m = (long) (a + b);
        System.out.println(g.equals(m));

    }

    /**
     * @Author: Qiaxin
     * @description: 读取配置文件XML并转Map
     * @Date: Create in 15:29 2018-1-29
     */
    public static Map<String, String> parseXml() {

        Map<String, String> messageMap = new HashMap<String, String>();
        InputStream inputStream = null;
        try {
            File file = new File("log4j2.xml");
            inputStream = new FileInputStream(file);
        } catch (IOException e) {

            e.printStackTrace();
        }
        SAXReader reader = new SAXReader();
        Document document = null;
        try {
            document = reader.read(inputStream);
        } catch (DocumentException e) {

            e.printStackTrace();
        }

        Element root = document.getRootElement();
        List<Element> elementsList = root.elements();

        for (Element e : elementsList) {
            messageMap.put(e.getName(), e.getText());
        }
        try {
            inputStream.close();
            // inputStream=null;
        } catch (IOException e1) {

            e1.printStackTrace();
        }

        return messageMap;
    }
}
