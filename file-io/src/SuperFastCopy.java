import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class SuperFastCopy {

	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		try {
			inFile = new FileInputStream("D:\\Demo\\python.exe");  //26MB approx
			outFile = new FileOutputStream("D:\\Demo\\p4.exe");
			inChannel = inFile.getChannel();
			outChannel = outFile.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(1024*16);   //Creating 16kb common buffer
			System.out.println("Copying files.....");
			long ms1 = System.currentTimeMillis();
			while(true) {
				int count = inChannel.read(buffer);
				if(count == -1) break;
				buffer.flip();             //Placing cursor back to the start of the buffer
				outChannel.write(buffer);
				buffer.clear();
			}
			long ms2 = System.currentTimeMillis();
			System.out.println("File copied successfully in " + (ms2-ms1) + " ms");
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				inChannel.close();
				outChannel.close();
				inFile.close();
				outFile.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

