//Problem Statement:https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem


public class JumpOnClouds {

    public static void main(String[]args){
        int arr[]=new int[]{1,0,0,1,0,0,1,0};
        System.out.println(jumpingOnClouds(arr));
    }

    public static int jumpingOnClouds(int[] c) {
        int steps = 0;
        int i=0;
        if(c[0]!=0){
            return 0;
        }
        while(i<c.length-1){
            if(c[i]==0){
                if(i<c.length-2 && c[i+2]==0){
                    steps += 1;
                    i+=2;
                }else if(c[i+1]==0){
                    steps += 1;
                    i+=1;
                }
            }
        }
        return steps;

    }
}
