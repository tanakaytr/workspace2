import java.io.*;
import java.net.*;

public class work183 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用法：java Work3 URL 書き込みファイル名");
            System.out.println("例：java Work3 http://no1s.biz/kenshu/image/no1solutions.png image.png");
            System.exit(0);
        }
        String url = args[0];
        String filename = args[1];
        
        try {
            URL myUrl = new URL(url);
            DataInputStream input = new DataInputStream(
                                       new BufferedInputStream(myUrl.openStream()));
            BufferedOutputStream output = new BufferedOutputStream(
                                             new FileOutputStream(filename));
            byte[] b = new byte[1024];
            int lenght = 0;
            
            while((lenght = input.read(b)) > 0){
                output.write(b);
            }
            input.close();
            output.close();            
        } catch (MalformedURLException e) {
            System.out.println("URLの形式が誤っています：" + e);
        } catch (IOException e) {
            System.out.println("I/Oエラーです：" + e);
        }
    }
}

