// 整数 k に対して、レベル k の ABC 文字列を次で定義します。

// ・レベル 1 の ABC 文字列は "ABC" です。
// ・レベル k の ABC 文字列は "A" + (レベル k - 1 の ABC 文字列) + "B" + (レベル k - 1 の ABC 文字列) + "C" です。
// 　・例 : レベル 2 の ABC 文字列は "A" + "ABC" + "B" + "ABC" + "C" = "AABCBABCC" となります。

// レベル k の ABC 文字列の s 文字目から t 文字目までを求めてください。

// 例)
// 入力例 1 では、レベル 2 の ABC 文字列の 3 文字目から 6 文字目を出力する必要があります。レベル 2 の ABC 文字列は "AABCBABCC" なので、 3 文字目から 6 文字目は "BCBA" となります。よって、 "BCBA" を出力する必要があります。
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
