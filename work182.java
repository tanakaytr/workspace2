import java.io.*;
import java.net.*;

public class work182 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("使用法：java Work2 URL 書き込みファイル名");
            System.out.println("例：java Work2 http://www.yahoo.co.jp/ yahoo.html");
            System.exit(0);
        }
        String url = args[0];
        String filename = args[1];

        try {
            URL myUrl = new URL(url);
            BufferedReader reader = new BufferedReader(
                                        new InputStreamReader(myUrl.openStream()));
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line); //ここの修正
            }
            reader.close();
        } catch (MalformedURLException e) {
            System.out.println("URLの形式が誤っています：" + e);
        } catch (IOException e) {
            System.out.println("I/Oエラーです：" + e);
        }
    }
}

