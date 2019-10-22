//Problem Statement:https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
public class LeftArrayRotation {
    public static void main(String[]args){
        int arr[] = new int[]{1,2,3,4,5};
        int result[] = rotLeft(arr,4);
        for(int i:result)
            System.out.print(i+" ");
    }

    static int[] rotLeft(int[] a, int d) {
        int length = a.length;
        int result[] = new int[length];
        for(int i=d,j=0;i<length;i++,j++){
            result[j]=a[i];
        }
        for(int i=0,j=length-d;i<d;i++,j++){
            result[j]=a[i];
        }
        return result;
    }
}
