package ie.tudublin;

import java.util.ArrayList;
import java.util.Random;
import processing.data.Table;
import processing.data.TableRow;

import processing.core.PApplet;

public class DANI extends PApplet {

	// Declared Array + the displayedSonnet which stores the sonnet to be displayed
	private ArrayList<Word> model = new ArrayList<Word>();
	public String displayedSonnet;

	public DANI() {

	}

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;



	public void setup() {
		colorMode(HSB);
		loadFile();
		writeSonnet();
		printModel();
	}

	// Add code to generate a new sonnet on keyPress
	public void keyPressed() {
		if(key == ' ') {
			writeSonnet();
		}

	}

	float off = 0;

	public void draw() 
    {
		background(255);
		fill(0);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
		// displays the sonnet to the screen
		text(displayedSonnet, 20, 20, width - 40, height - 40);
        
	}


	// find words that are the same 
	public Word findWord(String str) {
        for (Word word : model) {
            if (word.getWord() == str) {
                return word;
            }
		}
		// return null if the word is not in the same
		return null;
		
	}
	
	
	
	// loads and corrects the words to be displayed
	public void loadFile() {
		// load the txt in
		String[] lines = loadStrings("shakespere.txt");

        for (String line : lines) {
			// split a string into an array of words
            String[] words = split(line, ' ');

			for(int i = 0; i < words.length - 1; i++) {
				// remove the punctiation charecters
				String word1 = words[i].replaceAll("[^\\w\\s]", "");
				String word2 = words[i].replaceAll("[^\\w\\s]", "");
				word1.toLowerCase();
				word2.toLowerCase();

				// checks to see if first word is in the model 
				Word w = findWord(word1);
				// if the word is not in the model it creates a new word object
				if (w == null) {
					w = new Word(word1);
					model.add(w);
				}

				// checks to see if the second word is in the model
				Follow follows = w.findFollow(word2);
				if (follows == null) {
					// if not the word is created and added to the model
					w.getFollows().add(new Follow(word2, 1));
				}
				else {
					// if the word exists it just incramenst the count of it
					follows.setCount(follows.getCount() + 1);
				}
				

			}


		}
		

	}

	public void printModel() {
		for (Word word : model) {
			System.out.println(word);
		}

	}

	public void writeSonnet() {
		String sonnet = " ";
		Random random = new Random();

		// Uses a for loop to incrament a 14 line sonnet
		for(int i = 0; i < 14; i++) {
			// picks a random word
			Word newWord = model.get(random.nextInt(model.size()));
	
			String line = newWord.getWord();

			// reapetes 8 times 
			for (int j = 0; i < 7; i++) {
				ArrayList<Follow> follows = newWord.getFollows();
	
				if (follows.isEmpty()) {
					break;
				}
				
				// otherwise pick a random follow word
				Follow nextFollow = follows.get(random.nextInt(follows.size()));
				line += " " + nextFollow.getWord();
				newWord= findWord(nextFollow.getWord());
			}

			// create new space for word
			sonnet += line + " ";
		}
		// save the sonnet in a variable to print to screen
		displayedSonnet = sonnet.toString();
		System.out.println(displayedSonnet);
	}
}
