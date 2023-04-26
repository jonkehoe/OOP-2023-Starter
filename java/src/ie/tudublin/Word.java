package ie.tudublin;

import java.util.ArrayList;

public class Word {

    private String word;
    ArrayList<Follow> follows;

    public Word(String word) {
        this.word = word;
        this.follows = new ArrayList<Follow>();
    }

    // get the word
    public String getWord() {
        return word;
    }

    //set the word as a string
    public void setWord(String word) {
        this.word = word;
    }

    // itterate throught rhe array 
    public ArrayList<Follow> getFollows() {
        return follows;
    }

    // set the array to be used
    public void setFollows(ArrayList<Follow> follows) {
        this.follows = follows;
    }


    // the toString method is used to print each word
    public String toString() {
        String rs = "";
        for (Follow follow : follows) {
            rs += follow.toString() + "\n";
        }
        return rs;
    }


    // find if there are words the same 
    public Follow findFollow(String str) {
        for(Follow follow : follows) {
            if(follow.getWord().equals(str)) {
                return follow;
            }
        }
        return null;
    }

    
}
