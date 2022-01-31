package hello.JavaStudy.patterns.observer;

import javax.swing.text.html.parser.Entity;

public class Achievement extends Obsever{

    @Override
    public void onNotify(Entity entity, Event event)
    {
        switch(event)
        {
            case EVENT_ENTITY_FELL:

                break;

            case EVENT_ENTITY_FELL2:
                break;
        }

        return;
    }
}
