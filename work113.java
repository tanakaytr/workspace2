public class work113 {
    public static void main(String[] args) {
        Panda p1 = new Panda();
        p1.name = "パンダちゃん";
        p1.age = 1;
        p1.seibetsu = "未定";
        Panda p2 = new Panda("ランラン", 2, "女");
        
        System.out.println("name : " + p2.name + "\n" + 
        "age : " + p2.age + "\n" + "seibetsu : " + p2.seibetsu
        		);
        System.out.println("name : " + p1.name + "\n" + 
                "age : " + p1.age + "\n" + "seibetsu : " + p1.seibetsu
                		);
    }
}
