public class DoubleArray {

    public static void main(String[] args) {
        // Declare variables and constants
        double total = 0, avg = 0;
        int gradesArray[][] = {{87, 96, 70},{68, 87, 90},
                               {94, 100, 90},{100, 81, 82},
                               {83, 65, 85},{78, 87, 65},
                               {85, 75, 83},{91, 94, 100},
                               {76, 72, 84},{87, 93, 73}};
         
        System.out.println("Welcome to the grade book for" + "\n" +
                           "DPRS20 Introduction to Java Programming" + "\n\n" +
                           "The grades are: " + "\n" +
                           "\t" + "\tTest 1" + "\tTest 2" + "\tTest 3");
        
        for(int i=0; i<gradesArray.length; i++){
            System.out.print("Student " + (i+1));
            
            for(int j=0; j<gradesArray[i].length; j++)
                System.out.print("\t " + gradesArray[i][j]);
                total += gradesArray[i][0] + gradesArray[i][1] + gradesArray[i][2];
                avg = (total / gradesArray.length);
                System.out.println();
                
        }
        System.out.println("Points " + total);
        System.out.println("Average " + avg);
        
    }
    
}
