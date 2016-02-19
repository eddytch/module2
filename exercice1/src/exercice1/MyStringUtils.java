package exercice1;

public class MyStringUtils {
	
	public static boolean isNullOrEmpty(String s) {
		return s == null || s.isEmpty();
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(isNullOrEmpty(null));
		System.out.println(isNullOrEmpty(""));
		System.out.println(isNullOrEmpty("bla"));

	}

}