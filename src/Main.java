import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int  k = sc.nextInt();
        int  s = sc.nextInt();
        int  t = sc.nextInt();

        String temp = asd(k).substring(s-1,t);
        System.out.println(asd(k));
        System.out.println(temp);
    }


    private static String asd(int k){
        //!!!!!String : OutOfMemoryError
        String [] str = new String[49];
        str[0] = "ABC";
        for (int i = 1;i<k;i++){

            str[i] =  "A" + str[i-1] + "B" + str[i-1] + "C";
        }
        return str[k-1];
    }
}