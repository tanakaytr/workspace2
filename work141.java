interface X {
    public void exe();
}
class Y implements X {
    public void exe() {
        System.out.println("Y");
    }
}
class Z extends Y {
    public void exe() {
        System.out.println("Z");
    }
}
class work141 {
    public static void main (String[] args) {
        Y y = new Y();
        y.exe();
        Z z = new Z();
        z.exe();
    }
}
