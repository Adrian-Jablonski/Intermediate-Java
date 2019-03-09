package com.teamtreehouse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // DONE - Instantiate a new Prompter object and prompt for the story template
        Prompter prompter = new Prompter();
        String story = null;
        try {
            story = prompter.promptForStory();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Template tmpl = new Template(story);
        // DONE - Use the prompter object to have it do the prompting, censoring and outputting.  Call Prompter.run
        prompter.run(tmpl);
        List<String> fakeResults = Arrays.asList("friend", "talented", "java programmer", "high five");
        // DONE - This should really happen in the Prompter.run method, let's get these implemetation details out of the main method
//        String results = tmpl.render(fakeResults);
//        System.out.printf("Your TreeStory:%n%n%s", results);

    }
}
