
//        Problem Statement:
//        https://www.hackerrank.com/challenges/counting-valleys/problem
public class ValleyCount {

    public static void main(String[]args){
        System.out.println(valleyCount("UDDDUDUU"));
    }

    private static int valleyCount(String s) {
        int valleyCount = 0;
        int sum = 0;
        if(s.length()<2){
            return valleyCount;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='D' || s.charAt(i)=='d'){
                sum -= 1;
            }else if(s.charAt(i)=='U' || s.charAt(i)=='u'){
                sum += 1;
                if(sum==0){
                    valleyCount+=1;
                }
            }
        }
        return valleyCount;
    }

}
