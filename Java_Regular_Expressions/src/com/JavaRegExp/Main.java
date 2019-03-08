package com.JavaRegExp;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter your zipcode: ");
        String zipCode = "12345";

        // Match zip code
        if (zipCode.matches("^\\d{5}(-\\d{4})?$")){
            System.out.printf("%s is a valid zip code%n", zipCode);
        } else {
            System.out.printf("%s is NOT a valid zip code%n", zipCode);
        }

        String skills = "JavaScript, HTML, CSS, and Java";

        // Match all words except and
        for (String skill: skills.split("\\W+(and\\W+)?")) {
            System.out.printf("Skill: %s %n",
                    skill);
        }

        String script = "Surely capturing shushes shall show how beneficial Regular Expressions actually are";
        // Matches all words with a sh, ti, su, ci, tu, and si in them with a case insensitive match
        Pattern pattern = Pattern.compile("(\\w*(sh|ti|su|ci|tu|si)\\w*)",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(script);
        while (matcher.find()) {
            System.out.printf("%s is a sushy word because of %s. %n",
                    matcher.group(1),
                    matcher.group(2)
            );
        }
    }
}
