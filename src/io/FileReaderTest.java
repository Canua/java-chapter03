package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {
	public static void main(String[] args) {
		Reader in = null; // char 단위로 읽기
		InputStream is = null; // Byte 단위로 읽기
		try {
			in = new FileReader("123.txt");

			int count = 0;
			int data = -1;
			while ((data = in.read()) != -1) {
				count++;
				System.out.print((char) data);
			}

			System.out.print("\n");
			System.out.println("count : " + count);
			System.out.println("=========================");

			count = 0;
			is = new FileInputStream("123.txt");
			while ((data = is.read()) != -1) {
				count++;
				System.out.print((char) data);
			}

			System.out.print("\n");
			System.out.println("count : " + count);

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다." + e);
		} catch (IOException e) {
			System.out.println("입출력 오류 :" + e);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
