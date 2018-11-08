import java.util.*;

public class Test {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        Map<String, Object> result = new HashMap<>();
        result.put("ToUserName", "toUserName");
        result.put("FromUserName", "fromUserName");
        Date date = new Date();
        result.put("CreateTime", date.getTime());
            result.put("MsgType", "text");
            result.put("content","123");
        sb.append("<xml>");
        mapToXML(result, sb);
        sb.append("</xml>");

        System.out.println(sb.toString());
    }
    private static void mapToXML(Map map, StringBuffer sb) {
        Set set = map.keySet();

        for (Iterator it = set.iterator(); it.hasNext();) {
            String key = (String) it.next();
            Object value = map.get(key);
            if (null == value)
                value = "";
            if (value.getClass().getName().equals("java.util.ArrayList")) {
                ArrayList list = (ArrayList) map.get(key);
                sb.append("<" + key + ">");
                for (int i = 0; i < list.size(); i++) {
                    HashMap hm = (HashMap) list.get(i);
                    mapToXML(hm, sb);
                }
                sb.append("</" + key + ">");

            } else {
                if (value instanceof HashMap) {
                    sb.append("<" + key + ">");
                    mapToXML((HashMap) value, sb);
                    sb.append("</" + key + ">");
                } else {
                    sb.append("<" + key + ">" + value + "</" + key + ">");
                }

            }

        }

    }
}