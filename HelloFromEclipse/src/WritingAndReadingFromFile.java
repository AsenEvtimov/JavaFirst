import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class WritingAndReadingFromFile {
	
	public static void main(String[] args) {
		
		String fileName = "src/Thursday";
		
		try {
			PrintWriter pw = new PrintWriter(fileName);
			
			pw.println();
			pw.println("Hello");
			pw.println("Its Thursday");
			pw.println("Its raining again... :(");
			pw.println("I can't try my new bike :(");
			pw.println();
			pw.flush();
			pw.close();	
			
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File can not be created");
			e.printStackTrace();
		}
		try {
			System.out.println("Contents of the file");
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);			
			
			String line = "";
			while ( (line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File not found");
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error reading form file");
		}
		
		System.out.println("End of main");
	}
}
