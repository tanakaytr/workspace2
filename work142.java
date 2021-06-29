interface A {
    public void exeA();
}
interface B {
    public void exeB();
}
class C implements A, B {
    public void exeA(){
        System.out.println("A");
    }
    public void exeB(){
        System.out.println("B");
    }
}
class work142 {
    public static void main (String[] args) {
        C c = new C();
        c.exeA();
        c.exeB();
    }
}
