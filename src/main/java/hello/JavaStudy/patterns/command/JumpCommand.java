package hello.JavaStudy.patterns.command;

public class JumpCommand extends Command {

    @Override
    public void excute()
    {
        Jump();
        return;
    }

    private void Jump()
    {
        System.out.println("I Start Jump");
        return;
    }
}
