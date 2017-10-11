package basic.exception;

public class ExceptionTest {
	public static void main(String[] args) {
		
		String str = "ㅁㄴㅇㄹ";
		try{
			System.out.println(str.toString());
			//System.out.println(10/0);
		}catch(NullPointerException | NumberFormatException e){
			System.out.println("인스턴스할당이 안됐음....");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("무조건수행");
		}
		

		System.out.println("종료");
	}

}
