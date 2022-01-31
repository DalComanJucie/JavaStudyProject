package hello.JavaStudy.patterns.observer;

import javax.swing.text.html.parser.Entity;

public abstract class Obsever {

    public abstract void onNotify(Entity entity, Event event);
}
