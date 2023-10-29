public class BuzzLighter implements Product{
    String name = "BuzzLighter";
    int minimumAge;
    float cost;
    public BuzzLighter(int minimumAge, float cost){
        this.minimumAge = minimumAge;
        this.cost = cost;
    }
    @Override
    public void playInfo(){
        System.out.println("Buzz is good to play space-pirates. Push button on his belly to fire laser.");
    }
    @Override
    public String toString(){
        return name + ": Minimum Age " + minimumAge + ", Cost " + cost;
    }
}
