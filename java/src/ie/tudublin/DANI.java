package ie.tudublin;

import java.util.ArrayList;
import processing.data.Table;
import processing.data.TableRow;

import processing.core.PApplet;

public class DANI extends PApplet {

	private ArrayList<Word> model;

	public DANI() {

	}

	

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();

       
	}

	public void keyPressed() {

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}

	public Word findWord(String str) {
        for (Word word : model) {
            if (word.getWord().equals(str)) {
                return word;
            }
		}
		return null;
		
	}
	
	
	

	public void loadFile() {
		String[] lines = loadStrings("small.txt");

        for (String line : lines) {
            String[] words = split(line, ' ');

			for(int i = 0; i < words.length - 1; i++) {
				String word1 = words[i].replaceAll("[^\\w\\s]", "");
				word1.toLowerCase();

				Word w = findWord(word1);
				if (w == null) {
					w = new Word(word1);
					model.add(w);
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
		for(int i = 0; i < 14; i++) {
			for(int j = 0; j < 7; j++) {

			}
		}
	}
}
