package ITTalentsPractice2Arrays;

public class Task10_TheMostOccurrenceNumber {
    public static void main(String[] args) {
       /* 10. Напишете програма, която намира най-често срещания елемент
        в масив. Пример: {4, 1, 1, 4, 2, 3,4, 4, 1, 2, 4, 9, 3} => 4 (5 times).*/
        int[] array = {2, 3, 4, 53, 4, 2, 3, 4, 3, 2, 1, 1, 3, 3, 4, 5, 45};
        int currentNum = 0;
        int maxOccurrenceNumber = 0;
        int occurrence = 0;
        int maxOccurrence = 0;
        for (int i = 0; i < array.length; i++) {
            currentNum = array[i];
            for (int j = 0; j < array.length; j++) {
                if (currentNum == array[j]) {
                    occurrence++;
                }
            }
            if (occurrence > maxOccurrence) {
                maxOccurrence = occurrence;
                maxOccurrenceNumber = currentNum;
            }
            occurrence=0;
        }
        System.out.print(maxOccurrenceNumber+" ("+maxOccurrence+" times).");
    }
}
