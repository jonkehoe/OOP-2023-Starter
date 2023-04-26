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
        String rs = "";
        for (Follow follow : follows) {
            rs += follow.toString() + "\n";
        }
        return rs;
    }

    public Follow findFollow(String str) {
        for(Follow follow : follows) {
            if(follow.getWord().equals(str)) {
                return follow;
            }
        }
        return null;
    }

    
}
