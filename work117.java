public class work117 {
    public static void main (String[] args) {
    	Validation v = new Validation();
    	String name1 = "yamada";
        if(v.isRequired(name1)){
            System.out.println("name1:OK");
        } else {
            System.out.println("name1:値が設定されていません");
        }
        
        String name2 = "";
        if(v.isRequired(name2)){
            System.out.println("name2:OK");
        } else {
            System.out.println("name2:値が設定されていません");
        }
        String age1 = "23";
        if(v.isInt(age1)){
            System.out.println("age1:OK");
        } else {
            System.out.println("age1:数値ではありません");
        }
        
        String age2 = "abc";
        if(v.isInt(age2)){
            System.out.println("age2:OK");
        } else {
            System.out.println("age2:数値ではありません");
        }

        int hour1 = 5;
        if(v.isBetween(hour1)){
            System.out.println("hour1:OK");
        } else {
            System.out.println("hour1:1～24の範囲外です");
        }
        
        int hour2 = 30;
        if(v.isBetween(hour2)){
            System.out.println("hour2:OK");
        } else {
            System.out.println("hour2:1～24の範囲外です");
        }


    }
}
