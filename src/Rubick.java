public class Rubick implements Product{
    String name = "Rubicks cube";
    int minimumAge;
    float cost;
    public Rubick(int minimumAge, float cost){
        this.minimumAge = minimumAge;
        this.cost = cost;
    }
    @Override
    public void playInfo(){
        System.out.println("Try to disassemble and assemble cube and go faster and faster.");
    }
    @Override
    public String toString(){
        return name + ": Minimum Age " + minimumAge + ", Cost " + cost;
    }
}
