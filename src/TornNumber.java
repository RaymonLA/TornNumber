/**
 * Created by Raymon on 2014-04-15.
 */
public class TornNumber {

    public static void main(String[] args) {

        // Traverse through 0000 to 9999
        int n1=0, n2=0, n3=0, n4=0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {

                        if (i != j && i != k && i != l) {
                            if (j != k && j != l) {
                                if (k != j) {
                                    // Therefore all unique numbers
                                    int firstHalf = (i*10)+j, secondHalf = (k*10)+l;
                                    int full = firstHalf+secondHalf;
                                    int squared = full*full;
                                    if (squared == (i*1000)+(j*100)+(k*10)+(l)) {
                                        if (secondHalf < 10) {
                                            String secondHalfString = "0"+secondHalf;
                                            System.out.println("" + firstHalf + secondHalfString + " is a TORN Number!");
                                        } else {
                                            System.out.println("" + firstHalf + secondHalf + " is a TORN Number!");
                                        }
                                    } else {
                                        //System.out.println("" + squared + " is NOT a TORN Number!");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
