package week2;

public class ArrayWrapper {

    private static int[] arr = new int[50];
    private static int size = 0;

    public static void add(int num) {
        if(size >= arr.length) {
            extendArray();
        }
        arr[size++] = num;
    }

    private static void extendArray() {
        int[] newArr = new int[size << 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public static int[] getArr(){
        return arr.clone();
    }

    // returns element by index
    public static int get(int index) {
        if(index < arr.length && index >=0) {
            return arr[index];
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    // copy of sorted array
    public static int[] sort(){
        int copy = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if(arr[j] > arr[i]){
                    copy = arr[i];
                    arr[i] = arr[j];
                    arr[j] = copy;
                }
            }
        }
        return arr;
    }

    // remove by index
    public static void remove(int index) {
        if (index < arr.length){
            int[] newArr = new int[arr.length - 1];
            System.arraycopy(arr, 0, newArr, 0, index);
            System.arraycopy(arr, index + 1, newArr, index, newArr.length - index);
            arr = newArr;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    // remove by value
    public static void removeByValue(int value) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == value) {
                remove(i);
                break;
            }
        }
    }

    // search by value
    public static int search(int value) {
        int bot = 0;
        int top = arr.length - 1;

        while (bot <= top) {
            int mid = (bot + top) >>> 1;
            int midValue = arr[mid];
            if (midValue == value) {
                return mid;
            } else if (midValue > value) {
                top = mid - 1;
            } else if (midValue < value) {
                bot = mid + 1;
            }
        }
        return -(bot + 1);
    }

    // returns revers of array
    public static int[] revers(){
        int [] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arr.length - 1 - i];
        }
        arr = newArray;
        return arr;
    }

    // returns sub array
    public static int[] subArray(int start, int end){
        int[] arrSub = new int[end - start];
        System.arraycopy(arr, start, arrSub, 0, end - start);
        return arr = arrSub;
    }

    // returns sum of all elements
    public static int sum(){
        int sumAll = 0;
        for (int i : arr){
            sumAll += arr[i];
        }
        return sumAll;
    }

    // add whole array
    public static void add(int[] newArr) {
        int[] arrAdd = new int[arr.length + newArr.length];
        System.arraycopy(arr, 0, arrAdd, 0, arr.length);
        System.arraycopy(newArr, 0, arrAdd, arr.length, newArr.length);
        arr = arrAdd;
    }

    // add on specific position
    // if index greater then size -> throw ArrayIndexOutOfBoundsException
    public static void add(int index, int value) {
        int[] tmp = getArr();
        if (index < tmp.length && index >= 0) {
            tmp[index] = value;
            arr = tmp;
        }
    }

    // prepend value
    public static void prepend(int num) {
        int[] tmp = new int[arr.length + 1];
        System.arraycopy(arr, 0, tmp, 1, arr.length);
        tmp[0] = num;
        arr = tmp;
    }

    // set new value instead old value
    // if index greater then size -> throw ArrayIndexOutOfBoundsException
    public static int set(int index, int value) {
        int old;
        if (index <= arr.length) {
            old = arr[index];
            arr[index] = value;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
        return  old;
    }

    // search sub array
    public static int searchSubArray(int[] subArray){
        int dopArr = 0;
        int elements;
        int i = 0;

        while (i <= arr.length - subArray.length) {
            elements = 0;

            if (arr[i] == subArray[0]) {
                elements = 1;

                for (int j = 1; j < subArray.length; j++) {

                    if (arr[i + j] == subArray[j]) {
                        elements++;
                    } else {
                        break;
                    }
                }

                if (elements == subArray.length) {
                    dopArr++;
                    i = i + subArray.length;
                } else {
                    i++;
                }

            } else {
                i++;
            }

        }
        return dopArr;
    }



    public static void removeSubArray(int[] subArray) {
    }


}

