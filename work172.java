package work2;

import data.*;

public class work172 {
    public static void main(String[] args) {
        // Userクラスは「data」パッケージ内に所属するクラス
        User user = new User("Taro Yamada", "t.yama", "yamayama123");
        System.out.println(user.getName());
        System.out.println(user.getId());
        System.out.println(user.getPassword());
    }
}

