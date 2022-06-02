package lesson5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExamples {
    public static void main(String[] args) throws IOException {
        File file = new File("file1.csv");

        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write("Value 1;Value 2;Value 3\n100;200;123\n300;400;500\n");
        writer.flush();
        writer.close();

        FileReader fr = new FileReader(file);
        char [] a = new char[50];
        fr.read(a);

        for(char c : a)
            System.out.print(c);
        fr.close();
    }
}
