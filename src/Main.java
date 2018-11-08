import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {

public static void main(String[] args) throws InterruptedException {
    JOptionPane.showMessageDialog(null, "该摇头了~", "温馨提示", JOptionPane.ERROR_MESSAGE);
    while (true) {
        if (Calendar.getInstance().get(Calendar.MINUTE) == 35) {
            JOptionPane.showMessageDialog(null, "该摇头了~", "温馨提示", JOptionPane.ERROR_MESSAGE);
        }
        Thread.sleep(59000);
    }
    /*String aa = "abcdf";
    aa=aa.substring(0,aa.length()-1);
    System.out.println(aa);*/
    /*String fileName, strencoding;
    String ip = "118.85.203.22";        // 服务器IP地址
     String userName = "channel_gzqkh";        // 用户名
     String userPwd = "Cm39QTY$%^";        // 密码
     int port = 21;      // 端口号
    strencoding = "UTF-8";
    fileName = "new_updatedb_2017-12-26.txt";
    try {
        FTPClient ftp = new FTPClient();
        ftp.connect(ip,port);
        ftp.login(userName, userPwd);
        List<String> fileLists = new ArrayList<String>();
        InputStream  is = ftp.retrieveFileStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(is, strencoding));
        String line = "";
        List<String> messagelist = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            messagelist.add(line);
            System.out.println(line);
        }
        is.close();
        br.close();
        ftp.logout();
        ftp.disconnect();
    }catch (Exception e){
        e.printStackTrace();
    }*/

}
}
