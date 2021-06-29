public class work103 {
    public static void main(String[] args) {
        Car[] cars = new Car[]{
            new Car("プリウス", "トヨタ"),
            new Car("インサイト", "ホンダ"),
            new Car("レガシー", "スバル"),
        };
        
        System.out.println("名前\tメーカ\t金額");
        
        cars[0].setPrice(230);
        cars[1].setPrice(250);
        cars[2].setPrice(320);
        
        for(int i=0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}

