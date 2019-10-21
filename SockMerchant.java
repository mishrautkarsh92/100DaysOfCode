import java.util.HashMap;
import java.util.Map;

/*Problem Statement:

        John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
        For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
        Function Description
        Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
        sockMerchant has the following parameter(s):
        n: the number of socks in the pile
        ar: the colors of each sock
        Input Format
        The first line contains an integer , the number of socks represented in .
        The second line contains  space-separated integers describing the colors  of the socks in the pile.
        Constraints
        where
        Output Format
        Return the total number of matching pairs of socks that John can sell.
        Sample Input
        9
        10 20 20 10 10 30 50 10 20
        Sample Output
        3*/
public class SockMerchant {

    public static void main(String[]args){
        int arr[]=new int[]{10,20,20,10,10,30,50,10,20};
        System.out.println(getPair(arr,arr.length));
    }

    private static int getPair(int[] arr, int length) {
        int totalPair = 0;
        Map<Integer,Integer> pairMap = new HashMap<Integer,Integer>();
        for(int i:arr){
            if(pairMap.get(i)!=null){
                System.out.println(pairMap.get(i));
                pairMap.put(i,pairMap.get(i)+1);
            }else{
                pairMap.put(i,1);
            }
        }
        System.out.println(pairMap);
        for(Map.Entry<Integer,Integer> entry:pairMap.entrySet()){
            if(entry.getValue()>=2){
                totalPair += entry.getValue()/2;
            }
        }
        return totalPair;
    }

}