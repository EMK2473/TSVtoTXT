import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;

public class TSVtoTXT {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      String fileName = scnr.nextLine();
      FileInputStream fileInputStream =  new FileInputStream(fileName);
      Scanner fileScanner = new Scanner(fileInputStream);
      
      float midTerm1Sum = 0;
      float midTerm2Sum = 0;
      float finalSum = 0;
      int recordCount = 0;
      
      PrintWriter outputFile = new PrintWriter(new FileOutputStream("report.txt"));
      

      while (fileScanner.hasNextLine()) {
         String[] fields = fileScanner.nextLine().split("\t");
         recordCount++;
         
         String lastName = fields[0];
         String firstName = fields[1];
         int midterm1 = Integer.parseInt(fields[2]);
         int midterm2 = Integer.parseInt(fields[3]);
         int finalExam = Integer.parseInt(fields[4]);
         
         float average = (midterm1 + midterm2 + finalExam) / 3.0f; 
         
         String grade;
         if (average >= 90) {
            grade = "A";
         }
         else if (average >= 80) {
            grade = "B";
         }
         else if (average >= 70) {
            grade = "C";
         }
         else if (average >= 60) {
            grade = "D";
         } else {
            grade = "F";
         }
      
         outputFile.printf("%s\t%s\t%d\t%d\t%d\t%s\n", lastName, firstName, midterm1, midterm2, finalExam, grade);

         midTerm1Sum += midterm1;
         midTerm2Sum += midterm2;
         finalSum += finalExam;
         
      }

      float avg_midterm1 = (midTerm1Sum / recordCount);
      float avg_midterm2 = (midTerm2Sum / recordCount);
      float avg_finalG = (finalSum / recordCount);
      
      outputFile.printf("Averages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n", avg_midterm1, avg_midterm2, avg_finalG);
      
      fileScanner.close();
      outputFile.close();
      
      Scanner reportScnr = new Scanner(new File("report.txt"));
      while (reportScnr.hasNextLine()) {
         System.out.println(reportScnr.nextLine());
      }
      reportScnr.close();
      scnr.close();
   }
}