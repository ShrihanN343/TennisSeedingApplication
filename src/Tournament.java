import java.util.Calendar;

public class Tournament {

    //Instance variables (what does a tournament mean?)
    private final String name;
    private Bracket bracket;
    private Player players[];
    private Calendar dates;
    private final String location;
    private boolean isOver ;

    //constructors - abcdefghj
    public Tournament(String n, Player[] ps, Calendar d, String l){
        bracket = createBracket(ps);
        players = ps;
        dates = d;
        location = l;
        name = n;
        isOver = false;
    }

     public String getName(){
        return name;
     }

     public Bracket getBracket(){
        return bracket;
     }

     public Player[] getPlayers(){
        return players;
     }

     public Calendar getDates(){
        return dates;
     }

     public String getLocation(){
        return location;
     }

     public boolean isOver(){
        return isOver;
     }

}

