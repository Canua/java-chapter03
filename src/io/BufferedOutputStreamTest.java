package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		try {
			// 기반 스트림 ( 소스에 연결 )
			FileOutputStream fos = new FileOutputStream("test.txt");

			// 보조 스트림 ( 기반 스트림에 연결 )
			bos = new BufferedOutputStream(fos);

			// output - 출력
			for (int i = 'a'; i < 'z'; i++) { // ASCII Code
//			for (int i = 97; i < 122; i++) { // 위 ASCII 코드와 동일한 Int 값
				bos.write((byte) i);

			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found : " + e);
		} catch (IOException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
