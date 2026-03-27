package sample1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Test2 {
	
	  @Test
	    public void testReadFile() throws Exception {

	        // Use relative path (best for CI)
	        Path path = Paths.get("target", "test-output", "output.txt");

	        System.out.println("Looking for file at: " + path.toAbsolutePath());

	        // Check if file exists
	        if (!Files.exists(path)) {
	            throw new RuntimeException("❌ File NOT found: " + path.toAbsolutePath());
	        }

	        // Read all lines
	        List<String> lines = Files.readAllLines(path);

	        // Convert to Map
	        Map<String, String> map = new HashMap<>();

	        for (String line : lines) {
	            if (line.contains(":")) {
	                String[] parts = line.split(":", 2);
	                map.put(parts[0].trim(), parts[1].trim());
	            }
	        }

	        // Print values
	        System.out.println("Parsed Map: " + map);

	        // Example assertions
	        System.out.println("Name = " + map.get("Name"));
	        System.out.println("Status = " + map.get("Status"));
	    }
}
