package hello.JavaStudy.CollectConverter;

public class ListDAO <K, V> implements ListToMapConverter<K,V> {

    public K key;
    private V instance;

    public ListDAO()
    {
        instance = (V)this;
    }

    public K getKey(V item)
    {
        return key;
    }
}
