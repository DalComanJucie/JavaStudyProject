package hello.JavaStudy.StandardJava.InnerClass;

public class InnerClass {

    public InnerClass()
    {

    }

    private class UpdateData
    {
        //요즘 이렇게 짜고있는데 이게 맞는지 확인할 길이 없네 .. ㅜㅜ
    }

    public void Process()
    {
       class PrivateData
       {

       }
       PrivateData a = new PrivateData();
       //내부 클래스는 함수 내에서만 사용 가능하네

        Init(new UpdateData());
        Update();
        UpdateToDB();
    }

    private int Init(UpdateData data)
    {
        return 0;
    }

    private int Update(){
        return 0;
    }

    private int UpdateToDB(){
        return 0;
    }
}
