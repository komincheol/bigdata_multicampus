package api;

public class StringTest {
	public static void main(String[] args) {
		String str1 =new String("안녕하세요");
		String str2 = new String("안녕하세요");
		
		if(str1==str2){
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		String str3 ="안녕하세요";
		String str4 = "안녕하세요";
		
		
		if(str3==str4){
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
	}
}
