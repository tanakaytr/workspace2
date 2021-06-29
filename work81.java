public class work81 {
	public static void main(String[] args) {
		int a = getDouble(2);
        int b = getTriple(3);
        System.out.println(a);
        System.out.println(b);
        
        
	}
	public static int getDouble(int num) {
    	return num * 2;
    }
	public static int getTriple(int num) {
    	return num * 3;
    }
}