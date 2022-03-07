import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FastCopy {

	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		BufferedInputStream inBuffer = null;
		BufferedOutputStream outBuffer = null;
		try {
			inFile = new FileInputStream("D:\\Demo\\python.exe");  //26MB approx
			outFile = new FileOutputStream("D:\\Demo\\p3.exe");
			inBuffer = new BufferedInputStream(inFile, 1024*16);
			outBuffer = new BufferedOutputStream(outFile, 1024*16);
			System.out.println("Copying files.....");
			int ch = 0;
			long ms1 = System.currentTimeMillis();
			while(true) {
				ch = inFile.read();   //Reading a byte from the stream
				if(ch == -1) break;
				outFile.write(ch);
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File copied successfully in " + (ms2-ms1) + " ms");
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				inBuffer.close();
				outBuffer.close();
				inFile.close();
				outFile.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}


