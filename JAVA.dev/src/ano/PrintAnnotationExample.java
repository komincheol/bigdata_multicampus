package ano;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] ddeclaredMethods = Service.class.getDeclaredMethods();
		System.out.println("Servuce 클래스의 메소드 개수:" + ddeclaredMethods);

		for (Method method : ddeclaredMethods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation= method.getAnnotation(PrintAnnotation.class);
				
				System.out.println("["+method.getName()+"]");
				
				for(int i=0; i<printAnnotation.number();i++){
					System.out.println(printAnnotation.value());
					
				}
				System.out.println();
				try{
					method.invoke(new Service());
				}catch (Exception e){}
				System.out.println();

			}
		}
	}
}
