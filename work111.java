public class work111 {
    public static void main(String[] args) {
        Dog2 dogs = new Dog2();
        dogs.setName("シロ");
        dogs.setKenshu("柴犬");
        
        dogs.showName();
        dogs.showKenshu();
        
        dogs.setName("ハナ");
        dogs.setKenshu("チワワ");
        
        dogs.showName();
        dogs.showKenshu();
    }
}
