interface A4 {
    public void exeA4();
}
class B4 implements A4 {
    public void exeA4(){
        System.out.println("A4");
    }
}
class work144 {
    public static void main (String[] args) {
        B4 b4 = new B4();
        show(b4);
    }
    public static void show(B4 b4) {
        b4.exeA4();
    }
}
