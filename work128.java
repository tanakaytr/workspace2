class work128 {
    public static void main (String[] args) {
        Magician magician = new Magician("山田");
        magician.fight();
        magician.useMagic();
        magician.useTool();
        magician.run();
        
        show("==========");
        
        Yusha yusha = new Yusha("佐藤");
        yusha.fight();
        yusha.useMagic();
        yusha.useTool();
        yusha.run();
    }
    
    static void show(Object o) {
        System.out.println(o);
    }
}
