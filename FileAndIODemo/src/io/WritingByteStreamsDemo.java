package io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingByteStreamsDemo {

	public static void main(String[] args) {
		
		//Step 1. Create a file object
		File outputFile = new File("/Users/santhoshgutta/Desktop/test4.txt");
		
		//Step 2: Create a byte oriented stream object
		//For files this will be java.io.FileOutputStream
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(outputFile, true);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 32);
			
			String data = "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object."
					+ "Writing file using FileOutputStream object. - End";
			
			//Step 3: Start writing to a file
			bufferedOutputStream.write(data.getBytes());
			
			//Step 4: Flush the data if anything left
			bufferedOutputStream.flush();
			
			//Step 5: close the input stream connection
			bufferedOutputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
