package activities;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("input.txt");
		f1.createNewFile();
		
		FileWriter fw=new FileWriter(f1);
		fw.write("Hi..This Dharani..I am writing in this file");
		fw.close();
		//TODO Auto-generated method stub
		File fileUtil1=FileUtils.getFile("input.txt");
		String filedata=FileUtils.readFileToString(fileUtil1,"UTF-8");
		
		System.out.println("The data of the file1  is " + filedata);
		
		File dir=new File ("resources");
		FileUtils.copyFileToDirectory(f1, dir);
				
		FileWriter fw2=new FileWriter("resources/input.txt");
		fw2.write("Hi..This Dharani..I am writing inside the diretory file");
		fw2.close();
				
		File fileUtil2=FileUtils.getFile(dir,"input.txt");
			
		String filedata2=FileUtils.readFileToString(fileUtil2,"UTF-8");
		System.out.println("The data of the file2  is " + filedata2);

	}

}
