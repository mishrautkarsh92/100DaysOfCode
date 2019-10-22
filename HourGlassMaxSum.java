import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Problem Statement:https://www.hackerrank.com/challenges/2d-array/problem
public class HourGlassMaxSum {
    static int hourglassSum(int[][] arr) {
        int maxSum=-45;
        int hourGlassSum=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                hourGlassSum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                        arr[i+1][j+1]+
                        arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(hourGlassSum>maxSum){
                    maxSum = hourGlassSum;
                    hourGlassSum = 0;
                }else{
                    hourGlassSum=0;
                }
            }
        }
        return maxSum;
    }
}
