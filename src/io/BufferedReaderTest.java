package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;

		try {
			// 기반 스트림
			FileReader fr = new FileReader("./src/io/BufferedReaderTest.java");

			// 보조 스트림
			br = new BufferedReader(fr);

			// input - 입력
			int index = 0;
			String line = null;
			while ((line = br.readLine()) != null) { // String으로 전달 ( 객체 )
				index++;
				System.out.print(index + ":");
				System.out.print(line);
				System.out.print("\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found : " + e);
		} catch (IOException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
