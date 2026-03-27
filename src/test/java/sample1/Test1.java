package sample1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.Test;











public class Test1 {

	@Test
	public void test1() throws Exception {
		
		File dir = new File("target/test-output");
        if (!dir.exists()) {
            dir.mkdirs();
        }
		System.out.println("Hello Namaste");

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
