import java.io.File;

public class FileTest{
	public static void main(String args[]){
		File file = new File("test.txt");
		System.out.println(file.exists() ? "existe el archivo ":"no existe");
		file.createFile();	
	}		
}
