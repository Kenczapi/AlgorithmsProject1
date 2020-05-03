package NoHermetization;

public class Element<K,V> {

    public final K key;
    public final V value;

    //ref to next node
    Element<K,V> next = null;

    public Element(K key, V value) {
        this.key = key;
        this.value = value;
    }


}
