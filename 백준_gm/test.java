package study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test {
	public static void main(String[] args) {
		String fileName = "10950.txt";
		try {
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);
			
			int data=0;
			while((data=fis.read())!=-1) {
				System.out.println((char)data);
			}
			System.out.println();
			fis.close();
			
			while((data=fr.read())!=-1) {
				System.out.println((char)data);
			}
			System.out.println();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
