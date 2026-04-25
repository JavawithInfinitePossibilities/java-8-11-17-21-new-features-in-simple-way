package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.iopackage.FileReadProcess;

import java.io.IOException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        FileReadProcess fileReadProcess = new FileReadProcess();
        // Method 1: Using ClassLoader (Best Practice - works from IDE and JAR)
        try {
            ClassLoader classLoader = App.class.getClassLoader();
            URL resource = classLoader.getResource("DemoIOFile.txt");
            if (resource != null) {
                String filePath = resource.getPath();
                fileReadProcess.readFile(filePath);
            } else {
                System.err.println("ERROR: File 'DemoIOFile.txt' not found in resources!");
            }
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("---------------------------------------------------");
        try {
            fileReadProcess.readFileInChunks("DemoIOFile.txt",1024);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("---------------------------------------------------");
        try {
            fileReadProcess
                    .readFileInChunksWithCallback("DemoIOFile.txt", 1024,
                    (chunkNum, data, bytesRead) -> {
                        System.out.println("Processing Chunk #" + chunkNum + ": " + bytesRead + " bytes");
                        // Custom processing logic
                        String chunkContent = new String(data, 0, bytesRead);
                        System.out.println(chunkContent);
                    }
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
