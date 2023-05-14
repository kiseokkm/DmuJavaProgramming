package dy0329;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex8_2 {

	public static void main(String[] args){
		// "c:\\flower.jpg" 에 있는 그림을 읽고 쓰고 카피하기 
		String FileName = "c:\\flower.jpg";
		try {
			//방법1
			//FileInputStream fin = new FileInputStream(FileName);
			//BufferedInputStream bin = new BufferedInputStream(fin);
			//방법2
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(FileName));
			FileOutputStream fout = new FileOutputStream("c:\\copybuffer.jpg");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			int c;
			while((c=bin.read())!= -1) {
				fout.write(c);
			//System.out.println(c);
		}
			System.out.println("파일을 읽었습니다.");
			bin.close();
			bout.close();
			fout.close();
	} catch(Exception e){
		e.printStackTrace();
		System.out.println("에러발생");
	}

  }
}
