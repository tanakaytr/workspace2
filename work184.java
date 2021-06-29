import java.io.*;
import java.net.*;

public class work184 {
    public static void main(String[] args) {
        String url = "/java/data.txt";
        String filename = "data2.txt";
        String line;
        
        try {
            URL myUrl = new URL(url);
            BufferedReader reader = new BufferedReader(
                                        new InputStreamReader(myUrl.openStream()));
            
            PrintWriter writer = new PrintWriter(new BufferedWriter(
                                                     new FileWriter(filename)));
            
            while((line = reader.readLine()) != null) {
                //ここからlineの中身を修正していく処理を記述する
                writer.println(line);
            }
            reader.close();
            writer.close();
        } catch (MalformedURLException e) {
            System.out.println("URLの形式が誤っています：" + e);
        } catch (IOException e) {
            System.out.println("I/Oエラーです：" + e);
        }
    }
}

