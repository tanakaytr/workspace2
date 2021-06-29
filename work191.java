import java.util.*;
import java.io.*;

public class work191 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        
        ArrayList<String> lists = new ArrayList<String>();
        
        System.out.println("==== 入力を開始します ====");
        
        try{
            while(true) {
                line = reader.readLine();
                if(line.equals("")) { break; }
                lists.add(line);
            }
            
            System.out.println("==== lists内を表示します ====");
            
            for(String s: lists) {
                System.out.println(s);
            }
        } catch(IOException ex) {
            System.out.println("入力エラーが発生しました");
        }
    }
}

