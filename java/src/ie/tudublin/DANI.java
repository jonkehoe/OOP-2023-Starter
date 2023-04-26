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

		}
		

	}
}
