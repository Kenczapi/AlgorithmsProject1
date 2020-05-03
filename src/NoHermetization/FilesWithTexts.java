package NoHermetization;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class FilesWithTexts {

    public File plFile = new File("pol.txt"); //Miłośc w Zakopanem by Sławomir xd
    public File rdFile = new File("rand.txt"); //500 random strings

    public List<String> getDataFromFile(File f) {
        if(!f.exists()){
            return null;
        }
        List<String> stringList = new LinkedList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(f.getPath()));
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("\\p{Punct}",""); //removes symbols like: , . ! etc.
                stringList.addAll(Arrays.asList(line.split(" ")));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return stringList;
    }


}
