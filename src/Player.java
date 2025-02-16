
public class Player {

    //instance variables
    //private: can't be accessed outside of player.java
    private String name;
    private int age;
    private String place_of_origin;
    private char gender; // m = male, f=female
    private int points;

    //constructors - return type is player
    public Player(String n, int a, String origin, char g, int p) {
        name = n;
        age = a;
        place_of_origin = origin;
        gender = g;
        points = p;

    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getOrigin() {
        return place_of_origin;
    }

    public void addPoints(int p) {
        points += p;
    }

    //Overriding object toString()
    public String toString() {
        return "Name: "+name+", Age: "+age+", Country: "+place_of_origin
                +", Gender: "+gender+", Tour Points: "+points;
    }
}
