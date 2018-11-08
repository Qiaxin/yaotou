import sun.nio.cs.UTF_32;

import java.text.DecimalFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: Qiaxin
 * @description:
 * @Date: Create in 12:25 2017-12-26
 * @Modified:
 */

public class dateTest {
    public static void main(String args[]) throws Exception{
        System.out.println(ReadVideoSize(1023L));

    }
    private static String ReadVideoSize(Long source) {
        String length = "";
        DecimalFormat dFormat = new DecimalFormat("#.00");
        String yearString = dFormat.format(source);
        Double temp = Double.valueOf(yearString);
        if (source > 0) {
            Double result = temp / 1024;
            if (result < 1024) {
                length = dFormat.format(result) + " KB";
                return length;
            }else{
                result = result / 1024;
                if (result < 1024) {
                    length = dFormat.format(result) + " MB";
                    return length;
                } else {
                    result = result / 1024;
                    length = dFormat.format(result) + " GB";
                    return length;
                }
            }
        }
        return "0KB";
    }

    public static String  deleteEnter(String str) {

        if (str.startsWith("\r\n")) {
            str= str.substring(2, str.length());
        }
        if (str.endsWith("\r\n")) {
            str=   str.substring(0,str.length()-2);
        }
        if (str.startsWith("\n")) {
            str=  str.substring(1, str.length());

        }
        if (str.endsWith("\n")&&!str.endsWith("\r\n")) {
            str=  str.substring(0,str.length()-1);
        }
        if(!str.startsWith("\r\n")&&!str.startsWith("\n")&&!str.endsWith("\r\n")&&!str.endsWith("\n")){
            return str;
        }else{
            str=deleteEnter(str);
            return str;
        }

    }
    public static String generateSignature( Map<String, String> data, String key) throws Exception {
        Set<String> keySet = data.keySet();
        String[] keyArray = keySet.toArray(new String[keySet.size()]);
        Arrays.sort(keyArray);
        StringBuilder sb = new StringBuilder();
        for (String k : keyArray) {

            if (data.get(k).trim().length() > 0) // 参数值为空，则不参与签名
                sb.append(k).append("=").append(data.get(k).trim()).append("&");
        }
        sb.append("key=").append(key);
       return null;
    }
}
