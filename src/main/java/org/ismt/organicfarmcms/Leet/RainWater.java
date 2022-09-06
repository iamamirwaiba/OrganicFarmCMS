package org.ismt.organicfarmcms.Leet;

import java.util.Arrays;

public class RainWater {
    public static void main(String[] args) {
        int[] height={4,2,0,3,2,5};
        trapWater(height);
    }

    public static int trapWater(int[] height){
        Arrays.stream(height).forEach(i -> System.out.println(i));
        return 0;
    }
}
