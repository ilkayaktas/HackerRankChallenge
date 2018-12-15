import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by ilkayaktas on 2018-12-15 at 22:02.
 */

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if(a.score > b.score){
            return -1;
        } else if (a.score == b.score){
            if(a.name.compareTo(b.name)>0){
                return 1;
            } else if(a.name.compareTo(b.name) == 0){
                return 0;
            } else{
                return -1;
            }
        } else{
            return 1;
        }
    }
}

public class ComparatorChecker{
    static Player[] player = new Player[]{
            new Player("amy",100),
            new Player("david",100),
            new Player("heraldo",50),
            new Player("aakansha",75),
            new Player("aleksa",150),
    };
    static Checker checker = new Checker();

    static void compare(){
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
