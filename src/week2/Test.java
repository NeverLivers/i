package week2;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            ArrayWrapper.add(i);
        }
        for (int i = 0; i < 50; i++) {
            ArrayWrapper.add((int)(Math.random() * 1000));
        }

        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println(ArrayWrapper.getArr().length);
        System.out.println("returns element by index ");
        System.out.println(ArrayWrapper.get(24));
        System.out.println("copy of sorted array");
        System.out.println(Arrays.toString(ArrayWrapper.sort()));
        System.out.println("remove by index");
        ArrayWrapper.remove(35);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println("remove by value");
        ArrayWrapper.removeByValue(10);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println("search by value");
        System.out.println(ArrayWrapper.search(23));
        System.out.println("returns revers of array");
        System.out.println(Arrays.toString(ArrayWrapper.revers()));
        System.out.println("returns sub array");
        System.out.println(Arrays.toString(ArrayWrapper.revers()));
        System.out.println(Arrays.toString(ArrayWrapper.subArray(12, 27)));
        System.out.println("returns sum of all elements");
        System.out.println(ArrayWrapper.sum());
        System.out.println("add whole array");
        int[] newArr = new int[] {23, 54, 32, 453};
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.add(newArr);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println("add on specific position");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.add(12, 45);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println("prepend value");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        ArrayWrapper.prepend(123);
        ArrayWrapper.prepend(234);
        ArrayWrapper.prepend(345);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println("set new value instead old value");
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println(ArrayWrapper.set(22, 9876));
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println("search sub array");
        int[] testArr = new int[] {321, 231, 123};
        ArrayWrapper.add(testArr);
        ArrayWrapper.add(testArr);
        ArrayWrapper.add(testArr);
        System.out.println(Arrays.toString(ArrayWrapper.getArr()));
        System.out.println(ArrayWrapper.searchSubArray(testArr));
    }

}