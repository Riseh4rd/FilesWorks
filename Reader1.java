import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader1 {
    public byte[] read(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));

        byte[] list = new byte[1000];
        String currentLine = new String();
        for (int i = 0; i < 1000; i++) {
            currentLine = reader.readLine();
            if (currentLine == "null"){
                reader.close();
                return list;
            }
            else{
                list[i] = currentLine.getBytes();
            }
        }

    }
}
