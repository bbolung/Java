package ex08;

//import java.io.*; : 입출력 패키지 사용!
import java.io.*;

public class BufferExample {

	public static void main(String[] args) throws Exception {
		//입출력 스트림 생성
		String originalPath1 = "C:/Data/originalFile1.jpg";
		String targetPath1 = "C:/Test/targetFile1.jpg";
		
		FileInputStream fis = new FileInputStream(originalPath1);
		FileOutputStream fos = new FileOutputStream(targetPath1);
		
		//입출력 스트림 + 버퍼 스트림 생성
		String originalPath2 = "C:/Data/originalFile2.jpg";
		String targetPath2 = "C:/Test/targetFile2.jpg";
		
		FileInputStream fis2 = new FileInputStream(originalPath2);
		FileOutputStream fos2 = new FileOutputStream(targetPath2);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		//버퍼를 사용하지 않고 복사
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼 미사용:\t" + nonBufferTime + "ns");
		
		
		//버퍼를 사용하고 복사
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 사용:\t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}

	private static long copy(InputStream is, OutputStream os) throws Exception {
		//시작 시간 저장
		long start = System.nanoTime();
		
		//1바이트를 읽고 1바이트를 출력
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		
		os.flush();
		
		//끝 시간 저장
		long end = System.nanoTime();
		
		//복사 시간 리턴
		return (end-start);
	}
}
