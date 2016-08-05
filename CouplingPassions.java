package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ankit on 8/5/2016.
 */
public class CouplingPassions {
    public static class GuestList {
        int m;
        String[] passionList = new String[m+1];

        public GuestList() {
        }
    }

    public class Destination {
        String destinationName;
        float latitude, longitude;
        int z;
        String[] destinationPassion = new String[z];
    }

    public static void main(String args[]) throws IOException {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        GuestList[] guestLists = new GuestList[n];
        for (int i = 0; i < n; i++) {
            guestLists[i] = new GuestList();
        }
        //Reading GuestList Data
        for (GuestList x : guestLists) {
            String input1[] = br.readLine().split(" ");
            x.m = Integer.parseInt(input1[0]);
            System.out.println(x.m);
            for (int i = 0; i < x.m; i++) {
                //x.passionList[i] = input1[i + 1];
                x.passionList[i] = input1[i ];
                System.out.println(input1[i]);
            }
        }
        /*int length = guestLists.length;
        for (int i = 0; i < length; i++) {
            for (GuestList x : guestLists) {
                System.out.println(x.m);
                for (int j = 0; j < x.m; j++) {
                    System.out.println(x.passionList[j]);
                }
            }
        }*/
        //System.out.println(n);
    }
}
