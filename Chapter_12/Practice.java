/* Name: Paul Helske
 * Date: 3/8/23
 */
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Practice {
 
	public static void main(String[] args) throws IOException {
		
		int n [] = {1, 2, 3, 4, 5};
		

		File bingo = new File("C:/Users/student/Downloads/captmidn.txt");

		Scanner bongo = new Scanner(bingo);

//		while (bongo.hasNextLine()) {
//		System.out.println(bongo.nextLine());
//		}
		String bango = "";
		while(bongo.hasNextLine()) {
			bango = bango.concat(bongo.nextLine() + "\n");
			
		}
		
		FileWriter writer = new FileWriter("C:/Users/student/Downloads/newfile2.txt");
		writer.write(bango);
		writer.close();
		
		
	}
}