package NoHermetization;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        FilesWithTexts f = new FilesWithTexts();
        List<String> contentFromPlFile = f.getDataFromFile(f.plFile);
        List<String> contentFromRandFile = f.getDataFromFile(f.rdFile);

        String key;
        String value;

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
    }
}
