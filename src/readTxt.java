import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Qiaxin
 * @description:
 * @Date: Create in 12:04 2017-12-26
 * @Modified:
 */

public class readTxt {
    /**
     * @Author: Qiaxin
     * @description: 读取txt文件为String数组
     */
    public List<String> readTxt(File file){
        List<String> messagelist = new ArrayList<>();
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file),"UTF-8");
            BufferedReader br = new BufferedReader(reader);
            String line = "";
            while ((line = br.readLine()) != null) {
                messagelist.add(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return messagelist;
    }
}
