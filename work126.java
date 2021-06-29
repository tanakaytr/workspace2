class work126 {
    public static void main (String[] args) {
        Book2 b1 = new Book2();
        b1.setName("ノルウェイの森");
        b1.setAuthor("村上 春樹");
        b1.setPrice(1200);
        show(b1.getName());
        show(b1.getAuthor());
        show(b1.getPrice());
        
        show("==========");
        Book2 b2 = new Book2();
        b2.setName("図書館戦争");
        b2.setAuthor("有川浩");
        b2.setPrice(720);
        show(b2.getName());
        show(b2.getAuthor());
        show(b2.getPrice());
    }
    
    static void show(Object o) {
        System.out.println(o);
    }
}
