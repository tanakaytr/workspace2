public class work102 {
	 public static void main(String[] args) {
	        Dog[] dogs = {
	            new Dog("リョウマ", 4, "オス", "土佐犬"),
	            new Dog("クリーム", 6, "メス", "柴犬"),
	            new Dog("ショコラ", 2, "メス", "チワワ"),
	        };
	        
	        System.out.println("名前\t年齢\t性別\t犬種");
	        
	        for(int i=0; i < dogs.length; i++) {
	            System.out.println(dogs[i]);
	        }
	    }

}
