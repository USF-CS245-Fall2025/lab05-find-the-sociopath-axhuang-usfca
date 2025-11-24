// Wasn't able to get gradle/junit to import properly, so just wrote my own test cases. If set up properly,
// the code could easily be changed by comparing the result and expectedResult with assertTrue.

import java.util.ArrayList;

public class SociopathTest {
    static void test1(){
        Sociopath lab = new Sociopath();
        ArrayList<int []> likeList = new ArrayList<>();
        int[] pair1 = {1, 2};
        likeList.add(pair1);
        int groupSize = 2;

        int result = lab.findTheSociopath(groupSize, likeList);
        int expectedResult = 2;
        
        if (result == expectedResult) {
            System.out.println("Test passed: Expecting " + expectedResult + ", Returned " + result);
        } else {
            System.out.println("Test failed: Expecting " + expectedResult + ", Returned " + result);
        }
    }

    static void test2(){
        Sociopath lab = new Sociopath();
        ArrayList<int []> likeList = new ArrayList<>();
        int[] pair1 = {1, 2};
        likeList.add(pair1);
        int groupSize = 3;

        int result = lab.findTheSociopath(groupSize, likeList);
        int expectedResult = -1;
        
        if (result == expectedResult) {
            System.out.println("Test passed: Expecting " + expectedResult + ", Returned " + result);
        } else {
            System.out.println("Test failed: Expecting " + expectedResult + ", Returned " + result);
        }
    }

    static void test3(){
        Sociopath lab = new Sociopath();
        ArrayList<int []> likeList = new ArrayList<>();
        int[] pair1 = {1, 2};
        likeList.add(pair1);
        int[] pair2 = {1, 3};
        likeList.add(pair2);
        int[] pair3 = {2, 3};
        likeList.add(pair3);
        int groupSize = 3;

        int result = lab.findTheSociopath(groupSize, likeList);
        int expectedResult = 3;
        
        if (result == expectedResult) {
            System.out.println("Test passed: Expecting " + expectedResult + ", Returned " + result);
        } else {
            System.out.println("Test failed: Expecting " + expectedResult + ", Returned " + result);
        }
    }

    static void test4(){
        Sociopath lab = new Sociopath();
        ArrayList<int []> likeList = new ArrayList<>();
        int[] pair1 = {1, 2};
        likeList.add(pair1);
        int[] pair2 = {2, 3};
        likeList.add(pair2);
        int[] pair3 = {3, 1};
        likeList.add(pair3);
        int groupSize = 3;

        int result = lab.findTheSociopath(groupSize, likeList);
        int expectedResult = -1;
        
        if (result == expectedResult) {
            System.out.println("Test passed: Expecting " + expectedResult + ", Returned " + result);
        } else {
            System.out.println("Test failed: Expecting " + expectedResult + ", Returned " + result);
        }
    }

    static void test5(){
        Sociopath lab = new Sociopath();
        ArrayList<int []> likeList = new ArrayList<>();
        int[] pair1 = {1, 2};
        likeList.add(pair1);
        int groupSize = 0;

        int result = lab.findTheSociopath(groupSize, likeList);
        int expectedResult = -1;
        
        if (result == expectedResult) {
            System.out.println("Test passed: Expecting " + expectedResult + ", Returned " + result);
        } else {
            System.out.println("Test failed: Expecting " + expectedResult + ", Returned " + result);
        }
    }

    static void test6(){
        Sociopath lab = new Sociopath();
        ArrayList<int []> likeList = new ArrayList<>();
        int[] pair1 = {1, 0};
        likeList.add(pair1);
        int groupSize = 3;

        int result = lab.findTheSociopath(groupSize, likeList);
        int expectedResult = -1;
        
        if (result == expectedResult) {
            System.out.println("Test passed: Expecting " + expectedResult + ", Returned " + result);
        } else {
            System.out.println("Test failed: Expecting " + expectedResult + ", Returned " + result);
        }
    }
    
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }
}
