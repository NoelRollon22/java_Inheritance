package Inheritance;

public class Animal {

    public Animal(int age, int weight){
        this.age = age;
        this.weight = weight;
    }
    int age;
    int weight;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(){
        this.weight = weight;
    }

    public static void running(){
        System.out.print("Animal Running");
    }
    public static void eating(){
        System.out.print("Animal Eating");
    }

}
