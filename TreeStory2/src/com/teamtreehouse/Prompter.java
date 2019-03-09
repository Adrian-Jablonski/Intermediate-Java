package com.teamtreehouse;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.nio.file.Files.*;


public class Prompter {
    private BufferedReader mReader;
    private Set<String> mCensoredWords;

    public Prompter() {
        mReader = new BufferedReader(new InputStreamReader(System.in));
        loadCensoredWords();
    }

    private void loadCensoredWords() {
        mCensoredWords = new HashSet<String>();
        Path file = Paths.get("resources", "censored_words.txt");
        List<String> words = null;
        try {
            words = Files.readAllLines(file);
        } catch (IOException e) {
            System.out.println("Couldn't load censored words");
            e.printStackTrace();
        }
        mCensoredWords.addAll(words);
    }

    public void run(Template tmpl) {
        List<String> results = null;
        try {
            results = promptForWords(tmpl);
        } catch (IOException e) {
            System.out.println("There was a problem prompting for words");
            e.printStackTrace();
            System.exit(0);
        }
        // DONE- Print out the results that were gathered here by rendering the template

        String outcome = tmpl.render(results);
        System.out.printf("Your TreeStory:%n%n%s", outcome);
    }

    /**
     * Prompts user for each of the blanks
     *
     * @param tmpl The compiled template
     * @return
     * @throws IOException
     */
    public List<String> promptForWords(Template tmpl) throws IOException {
        List<String> words = new ArrayList<String>();
        for (String phrase : tmpl.getPlaceHolders()) {
            String word = promptForWord(phrase);
            words.add(word);
        }
        return words;
    }


    public String promptForStory() throws IOException {
        System.out.print("Enter Story:  ");
        String story = mReader.readLine();

        return story;
    }

    /**
     * Prompts the user for the answer to the fill in the blank.  Value is guaranteed to be not in the censored words list.
     *
     * @param phrase The word that the user should be prompted.  eg: adjective, proper noun, name
     * @return What the user responded
     */

    public String promptForWord(String phrase) throws IOException {
        // Done- Prompt the user for the response to the phrase, make sure the word is censored, loop until you get a good response.
        String inputtedWord = "";

        boolean censored = true;

        while (censored) {
            System.out.printf("Enter word for %s: ", phrase);
            inputtedWord = mReader.readLine();

            try {
                if (!inputtedWord.equals("") && indexOfList(mCensoredWords, inputtedWord.toLowerCase().trim()) == -1) {
                    censored = false;
                }
            } catch (NullPointerException e) {
                censored = false;
            }


        }
        return inputtedWord;
    }

    public int indexOfList(Set<String> list, String str) {
        for (String item: list) {
            if (item.equalsIgnoreCase(str)) {
                return 1;
            }
        }
        return -1;
    }
}
