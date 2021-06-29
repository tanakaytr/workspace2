public class work101 {
    public static void main(String[] args) {
        Employee[] emp = {
            new Employee(),
            new Employee(),
            new Employee(),
        };
        
        emp[0].name = "山田";
        emp[0].section = "総務部";
        
        emp[1].name = "佐藤";
        emp[1].section = "営業部";
        
        emp[2].name = "田中";
        emp[2].section = "企画部";
        
        for(int i=0; i < emp.length; i++) {
            emp[i].showSection();
        }
    }
}
