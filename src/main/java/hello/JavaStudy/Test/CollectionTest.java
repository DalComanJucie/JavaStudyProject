package hello.JavaStudy.Test;

import hello.JavaStudy.StandardJava.Collection;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

class DAO
{
    int a;
    Long b;
    float c;
}

public class CollectionTest {

    List<DAO> CollectionList = new ArrayList<>();
    Map<Integer, DAO> CollectionMap = new HashMap<>();

    final int testDAOCount = 100;

    public long GetNowNanoTime()
    {
        return System.currentTimeMillis();
    }

    public long GetDiffTime()
    {
        if(nanoTime == 0)
        {
            nanoTime = GetNowNanoTime();
            return nanoTime;
        }
        else
        {
            long nowTime = GetNowNanoTime();
            long diffTime = nowTime - nanoTime;
            nanoTime = nowTime;
            return diffTime;
        }
    }

    void PrintDiffTime(String message)
    {
        System.out.println(message + GetDiffTime());
    }

    long nanoTime = 0;
    public void Init()
    {
        PrintDiffTime("Start : ");

        PrintDiffTime("Container HashMap Add Start : ");
        for(int i = 0; i < testDAOCount; ++i)
        {
            DAO value = new DAO();
            value.a = i;
            value.b = (long)(i);
            value.c = i;
            CollectionMap.put(value.a ,value);
        }
        PrintDiffTime("Collection HashMap Add END:");

        PrintDiffTime("ContainerList Add Start : ");
        for(int i = 0; i < testDAOCount ; ++i)
        {
            DAO value = new DAO();
            value.a = i;
            value.b = (long)(i);
            value.c = i;
            CollectionList.add(value);
        }
        PrintDiffTime("ContainerList Add END : ");

    }

    public void Start()
    {
        int findData = 7;
        PrintDiffTime("Collection ArrayList find test start:");
        Optional<DAO> oDAO =  CollectionList.stream().filter(t->t.a == findData).findFirst();
        if(oDAO.isPresent())
        {
            PrintDiffTime("Collection ArrayList find test end :");
        }

        PrintDiffTime("Collection HashMap find test Start :");
        DAO dao = CollectionMap.get(findData);
        if(dao != null)
            PrintDiffTime("Collection HashMap find test End :");

        List<TestClass> testClassList = new ArrayList<>();
        for(int i = 0; i < 1000; ++i)
        {
            testClassList.add(new TestClass());
            testClassList.add(new TestClass());
            testClassList.add(new TestClass());
        }
        PrintDiffTime("Stream collect to Map : test Start");
        Map<Integer, TestClass> testClassMap = testClassList.stream().collect(Collectors.toMap(p->p.Key, p->p));
        PrintDiffTime("Stream collect to Map : test End");

        PrintDiffTime("List to Map just loop : test Start");
        Map<Integer, TestClass> testClassMap2 = new HashMap<>();
        for(TestClass testClass : testClassList)
        {
            testClassMap2.put(testClass.Key, testClass);
        }
        PrintDiffTime("List to Map just loop : test End");

        for(TestClass testClass : testClassMap.values())
        {
            //System.out.println("key :" + testClass.Key + " value : " + testClass.values);
        }
    }


    public void Collection()
    {
        return;
    }
}

class TestClass
{
    public static int increaValue;
    public int Key;
    public float values;

    public TestClass()
    {
        increaValue++;
        this.Key = increaValue;
        this.values = increaValue * 2;
    }

}