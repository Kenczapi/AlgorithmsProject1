package NoHermetization;

public class SimplifiedModularLinear<K, V> implements OpenAddressing<K, V> {

    int size;
    Element[] table;
    int bucketsTaken = 0;

    SimplifiedModularLinear(int size) {
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
            if (this.table[(hashValue + i) % this.size] == null) {
                this.table[(hashValue + i) % this.size] = element;
                bucketsTaken++;
                break;
            }
        }

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
