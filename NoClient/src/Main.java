import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket("127.0.0.1", 1111);
			OutputStream out = socket.getOutputStream();
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			while (scanner.hasNext())
			{
				String str = scanner.next();
				out.write(str.getBytes());
			}
			
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
