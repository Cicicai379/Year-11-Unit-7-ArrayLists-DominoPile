import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class DominoPile {
    private ArrayList<Domino> pile = new ArrayList<Domino>();
    public DominoPile(){
//    Domino domino = new Domino();

    }
    public ArrayList<Domino> getPile(){
        return this.pile;
    }
    public void newStack6(){
        for(int i=0; i<7; i++){
            for(int j=i; j<7; j++){ //no repeat
                Domino domino = new Domino();
                domino.setTop(i);
                domino.setBottom(j);
                pile.add(domino);
            }
        }

    }
// puts the dominos in a random order within the stack.
//  Option #1
    public void shuffleOptionOne() {
        int l=pile.size();
        for(int i=0; i<l; i++) {
            int a = ThreadLocalRandom.current().nextInt(0, pile.size());//random index
            ArrayList<Domino> newPile = new ArrayList<Domino>();
            newPile.add(pile.get(a));
            pile.remove(a);
        }
    }
    //  Option #1
    public void shuffleOptionTwo(){
        for(int i=0; i<10000;i++){
            int a = ThreadLocalRandom.current().nextInt(0, pile.size());//random index
            int b = ThreadLocalRandom.current().nextInt(0, pile.size());//random index
            Collections.swap(pile, a,b);
            }

    }
}
