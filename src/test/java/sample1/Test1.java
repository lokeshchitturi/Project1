package sample1;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;











public class Test1 {

	@Test
	public void test1() throws Exception {
		System.out.println("Hello Namastey");

		String name = "Lokesh";
		int age = 30;
		double score = 89.5;
		String status = "PASS";
		String timestamp = String.valueOf(System.currentTimeMillis());

		FileWriter writer = new FileWriter("target/test-output/output.txt");

		writer.write("Name: " + name + "\n");
		writer.write("Age: " + age + "\n");
		writer.write("Score: " + score + "\n");
		writer.write("Status: " + status + "\n");
		writer.write("Timestamp: " + timestamp + "\n");

		writer.close();

		System.out.println("Data saved successfully");
	}

}
