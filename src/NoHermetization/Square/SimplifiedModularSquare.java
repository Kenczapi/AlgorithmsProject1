package NoHermetization.Square;

import NoHermetization.Element;
import NoHermetization.OpenAddressing;

public class SimplifiedModularSquare<K,V> implements OpenAddressing<K,V> {
    int size;
    Element[] table;
    int bucketsTaken = 0;

    private final int constant1 = 1;
    private final int constant2 = 1;

    public SimplifiedModularSquare(int size) {
        this.size = size;
        this.table = new Element[size];
    }

    @Override
    public void insert(Element element) {

        if (this.bucketsTaken == this.size) {
            System.out.println("No more space for Element(" + element.key + ", " + element.value + ").");
        }

        int hashValue = hashFunction((K) element.key);

        for (int i = 0; i < this.size; i++) {
            int pos = hashValue +  i * i;
            if (this.table[pos % this.size] == null) {
                this.table[pos % this.size] = element;
                bucketsTaken++;
                return;
            }
        }
        logger.info("Could not place Element(" + element.key + ", " + element.value + ").");
    }

    @Override
    public V search(K key) {
        return null;
    }

    @Override
    public void delete(K key) {

    }

    @Override
    public int hashFunction(K key) {
        //Taking just two first elements if length != 1, else just one element
        if (key.toString().length() != 1)
            return Math.abs(key.toString().substring(0, 2).hashCode() % this.size);
        return Math.abs(key.toString().hashCode() % this.size);
    }

    @Override
    public void printTable() {
        for (int i = 0; i < this.size; i++) {
            if (this.table[i] != null) {
                System.out.print("[" + this.table[i].value + "] ");
            } else {
                System.out.print("[null] ");
            }
        }
        System.out.print("\n");
    }
}
