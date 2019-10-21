//Problem Statement:https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class RepeatedString {
    public static void main(String args[]){
        System.out.println(repeatedString("aba",10));
    }
    public static long repeatedString(String s, long n) {
        long length = s.length();
        long repeatition = 0;
        int remaining = 0;
        long wholeString = n/length;
        long remainingChar = n%length;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                repeatition+=1;
            }
        }
        for(int i=0;i<remainingChar;i++){
            if(s.charAt(i)=='a'){
                remaining+=1;
            }
        }
        return wholeString*repeatition+remaining;
    }
}
