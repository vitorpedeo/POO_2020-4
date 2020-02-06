package aula12.salaaula.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private List<Subscriber> subscribers = new ArrayList<>();
    String title;

    public void subscribe(Subscriber sub) {
        this.subscribers.add(sub);
    }

    public void unsubscribe(Subscriber sub){
        this.subscribers.remove(sub);
    }

    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update();
        }
    }

    public void uploadVideo(String title) {
        this.title = title;
        notifySubscribers();
    }

}
