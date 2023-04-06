package task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task2 {
    public static void bubleSort() throws IOException {
        int[] array = {1, 8, 3, 2, 9};

        FileWriter nFile = new FileWriter("bubleSort.txt");
        {
        Arrays.sort(array);
        }
        nFile.write(Arrays.toString(array));

        nFile.close();
        System.out.println(array);
    }
}
