package hello.JavaStudy.StandardJava;

class TestA<T>
{

}

class TestB<T extends  A> //A에 상속받은 애만 사용 가능하다.
{

}


class A
{
    public A()
    {

    }
}

class B extends  A
{

}

class C
{

}
public class Generic {

    public void Test()
    {
        TestA<A> test = new TestA<>();
        TestA<B> test4 = new TestA<>();
        TestA<C> test5 = new TestA<>();

        TestB<A> test3 = new TestB<>();
        TestB<B> test2 = new TestB<>();
        //TestB<C> test6 = new TestB<>(); 상속이 안되서 사용 안되네.


    }
}
