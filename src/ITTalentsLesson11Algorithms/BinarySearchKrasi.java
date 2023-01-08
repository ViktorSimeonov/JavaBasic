package ITTalentsLesson11Algorithms;

public class BinarySearchKrasi {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 10};
        int num = 1;
        int start = 0;
        int end = arr.length-1;
        int index = binarySearch(arr, num, start, end);
        System.out.println(index);
    }

    //find middle index ( it depends on (start+end)/2
    //check if the elements on the middle index==x
    //return
    static int binarySearch(int[] array, int num, int startArray, int endArray) {

        int middleElement = (startArray + endArray) / 2;
        if (startArray > endArray) {
            return -1;
        }
        if (num == array[middleElement]) {
            return middleElement;
        }
        if (num > array[middleElement]) {

            return binarySearch(array, num, middleElement + 1, endArray);
        } else {

            return binarySearch(array, num, startArray, middleElement - 1);
        }


    }

}