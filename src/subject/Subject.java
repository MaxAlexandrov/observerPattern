package subject;

import observer.Observer;

public interface Subject {
    public void removeObserver(Observer observer);
    public void addObserver(Observer observer);
    public void notifiAllObserver();
}
