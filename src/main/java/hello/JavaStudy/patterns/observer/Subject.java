package hello.JavaStudy.patterns.observer;

import javax.swing.text.html.parser.Entity;
import java.awt.image.TileObserver;
import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Obsever> obseverList = new ArrayList<>();

    public void addObserver(Obsever observer)
    {
        obseverList.add(observer);
    }

    public void removeObserver(Obsever obsever)
    {
        obseverList.remove(obsever);
    }

    protected void notify(Entity entity, Event event)
    {
        for(Obsever item : obseverList)
        {
            item.onNotify(entity, event);
        }

        return;
    }
}
