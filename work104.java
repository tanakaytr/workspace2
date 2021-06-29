public class work104 {
    public static void main(String[] args) {
        Book[] books = new Book[]{
            new Book("参考書",1200),
            new Book("漫画",420),
            new Book("雑誌",540),
        };
        
        books[0].setUnit(2);
        books[1].setUnit(1);
        books[2].setUnit(4);
        
        System.out.println("本名\t単価\t個数\t小計");
        
        for(int i=0; i < books.length; i++) {
            System.out.println(
                books[i].name + "\t" + 
                books[i].price + "\t" + 
                books[i].unit + "\t" + 
                books[i].getSubTotal()
            );
        }
    }
}