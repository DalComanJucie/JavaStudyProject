package hello.JavaStudy.StandardJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class CollectionTest
{
    static int s_value= 0;
    int m_Value = 0;
    public CollectionTest()
    {
        s_value += 1;
        m_Value = s_value;
    }
}

public class Collection {
    public void Collection()
    {}

    public void Update(){
        List<CollectionTest> collectionTest = new ArrayList<>(Collections.nCopies(10,new CollectionTest()));
        CollectionTest test = collectionTest.get(0);
        if(test == null)
        {
            System.out.println("여기 들ㅇ오나요?");
        }

        List<CollectionTest> arrayList = new ArrayList<CollectionTest>();
        for(int i = 0; i < 10; ++i)
        {
            arrayList.add(new CollectionTest());
        }

        System.out.println(arrayList.get(0).m_Value);

        Iterator<CollectionTest> iter = arrayList.iterator();

        while(iter.hasNext())
        {
            CollectionTest temps = iter.next();
            if(temps.m_Value == 2) //iterrator로 삭제하는것도 나쁘진 않겠다.
            {
                iter.remove();
            }
        }

        System.out.println(arrayList.get(0).m_Value);
        System.out.println("#################");
        for(CollectionTest item : arrayList)
        {

            System.out.println(item.m_Value);
        }

        return;
    }
}
