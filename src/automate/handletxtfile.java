package automate;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class handletxtfile {

	public static void main(String[] args) throws IOException {

FileInputStream fis=new FileInputStream("C:\\Users\\Nitu_Diku\\Desktop\\cover_letter.txt");
BufferedReader br=new BufferedReader(new InputStreamReader(fis));
while((br.readLine())!=null)
System.out.println("info of line"+(br.readLine()));


	}

}
