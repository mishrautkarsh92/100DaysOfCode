import java.util.HashMap;
import java.util.Map;

/*Problem Statement:
https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup*/
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