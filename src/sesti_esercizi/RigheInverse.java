package sesti_esercizi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RigheInverse {
    public static void readByBufferedReaderWriterRighe(String filePath_origin, String filePath_destination) {
        ArrayList<String> rows= new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath_origin))) {
            String line;
            while ((line = br.readLine()) != null){
                    rows.add(line);
                }
//            System.out.println(rows);
        }catch(IOException e) {
            e.printStackTrace();
        }

        Collections.reverse(rows);
        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get(filePath_destination))) {
            for(String row: rows){
                bw.write(row);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
