import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      // read file from input
      String fileName = scnr.nextLine();
      FileInputStream fileInputStream =  new FileInputStream(fileName);
      Scanner fileScanner = new Scanner(fileInputStream);
      
      // variables for grade values and record count
      float midTerm1Sum = 0;
      float midTerm2Sum = 0;
      float finalSum = 0;
      int recordCount = 0;
      
      // open the output file
      PrintWriter outputFile = new PrintWriter(new FileOutputStream("report.txt"));
      
      // while filescanner hasNextLine is true
      while (fileScanner.hasNextLine()) {
         // split the lines into fields
         String[] fields = fileScanner.nextLine().split("\t");
         // iterate recordCount
         recordCount++;
         
         // deconstruct fields into variables
         String lastName = fields[0];
         String firstName = fields[1];
         int midterm1 = Integer.parseInt(fields[2]);
         int midterm2 = Integer.parseInt(fields[3]);
         int finalExam = Integer.parseInt(fields[4]);
         
         // calculate avg score
         float average = (midterm1 + midterm2 + finalExam) / 3.0f; 
         
         // if else for grade scale 
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
      
         // write data to "report.txt" file
         outputFile.printf("%s\t%s\t%d\t%d\t%d\t%s\n", lastName, firstName, midterm1, midterm2, finalExam, grade);
         
         // update sums
         midTerm1Sum += midterm1;
         midTerm2Sum += midterm2;
         finalSum += finalExam;
         
      }
      // calculate averages
      float avg_midterm1 = (midTerm1Sum / recordCount);
      float avg_midterm2 = (midTerm2Sum / recordCount);
      float avg_finalG = (finalSum / recordCount);
      
      // write averages to "report.txt" file
      outputFile.printf("Averages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n", avg_midterm1, avg_midterm2, avg_finalG);
      
      // close scanner and file streams
      fileScanner.close();
      outputFile.close();
      
      // print out data on "report.txt." file
      Scanner reportScnr = new Scanner(new File("report.txt"));
      while (reportScnr.hasNextLine()) {
         System.out.println(reportScnr.nextLine());
      }
      
      // close scanners
      reportScnr.close();
      scnr.close();
      
      
   }
}