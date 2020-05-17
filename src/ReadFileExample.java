import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePatch) {
        try {
            File file = new File(filePatch);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line = "";
                int sum = 0;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                    sum += Integer.parseInt(line);
                }
                bufferedReader.close();

            System.out.println("Total = " + sum);
        } catch (Exception e) {
            System.err.println("File not found or can't read file!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter file path: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}
