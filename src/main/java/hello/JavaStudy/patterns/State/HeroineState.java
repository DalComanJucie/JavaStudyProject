package hello.JavaStudy.patterns.State;

public abstract class HeroineState {
    public abstract  void handleInput(Heroine heroine, Input input);
    public abstract  void update(Heroine heroine);
}
