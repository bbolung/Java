package ex06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) {

//		String originalPath = "C:/Data/dog.jpg";
//		String targetPath = "C:/test/dog.jpg";
		
//		String originalPath = "C:/Data/video.mp4";
//		String targetPath = "C:/test/video.mp4";
		
		String originalPath = "C:/Data/new.txt";
		String targetPath = "C:/test/new.txt";
		
		try {
			InputStream is = new FileInputStream(originalPath);
			OutputStream os = new FileOutputStream(targetPath);
			
			byte[] data = new byte[1024];
			
			while(true) {
				int num = is.read(data);
				
				//data == -1 : 더 이상 읽어올 데이터가 없다는 의미(파일 끝)
				if(num == -1) break;
				
				os.write(data, 0, num);
			}
			
			os.flush();
			is.close();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
