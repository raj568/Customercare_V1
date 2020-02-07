import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class wordcount {

	public static void main(String[] args) throws IOException {
		File fis=new File("input.txt");
		String[] words=null;
		int wc=0;
		FileReader fr= new FileReader(fis);
		BufferedReader br=new BufferedReader(fr);
		String s;
		int wrc=1;
		while((s=br.readLine())!=null)
		{
			words=s.split("");
			wc=wc+words.length;
			
			for(int i=0;i<words.length;i++)
			{
				for(int j=i+1;j<words.length;j++)
				{
					if(words[i].equals(words[j]))
					{
						wrc=wrc+1;
						words[j]=null;
					}
				}
			}
			for(int k=0;k<words.length;k++)
				System.out.println(words[k]+"   "+wrc);
		}
		System.out.println("Total number of words in a file are"+wc);
	}

}
	
		

		   
		     
