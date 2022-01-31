package hello.JavaStudy.patterns.command;

public class InputHandler {
    private Command button1;
    private Command button2;
    private Command button3;
    private Command button4;

    public void InputHandler()
    {

    }

    public void Input()
    {
        if(IsPressed(button1))
        {
            button1.excute(); //점프, 공격 , 이동 .. 어떤 커맨드든 넣으면 된다. 변경도 가능하다.
        }
        if(IsPressed(button2))
        {
            button2.excute();
        }
        if(IsPressed(button3))
        {
            button3.excute();
        }
        if(IsPressed(button4))
        {
            button4.excute();
        }
    }

    boolean IsPressed(Command command)
    {
        return true;
    }
}
