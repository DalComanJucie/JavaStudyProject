package hello.JavaStudy.patterns.command;

public class FireCommand extends Command{
    public FireCommand()
    {

    }

    @Override
    public void excute()
    {
        Fire();
        return;
    }

    private void Fire()
    {
        System.out.println("I Start Fire");
        return;
    }
}
