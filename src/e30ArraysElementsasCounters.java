import java.util.Random;
public class e30ArraysElementsasCounters {

    public static void main(String[] args) {
        Random rand = new Random();
        int freq[] = new int[7];

        for (int roll = 1; roll < 1000; roll++) {
            ++freq[1 + rand.nextInt(6)];// Generate a random number from 1 to 6 and increment the corresponding element in the "freq" array
        }
        System.out.println("Face\tFrequency");
        for (int face=1; face<freq.length;face++){
            System.out.println(face+"\t"+freq[face]);
        }

    }
}