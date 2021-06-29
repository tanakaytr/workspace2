class work122 {
    public static void main (String[] args) {
        SmartPhoneProduct sp1 = new SmartPhoneProduct("DoCoMo","Xperia", 36000, 2);
        String carrier = sp1.getCarrier();
        String name = sp1.getName();
        int total = sp1.getTotal();
        
        show(carrier);
        show(name);
        show(total);
        show("======");
        
        SmartPhoneProduct sp2 = new SmartPhoneProduct("Softbank","iPhone5", 52000, 3);
        carrier = sp2.getCarrier();
        name = sp2.getName();
        total = sp2.getTotal();
        
        show(carrier);
        show(name);
        show(total);
        show("======");
    }
    static void show(Object o) {
        System.out.println(o);
    }
}
