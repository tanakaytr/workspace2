public class work116 {
    public static void main (String[] args) {
        Product product = new Product("鉛筆");
        
        product.setPrice(120);
        product.setUnit(4);
        
        int total = product.getTotal();
        
        System.out.println(total + "円");
    }
}
