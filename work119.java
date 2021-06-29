public class work119 {
    public static void main (String[] args) {
    	//半径
        int r = 6;
        
        double area = MyCircle.getArea(r);
        System.out.println("面積：" + area);
        
        double circum = MyCircle.getCircumference(r);
        System.out.println("円周：" + circum);
    }
}