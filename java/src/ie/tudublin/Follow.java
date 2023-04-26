package ie.tudublin;

public class Follow {
    private String word;
    private int count;

    // Constructer for Follow
    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }

    // get the string word
    public String getWord() {
        return word;
    }

    // get the int count
    public int getCount() {
        return count;
    }

    // set the string to type string
    public void setString(String word) {
        this.word = word;
    }

    // set the value of count to int
    public void setCount(int count) {
        this.count = count;
    }

    // print word and count to screen
    public String toString() {
        return "word=" + word + ", count=" + count;
    }

}
