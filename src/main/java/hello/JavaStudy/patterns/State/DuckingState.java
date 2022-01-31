package hello.JavaStudy.patterns.State;

public class DuckingState extends HeroineState {

    @Override
    public void handleInput(Heroine heroine, Input input)
    {
        if(input == Input.RELEASE_DOWN)
        {
            heroine.setGraphics(EState.E_STATE_STANDING);
        }
        return;
    }

    @Override
    public void update(Heroine heroine)
    {
        return;
    }
}
