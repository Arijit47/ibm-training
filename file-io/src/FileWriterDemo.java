import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		String path = "src/amazing.txt";
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter(new FileWriter(path));
			writer.write("When i see your face");
			writer.newLine();
			writer.write("There's not a thing that i could change");
			writer.newLine();
			writer.write("Cause you are amazing, just the way you are");
			System.out.println("Writing to the file completed");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try{
				if(writer != null)
					writer.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
