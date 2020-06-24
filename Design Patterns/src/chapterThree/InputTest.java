package chapterThree;

import java.io.*;
//import java.io.InputStream;

public class InputTest {
	public static void main (String[] args) throws IOException {
		int c;
		
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("text.txt")));
			
				while((c = in.read()) >= 0) 
				{
					System.out.print((char)c);
				}

			in.close();
		}	catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
