import java.util.Stack;

/**
 * @Author: Qiaxin
 * @description:
 * @Date: Create in 15:58 2018-5-21
 * @Modified:
 */

public class SysConvertUtil {

    private static char[] charSet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

    /**
     * 将10进制转化为62进制
     * @param number
     * @return
     */
    public static String _10_to_62(long number){
        Long rest=number;
        Stack<Character> stack=new Stack<Character>();
        StringBuilder result=new StringBuilder(0);
        while(rest!=0){
            stack.add(charSet[new Long((rest-(rest/62)*62)).intValue()]);
            rest=rest/62;
        }
        for(;!stack.isEmpty();){
            result.append(stack.pop());
        }
        int result_length = result.length();
        StringBuilder temp0 = new StringBuilder();
        for(int i = 0; i < 7 - result_length; i++){
            temp0.append('0');
        }

        return temp0.toString() + result.toString();

    }


    /**
     * 将62进制转换成10进制数
     *
     * @param ident62
     * @return
     */
    public static long convertBase62ToDecimal( String ident62 ) {
        long decimal = 0;
        int base = 62;
        int keisu = 0;
        int cnt = 0;

        byte ident[] = ident62.getBytes();
        for ( int i = ident.length - 1; i >= 0; i-- ) {
            int num = 0;
            if ( ident[i] > 48 && ident[i] <= 57 ) {
                num = ident[i] - 48;
            }
            else if ( ident[i] >= 65 && ident[i] <= 90 ) {
                num = ident[i] - 65 + 10;
            }
            else if ( ident[i] >= 97 && ident[i] <= 122 ) {
                num = ident[i] - 97 + 10 + 26;
            }
            keisu = (int) Math.pow( (double) base, (double) cnt );
            decimal += num * keisu;
            cnt++;
        }
        return decimal ;
    }
    public static void main(String[] args) {
        long tim = System.currentTimeMillis()+(int)(Math.random()*100000000);
        System.out.println(tim);
        System.out.println("62System=" +_10_to_62(tim));
        System.out.println("10System=" +convertBase62ToDecimal("QspfZX7"));
    }

}
