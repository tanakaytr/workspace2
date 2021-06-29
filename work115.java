public class work115 {
    public static void main (String[] args) {
        User user1 = new User("山田","太郎");
        user1.setId("abc");
        user1.setPassword("12345");
        System.out.println(user1.getFullName());
        
        User user2 = new User("佐藤","次郎");
        user2.setId("xyz");
        user2.setPassword("98765");
        System.out.println(user2.getFullName());
    }
}