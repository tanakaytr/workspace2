interface A3 {
    public void exeA3();
}
interface B3 extends A3 {
    public void exeB3();
}
class C3 implements B3 {
    public void exeA3(){
        System.out.println("A3");
    }
    public void exeB3(){
        System.out.println("B3");
    }
}
class work143 {
    public static void main (String[] args) {
        C3 c = new C3();
        c.exeA3();
        c.exeB3();
    }
}
