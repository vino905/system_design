package creational.builder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Student student = new StudentBuilder("Vinod","Kalwani","5").build();

        System.out.println(student);
        String input = "/eosp/v1";

        // Define the regex pattern to match text between slashes
        Pattern pattern = Pattern.compile("/([^/]+)/");
        Matcher matcher = pattern.matcher(input);

        // Find and print the matched group
        if (matcher.find()) {
            String result = matcher.group(1);
            System.out.println(result);
        }
}}
