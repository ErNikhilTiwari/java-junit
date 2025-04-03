package org.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessorTest {
    private final String testFilename = "testfile.txt";
    private final FileProcessor fileProcessor = new FileProcessor();

    @Test
    public void testWriteAndReadFromFile() throws IOException {
        String content = "Hello, File Handling!";
        fileProcessor.writeToFile(testFilename, content);
        String readContent = fileProcessor.readFromFile(testFilename);
        assertEquals(content, readContent);
    }

    @Test
    public void testFileExistsAfterWriting() throws IOException {
        fileProcessor.writeToFile(testFilename, "Some content");
        assertTrue(Files.exists(Paths.get(testFilename)));
    }

    @Test
    public void testReadFromNonExistentFile() {
        assertThrows(IOException.class, () -> fileProcessor.readFromFile("nonexistent.txt"));
    }
}
