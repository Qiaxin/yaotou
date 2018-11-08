/**
 * @Author: Qiaxin
 * @description:
 * @Date: Create in 12:17 2018-3-26
 * @Modified:
 */

public class Unicode {
    public static void main(String[] args){
        String test = "\\u4f60\\u5173\\u4e8e\\u8bfe\\u7a0b\\u005c\\u0023\\u005c\\u0023\\u005c\\u0023\\u005c\\u0023\\u5df2\\u88ab\\u002a\\u002a\\u002a\\u002a\\u5220\\u9664";
        String result = convert(test);
        System.out.println(result);
    }
    public static String convert(String utfString){
        StringBuilder sb = new StringBuilder();
        int i = -1;
        int pos = 0;

        while((i=utfString.indexOf("\\u", pos)) != -1){
            sb.append(utfString.substring(pos, i));
            if(i+5 < utfString.length()){
                pos = i+6;
                sb.append((char)Integer.parseInt(utfString.substring(i+2, i+6), 16));
            }
        }
      //  sb.append(utfString.substring(pos));
        return sb.toString();
    }
}
