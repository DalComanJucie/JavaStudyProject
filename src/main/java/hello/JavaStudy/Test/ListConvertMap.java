package hello.JavaStudy.Test;

import hello.JavaStudy.CollectConverter.Global;
import hello.JavaStudy.CollectConverter.ListDAO;
import hello.JavaStudy.CollectConverter.ListToMapConverter;

import java.util.*;

class ListDAO2
{
    int a;
    int b;
}

public class ListConvertMap {

    public ListConvertMap()
    {

    }

    public void Test()
    {
        List<ListDAO2> integerCollection = new ArrayList<>();

        Map<Integer, ListDAO2> resultMap = Global.listAsMap(integerCollection,
                new ListToMapConverter<Integer, ListDAO2>() {
                    @Override
                    public Integer getKey(ListDAO2 item) {
                        return item.a;
                    }
                });



        return;
    }




}
