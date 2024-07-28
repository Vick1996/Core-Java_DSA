package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeJava
{
    public static void main(String[] args)
    {
        String s = "GIRISH";
        StringBuilder sb = new StringBuilder(s);
        List<String> res = new ArrayList<>();

        findPermutations(sb, 0, res);
        System.out.println(res);

        int[] ar = new int[]{1, 2, 3};
        int[] ar2 = new int[]{4, 7, 6};
        int[] sum = addList(ar, ar2);

        for (int digit : sum) {
            System.out.print(digit);
        }
    }
    static void findPermutations(StringBuilder sb, int idx, List res)
    {
        if(idx==sb.length())
        {
            res.add(new StringBuilder(sb));
            return;
        }

        for(int i=idx; i<sb.length(); i++)
        {
            swap(sb, i, idx);
            findPermutations(sb, idx+1, res);
            swap(sb, i, idx);
        }
        return;
    }
    static void swap(StringBuilder sb, int i, int idx)
    {
        char c = sb.charAt(i);
        char d = sb.charAt(idx);
        sb.setCharAt(i, d);
        sb.setCharAt(idx, c);
    }

    static int[] addList(int[] first, int[] sec)
    {
        int len1 = first.length;
        int len2 = sec.length;
        int maxlen = len1 > len2 ? len1 : len2;
        int[] res = new int[maxlen + 1];
        int i=0;
        int carry=0;

        while(maxlen-- > 0)
        {
            int f = (i < len1) ? first[len1 - i - 1] : 0;
            int s = (i < len2) ? sec[len2 - i - 1] : 0;

            int sum = f + s + carry;

            res[res.length - i - 1] = sum % 10;
            carry = sum/10;

            i++; //carry=0;
        }
        if(carry > 0)
        {
            res[0] = carry;
            return res;
        }

        return Arrays.copyOfRange(res, 1, res.length);
    }
}
