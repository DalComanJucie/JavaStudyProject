package hello.JavaStudy.CollectConverter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Global
{
    public static <K, V> Map<K, V> listAsMap(Collection<V> sourceList, ListToMapConverter<K, V> converter)
    {
        Map<K, V> newMap = new HashMap<K, V>();
        for (V item : sourceList) {
            newMap.put( converter.getKey(item), item );
        }
        return newMap;
    }

}
