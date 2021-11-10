package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int Maxmirror = (mirror(mirrorlist()));
    }
    public static ArrayList<Integer> mirrorlist(){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        ArrayList<Integer> mirrornum = new ArrayList<Integer>();
        for (int i = 0; i < num.length(); i++) {
            int j = Integer.parseInt(String.valueOf(num.charAt(i)));
            mirrornum.add(j);
        }
        return mirrornum;
    }
    public static int mirror(ArrayList<Integer> mirrorlist){
        ArrayList<Integer> mirrornum = new ArrayList<Integer>();
        int j = 1;
        int mirrorsize = 0;
        for (int i: mirrorlist) {
            if(i == (mirrorlist.get(j - 1)+1) && (j-1) != 0){
                mirrornum.add(i);
            }
            if(i == (mirrornum.get(j-1)-1)){
                System.out.println("help");
            }
            j++;
        }
        return mirrorsize;
    }
}
