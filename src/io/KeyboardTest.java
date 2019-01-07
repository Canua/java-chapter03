package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			// 기반 스트림 ( 표준 입력 , stdin, System.in )
			// 기본 자바 JVM에서 제공

			// 보조 스트림 1
			InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");

			// 보조 스트림 2 ( char | char | char | char |.....|\n -> "charcharcharchar"); ->
			// 개행(\n)까지의 버퍼에 쌓인 문자들을 String으로 변경
			br = new BufferedReader(isr);

			String line = null;
			while ((line = br.readLine()) != null) {
				if ("exit".equals(line)) {
					break;
				}
				System.out.println(">> " + line);
			}
		} catch (IOException e) {
			System.out.println("Error : " + e);
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
