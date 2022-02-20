package hello.JavaStudy.CollectConverter;

public interface ListToMapConverter<K, V> {
    public K getKey(V item);
}
