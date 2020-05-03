package NoHermetization;

public interface OpenAddressing<K, V> {

    void insert(Element element);

    V search(K key);

    void delete(K key);

    int hashFunction(K key);

    void printTable();
}
