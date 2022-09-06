package org.ismt.organicfarmcms.Leet;

public class Recursion {
    public static void main(String[] args) {
        recursion(1000);
    }

    static void recursion(int i){
        if(i>0){
            System.out.println(i);
            recursion(i-1);
        }
    }
}
