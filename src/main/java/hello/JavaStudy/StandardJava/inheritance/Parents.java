package hello.JavaStudy.StandardJava.inheritance;

import java.io.IOException;

public class Parents
{
    public int m_Value1;
    public int m_Value2;

    public Parents()
    {

    }

    public Parents(int a )
    {
        this.m_Value2 = 2;
    }

    public int ExceptionTest() throws IOException {


        return 0;
    }
}

class Child extends Parents {
    int m_Value2;

    public Child()
    {
        super(20);
        this.m_Value1 = 20;
    }

    public int ExceptionTest()
    {
        Child ch = new Child();

        boolean b = ch instanceof Parents;


        return 0;
    }
}
