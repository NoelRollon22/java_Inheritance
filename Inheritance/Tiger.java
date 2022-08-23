package Inheritance;

public class Tiger extends Felidae_Family {

    public Tiger(int age, int weight) {
        super(age, weight);
    }
    public static void main(String[] args) {
        Felidae_Family fam = new Felidae_Family(5, 50);
        fam.meowing();
    }
}
