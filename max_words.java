package Algorithms.String_practice;

public class max_words {
    public static void main(String[] args) {
        String[] sentences= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max=0;
        for(int i=0;i<sentences.length;i++){
            max=Math.max(max,(sentences[i].split(" ")).length);
            System.out.println(max);
        }
    }
}
