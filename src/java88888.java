import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author: Qiaxin
 * @description:
 * @Date: Create in 12:01 2018-1-6
 * @Modified:
 */

public class java88888 {

    public static void main(String[] args)
    {
        /*List<String> list = new ArrayList<>();
        list.add("111");
        list.add("111");
        list.add("111");
        list.add("111");
        list.add("111");
        list.add("111");
list.forEach((s)-> System.out.println(s));*/
       /* Date date=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy'年'MM'月'dd'日'");
        System.out.println(s.format(date));
        String str1=s.format(date);//当前的时间

        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 90);//计算30天后的时间
        String str2=s.format(c.getTime());
        System.out.println("30天后的时间是："+str2);*/
        System.out.println(System.currentTimeMillis());
    }
}
