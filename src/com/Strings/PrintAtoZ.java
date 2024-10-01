package com.Strings;

import java.util.Arrays;

public class PrintAtoZ {
    public static void main(String[] args) {
        /*
        The problem here is , for each iteration a new object is being created and appending to the old object
        this will take o(N square) as 1+2+.......+N   sum is n(n+1)/2 ---> N^2
        So we can use a String builder method
         */
        String alpha = "";
        for (int i = 0; i < 26 ; i++) {
            char ch = (char)('a' + i);
            alpha = alpha + ch + " ";

        }
        //System.out.println(alpha);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);             // here for each iteration new character is added to the same object
                                            // time complexity will be o(n)
        }
//        System.out.println(builder);                      -> abcdefghijklmnopqrstuvwxyz
//        System.out.println(builder.reverse());            -> zyxwvutsrqponmlkjihgfedcba
//        System.out.println(builder.deleteCharAt(0));      -> yxwvutsrqponmlkjihgfedcba
//        System.out.println(builder.append(12));           -> yxwvutsrqponmlkjihgfedcba12

//        String name = "cherry chethan";
//        System.out.println(Arrays.toString(name.toCharArray()));  --> [c, h, e, r, r, y,  , c, h, e, t, h, a, n]
//        System.out.println(name.indexOf('e'));                    --> will give me 2




    }
}
