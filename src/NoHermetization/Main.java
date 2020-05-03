package NoHermetization;

import NoHermetization.Linear.BernsteinLinear;
import NoHermetization.Linear.ModularLinear;
import NoHermetization.Linear.SimplifiedModularLinear;
import NoHermetization.Square.BernsteinSquare;
import NoHermetization.Square.ModularSquare;
import NoHermetization.Square.SimplifiedModularSquare;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        FilesWithTexts f = new FilesWithTexts();
        List<String> contentFromPlFile = f.getDataFromFile(f.plFile);

        String key;
        String value;

        // ==================================

        ModularLinear<String, String> ml = new ModularLinear<>(contentFromPlFile.size());
        System.out.println("Modular linear");
        for (String s : contentFromPlFile) {
            key = s;
            value = s;
            ml.insert(new Element(key, value));
        }
        ml.printTable();

        // ==================================

        BernsteinLinear<String, String> bl = new BernsteinLinear<>(contentFromPlFile.size());
        System.out.println("Bernstein linear");
        for (String s : contentFromPlFile) {
            key = s;
            value = s;
            bl.insert(new Element(key, value));
        }
        bl.printTable();

        // ==================================

        SimplifiedModularLinear<String, String> sml = new SimplifiedModularLinear<>(contentFromPlFile.size());
        System.out.println("Simplified modular linear");
        for (String s : contentFromPlFile) {
            key = s;
            value = s;
            sml.insert(new Element(key, value));
        }
        sml.printTable();

        // ==================================

        ModularSquare<String,String> ms = new ModularSquare<>(contentFromPlFile.size());
        System.out.println("Modular square");
        for(String s: contentFromPlFile){
            key = s;
            value = s;
            ms.insert(new Element(key,value));
        }
        ms.printTable();

        // ==================================

        BernsteinSquare<String,String> bs = new BernsteinSquare<>(contentFromPlFile.size());
        System.out.println("Bernstein square");
        for(String s: contentFromPlFile){
            key = s;
            value = s;
            bs.insert(new Element(key,value));
        }
        bs.printTable();

        // ==================================

        SimplifiedModularSquare<String,String> sms = new SimplifiedModularSquare<>(contentFromPlFile.size());
        System.out.println("Simplified modular square");
        for(String s: contentFromPlFile){
            key = s;
            value = s;
            sms.insert(new Element(key,value));
        }
        sms.printTable();


        List<String> contentFromRandFile = f.getDataFromFile(f.rdFile);
    }
}
