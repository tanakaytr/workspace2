class work123 {
    public static void main (String[] args) {
        /* 
        コンストラクタは継承されないが、Childクラスで
        コンストラクタを定義していないため、デフォルト
        コンストラクタが呼ばれて、Parentクラスの引数なしの
        コンストラクタが呼ばれる
        */
        Child child1 = new Child();
        
        //コンストラクタは継承されないため、これはエラー
        //Child child2 = new Child("test");
    }
}
