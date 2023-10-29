public interface Observed {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String type, int minimalAge, float cost);
}
