package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class IoExample {

	public static void main(String[] args) throws IOException {
		byte[] src = { 0, 1, 2, 3, 4 };
		byte[] dest = null;

		InputStream is = new ByteArrayInputStream(src);
		OutputStream os = new ByteArrayOutputStream(); // 예외 적으로 내부에 버퍼(목적지 destination)가 있다

		int data = -1;
		while ((data = is.read()) != -1) {
			os.write(data);
		}
		// OutputStream은 내부에 buffer가 있기 때문에 사용
		dest = ((ByteArrayOutputStream) os).toByteArray();

		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
	}
}
