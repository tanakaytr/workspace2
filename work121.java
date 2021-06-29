class work121 {
    public static void main (String[] args) {
        Dog3 dog = new Dog3();
        dog.setName("シロ");
        dog.setAge(3);
        dog.setSeibetsu("男");
        
        String name = dog.getName();
        int age = dog.getAge();
        String seibetsu = dog.getSeibetsu();
        
        show(name);
        show(age);
        show(seibetsu);
    }
    static void show(Object o) {
        System.out.println(o);
    }
}
