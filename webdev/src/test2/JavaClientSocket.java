package test2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class JavaClientSocket {
	public static void main(String[] args) {

		try {
			Socket socket = new Socket("70.12.50.72", 8667);
			System.out.println("클라이언트 소켓 생성");
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			
		
			oos.writeObject("안녕하세요. 저는클라이언트입니다.");
			oos.flush();
			Object in = ois.readObject();
			System.out.println("받은메시지:" + in);
			System.out.println("클라이언트를 종료합니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
