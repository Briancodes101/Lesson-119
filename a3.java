import java.util.*;

class Main2 {
    public static void main(String[] args) {
        int sum = 0;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Subjects: ");
        int noOfSubjects = sc.nextInt();
        int marks[] = new int[noOfSubjects]; // initializing an array to store marks of each subject
        System.out.println("Enter the marks of " + noOfSubjects + " Subjects. Press Enter to give marks for another subject: ");
        // Entering marks
        for (int i=0; i<noOfSubjects; i++) {
            marks[i] = sc.nextInt();
        }// calculating the sum of marks
        for (int j=0; j<noOfSubjects; j++) {
            sum += marks[j];
        }// generating the result
        int percentage = (sum/noOfSubjects);
        // can also be written as: percentage = (sum/noOfSubjects*100)*100; but since we are only interested in the percentage and not the total marks, we can directly divide the sum by the number of subjects to get the percentage.
        System.out.println(percentage + "%");
        if (percentage >= 95) {
            result = "You scored O grade. Great work!";
        } else if (percentage >= 90 && percentage<95) {
            result = "You scored A+. Well Done!";
        }
        //make sure to create grading for other marks too
        //percentage can also be converted to cgpa
        else {
            result = "you passed";
        }
        System.out.println(result);
    }
}