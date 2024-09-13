package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StudentDataReader {
    public static List<Student> getStudentData(String fileName) {
        try {
            return Files.lines(Path.of(fileName))
                    .skip(1)
                    .distinct()
                    .filter(line -> !line.isEmpty())
                    .map(line -> line.split(","))
                    .map(
                            data -> new Student(
                                    Long.parseLong(data[0]),
                                    data[1],
                                    data[2],
                                    Integer.parseInt(data[3])
                            )
                    )
                    .toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
