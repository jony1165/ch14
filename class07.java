package hw7;
import java.io.*;
public class class07 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count=0;
	    String str;
	    FileReader fr=new FileReader("D:\\物件導向程式設計作業區\\CH12\\hw14\\src\\hw04\\donkey.txt");
	    BufferedReader bfr=new BufferedReader(fr);

	    while((str=bfr.readLine())!=null)
	    {
	       if(count==1)
	          bfr.skip(14);
	       System.out.println(str);
	       count++;
	    }
	    fr.close();
	}

}
