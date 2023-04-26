package ie.tudublin;

import java.util.ArrayList;

public class Word {

    private String word;
    ArrayList<Follow> follows;

    public Word(String word) {
        this.word = word;
        this.follows = new ArrayList<Follow>();
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<Follow> getFollows() {
        return follows;
    }

    public void setFollows(ArrayList<Follow> follows) {
        this.follows = follows;
    }

    public String toString() {
        for(Follow follow : follows) {
            System.out.println();
        }
    }

    
}
