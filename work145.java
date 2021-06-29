interface A5 {
    public void exeA5();
}
interface B5 {
    public void exeB5();
}
class C5 implements A5, B5 {
    public void exeA5(){
        System.out.println("A5");
    }
    public void exeB5(){
        System.out.println("B5");
    }
}
class work145 {
    public static void main (String[] args) {
        //A5型の変数
        A5 a5 = new C5();
        a5.exeA5();
        //コンパイルエラー
        //a5.exeB5();
        
        //B5型の変数
        B5 b5 = new C5();
        b5.exeB5();
        //コンパイルエラー
        //b5.exeA5();
        
        //C5型の変数
        C5 c5 = new C5();
        c5.exeA5();
        c5.exeB5();
    }
}
