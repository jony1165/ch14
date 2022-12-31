package hw04;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
public class class04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    char data[]=new char[128];
	    FileReader fr=new FileReader("D:\\物件導向程式設計作業區\\CH12\\hw14\\src\\hw04\\donkey.txt");
	    int num=fr.read(data);
	    String str=new String(data,0,num);
	    System.out.println("Characters read= "+num);
	    System.out.println(str);
	    fr.close();
	}

}
