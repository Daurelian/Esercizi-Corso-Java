package sesti_esercizi;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MappadiRighe {
    public static void readByBufferedReaderMappe(String filePath){
        try(BufferedReader br= Files.newBufferedReader(Paths.get(filePath))){
            String line;
            LinkedHashMap<String, List<String>> mappa_di_righe = new LinkedHashMap<>();
            while ((line = br.readLine()) != null){
               String[]line_array= line.split(":");
               String[]values_array=line_array[1].split(",");
               List<String> values_list= new ArrayList<>();
               for(String values: values_array){
                   values_list.add(values);
               }
               mappa_di_righe.put(line_array[0], values_list);


            }
            //br.close();
            System.out.println(mappa_di_righe);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        }
    }

