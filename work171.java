package work1;

public class work171 {
    public static void main(String[] args) {
        System.out.println("Work1.java");
        Message message = new Message("Hello");
        message.show();
    }
}
class Message {
    String text;
    Message(String text) {
        this.text = text;
    }
    void show() {
        System.out.println(this.text);
    }
}
