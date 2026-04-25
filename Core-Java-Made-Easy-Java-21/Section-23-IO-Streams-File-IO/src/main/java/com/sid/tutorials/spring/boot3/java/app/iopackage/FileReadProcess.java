package com.sid.tutorials.spring.boot3.java.app.iopackage;

import com.sid.tutorials.spring.boot3.java.app.App;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kunmu On 25-04-2026
 */
public class FileReadProcess {

    public void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readResourceFile(String resourceName) throws IOException {
        try (InputStream inputStream = FileReadProcess.class.getClassLoader()
                .getResourceAsStream(resourceName)) {
            if (inputStream == null) {
                throw new FileNotFoundException("Resource not found: " + resourceName);
            }
            return new String(inputStream.readAllBytes());
        }
    }

    public List<String> readResourceFileLines(String resourceName) throws IOException {
        try (InputStream inputStream = FileReadProcess.class.getClassLoader()
                .getResourceAsStream(resourceName);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            return reader.lines().collect(Collectors.toList());
        }
    }

    public void readFileWithTryWithResources(String filePath) {
        try {
            URL resource = this.getClass().getClassLoader().getResource("DemoIOFile.txt");
            if (resource != null) {
                Path path = Paths.get(resource.toURI());
                String content = Files.readString(path);
                System.out.println(content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<String> readFileLinesWithResources(String resourceName) throws IOException {
        List<String> lines = null;
        try {
            URL resource = this.getClass().getClassLoader().getResource("DemoIOFile.txt");
            if (resource != null) {
                Path path = java.nio.file.Paths.get(resource.toURI());
                lines = java.nio.file.Files.readAllLines(path);
                lines.forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

    /**
     * Read file in chunks of defined byte size
     *
     * @param resourceName - Name of the resource file
     * @param byteSize - Size of each chunk in bytes (e.g., 1024 = 1KB, 1024*1024 = 1MB)
     * @throws IOException
     */
    public void readFileInChunks(String resourceName, int byteSize) throws IOException {
        try (InputStream inputStream = FileReadProcess.class.getClassLoader()
                .getResourceAsStream(resourceName)) {
            if (inputStream == null) {
                throw new FileNotFoundException("Resource not found: " + resourceName);
            }

            byte[] buffer = new byte[byteSize];
            int bytesRead;
            int chunkNumber = 1;

            System.out.println("Reading file in chunks of " + byteSize + " bytes...\n");

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                System.out.println("Chunk #" + chunkNumber + " (" + bytesRead + " bytes):");
                System.out.println(new String(buffer, 0, bytesRead));
                System.out.println("---");
                chunkNumber++;
            }
        }
    }

    /**
     * Read file and process each chunk with a callback
     *
     * @param resourceName - Name of the resource file
     * @param byteSize - Size of each chunk in bytes
     * @param callback - Callback function to process each chunk
     * @throws IOException
     */
    public void readFileInChunksWithCallback(String resourceName, int byteSize,
                                           ChunkProcessor callback) throws IOException {
        try (InputStream inputStream = FileReadProcess.class.getClassLoader()
                .getResourceAsStream(resourceName)) {
            if (inputStream == null) {
                throw new FileNotFoundException("Resource not found: " + resourceName);
            }

            byte[] buffer = new byte[byteSize];
            int bytesRead;
            int chunkNumber = 1;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                callback.process(chunkNumber, buffer, bytesRead);
                chunkNumber++;
            }
        }
    }

    /**
     * Functional interface for processing file chunks
     * All concerns handled in one callback!
     * Benefit                             Advantage
     * Flexibility                         Change behavior without modifying method
     * Reusability                         One method, multiple use cases
     * Testability                         Easy to test different scenarios
     * Maintainability                     Clean, organized code
     * Scalability                         Add new behaviors without touching core logic
     * Async Support                       Non-blocking operations
     * Decoupling                          Method doesn't know about business logic
     * Plugin System                       Runtime behavior configuration
     */
    @FunctionalInterface
    public interface ChunkProcessor {
        void process(int chunkNumber, byte[] data, int bytesRead);
    }
}
