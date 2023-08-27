package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile<T> {
	static String FILE_PATH = "file.txt";
	
    public List<T> readFile(DataMapper<T> dataMapper) {
        File file = new File(FILE_PATH);
        List<T> data = new ArrayList<>();
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                T obj = dataMapper.mapData(line);
                data.add(obj);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        
        return data;
    }
}
