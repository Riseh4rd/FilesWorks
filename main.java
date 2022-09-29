package File_to_byte_array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Read_file read = new Read_file();
        Scanner scanner = new Scanner(System.in);
        byte[] file = read.read(scanner.nextLine());
    }
}
