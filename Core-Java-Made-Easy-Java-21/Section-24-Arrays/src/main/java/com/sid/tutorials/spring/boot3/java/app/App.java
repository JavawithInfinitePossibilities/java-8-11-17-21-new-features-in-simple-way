package com.sid.tutorials.spring.boot3.java.app;

import com.sid.tutorials.spring.boot3.java.app.data.DummyDataTable;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] values = DummyDataTable.intArrayData();
        System.out.println("One Dimensional Array :"+Arrays.toString(values));
        int[] myNum=new int[10];
        for(int i=0;i<myNum.length;i++){
            myNum[i]=values[i];
        }
        System.out.println("One Dimensional Array :"+Arrays.toString(myNum));
        int[] welcomeValues={1,2,3,4,5,6,7,8,9,10};
        System.out.println("One Dimensional Array :"+Arrays.toString(welcomeValues));
        int[][] twoDimensionalArray=new int[welcomeValues.length][welcomeValues.length];
        System.out.println("Two Dimensional Array :"+Arrays.deepToString(twoDimensionalArray));
    }
}
