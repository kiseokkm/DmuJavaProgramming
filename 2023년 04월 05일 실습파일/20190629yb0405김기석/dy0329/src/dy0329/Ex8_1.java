package dy0329;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//try catch finally 문 알기
public class Ex8_1 {


	public static void main(String[] args) {
		String FileReader = "C:\\input.txt";
		try {		
			BufferedReader bin = new BufferedReader(new FileReader(FileReader));
			FileReader fin = new FileReader("C:\\input.txt");
			FileWriter fout = new FileWriter("C:\\output1.txt");
			BufferedWriter bout = new BufferedWriter(fout);
			//객체.(메소드) 호출
			int c;
			while ( (c = fin.read())!= -1) {
			fout.write(c);
			System.out.println((char)c);
		  }
			System.out.println("출력함함");
			bin.close();
			fin.close();
			fout.close();
			bout.close();
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
			System.out.println("파일 없음 error");
		}
		   catch (IOException e) {	
			e.printStackTrace();
			System.out.println("읽기 read 에러");
		}
		   catch (Exception e) {	
			e.printStackTrace();
			System.out.println("기타 에러");
		}
		
	}

}
