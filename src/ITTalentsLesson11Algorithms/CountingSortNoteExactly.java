package ITTalentsLesson11Algorithms;

public class CountingSortNoteExactly {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 10};
        int num = 6;
        int start = 0;
        int end = arr.length;
        int index = binarySearch(arr, num, start, end);
        System.out.println(index);
    }
    //find middle index ( it depends on (start+end)/2
    //check if the elements on the middle index==x
        //return
    static int binarySearch(int[] array, int num, int startArray, int endArray) {

        int middleElement = startArray + (endArray - startArray) / 2;

        if (num > middleElement) {
            startArray = middleElement;
            endArray = array.length;
            middleElement = startArray + (endArray - startArray) / 2;
            return binarySearch(array, num, startArray, endArray);
        }
        if (num < middleElement) {
            startArray = 0;
            endArray = middleElement;
            middleElement = startArray + (endArray - startArray) / 2;
            return binarySearch(array, num, startArray, endArray);
        }
        if (num == middleElement) {
            return middleElement;
        }
        return -1;


    }
}

