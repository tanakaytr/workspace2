public class work105 {
    public static void main(String[] args) {
        Book[] books = new Book[]{
            new Book("参考書",1200),
            new Book("漫画",420),
            new Book("雑誌",540),
        };
        //1番目の本を2冊購入
        books[0].setUnit(2);
        //2番目の本を1冊購入
        books[1].setUnit(1);
        //3番目の本を4冊購入
        books[2].setUnit(4);
        
        Cart cart = new Cart();
        //カートに追加する
        cart.add(books);
        
        System.out.println("カート内総計：" + cart.getTotal());
    }
}
