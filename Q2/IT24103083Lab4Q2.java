import java.util.Scanner;

  public class IT24103083Lab4Q2{
    public static void main(String[] args) {
      Scanner scanner =new Scanner(System.in);
       System.out.print("Enter exam marks (0-100): ");
        double exam_Marks = scanner.nextDouble();

        System.out.print("Enter lab submission marks (0-100): ");
        double lab_Marks =scanner.nextDouble();

        if (exam_Marks < 0 || exam_Marks > 100) {
            System.out.println("Invalid exam marks! Marks should be between 0 and 100.");

        } else if (lab_Marks < 0 || lab_Marks > 100) {
            System.out.println("Invalid lab marks! Marks should be between 0 and 100.");

        } else {
            System.out.print("Enter the percentage for the exam marks: ");
            double exam_Percentage =scanner.nextDouble();

            System.out.print("Enter the percentage for the lab marks: ");
            double lab_Percentage =scanner.nextDouble();

            if (exam_Percentage + lab_Percentage != 100) {
                System.out.println("Invalid percentages! The sum of percentages should be 100.");

            } else {
                double final_Mark = (exam_Marks * exam_Percentage / 100) + (lab_Marks * lab_Percentage / 100);
                System.out.println("The final mark is: " + final_Mark);
            }
        }
    }
}









    








