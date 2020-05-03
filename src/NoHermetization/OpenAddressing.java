package NoHermetization;

import java.util.logging.Logger;

public interface OpenAddressing<K, V> {

    final Logger logger = Logger.getLogger("Loger");

    void insert(Element element);

    V search(K key);

    void delete(K key);

    int hashFunction(K key);

    void printTable();
}
