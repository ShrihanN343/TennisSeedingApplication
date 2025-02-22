public class Bracket {

    //Instance variables: "what does a bracket mean to a computer?"
    private int size; //size has to be 8<=size<=128, and has to be a power of 2
    private Player players[];
    private Round rounds[]; //used for scores, what round is the tournament on, etc.

    public Bracket(int s, Player[] ps){
        size=s;
        players = ps;
        rounds = new Round[(int)(Math.log(size)/Math.log(2))];

        init_rounds(); //abstraction

    }
    public update(int round_num, int match_num, MatchResult mr){

    }

}



