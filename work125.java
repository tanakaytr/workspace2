class work125 {
    public static void main (String[] args) {
        Hero5 taro = new Hero5("太郎");
        taro.fight();
        taro.useMagic();
        taro.run();
        
        System.out.println("==========");
        
        SuperHero2 maiko = new SuperHero2("舞子",true);
        maiko.fly();
        maiko.fight();
        maiko.useMagic();
        maiko.run();
    }
}
