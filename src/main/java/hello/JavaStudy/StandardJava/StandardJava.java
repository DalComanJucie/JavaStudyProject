package hello.JavaStudy.StandardJava;

public class StandardJava {
    int a ;
    int b;
    static int c;

    static { c = 20; }
    { a =20; b=30; }

    public StandardJava()
    {
        this.a = 20;
        this.b = 30;
    }

    public void Update()
    {
        try
        {
            int a =20;
        }
        catch (Exception ex)
        {
            //try Catch 테스트 용도로 만들어 놓은거 같은데. 아직 테스트 진행하지 않았음. 노트북 오면 진행.
        }
        int b =20;
        System.out.println(b);

        return;
    }
}
