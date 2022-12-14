package it.develhope.regex1;


public class Main {
    public static void main(String[] args) {
        String s1 = "I Like to code near the Lake with my friend Luke";

        System.out.println( s1.replaceAll("L[^u]ke","BLA"));
    }
}
