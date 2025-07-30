package project;

import java.util.*;


class Student {
 int rollNo;
 String name;
 int mathMarks;
 int scienceMarks;
 int englishMarks;

 Student(int rollNo, String name, int mathMarks, int scienceMarks, int englishMarks) {
     this.rollNo = rollNo;
     this.name = name;
     this.mathMarks = mathMarks;
     this.scienceMarks = scienceMarks;
     this.englishMarks = englishMarks;
 }

 int totalMarks() {
     return mathMarks + scienceMarks + englishMarks;
 }

 double percentage() {
     return totalMarks() / 3.0;
 }
}

//Main class
public class Standard {
 Student[] students = new Student[3];

 // Method to take input from user
 public void inputStudents() {
     Scanner sc = new Scanner(System.in);
     for (int i = 0; i < students.length; i++) {
         System.out.println("Enter details for Student " + (i + 1) + ":");

         System.out.print("Roll No: ");
         int rollNo = sc.nextInt();
         sc.nextLine(); // Consume newline

         System.out.print("Name: ");
         String name = sc.nextLine();

         System.out.print("Math Marks: ");
         int math = sc.nextInt();

         System.out.print("Science Marks: ");
         int science = sc.nextInt();

         System.out.print("English Marks: ");
         int english = sc.nextInt();

         students[i] = new Student(rollNo, name, math, science, english);
         System.out.println();
     }
 }


 public void displayByRollNo() {
     Arrays.sort(students, new Comparator<Student>() {
         public int compare(Student s1, Student s2) {
             return Integer.compare(s1.rollNo, s2.rollNo);
         }
     });

     System.out.println("\nStudents in Ascending Order of Roll No:");
     for (Student s : students) {
         System.out.println("Roll No: " + s.rollNo + ", Name: " + s.name);
     }
 }

 public void displayHighestPercentage() {
     Student topStudent = students[0];
     for (Student s : students) {
         if (s.percentage() > topStudent.percentage()) {
             topStudent = s;
         }
     }
     System.out.println("\nTopper Based on Percentage:");
     System.out.println("Roll No: " + topStudent.rollNo + ", Name: " + topStudent.name);
 }

 public void displayHighestMathMarks() {
     Student topMath = students[0];
     for (Student s : students) {
         if (s.mathMarks > topMath.mathMarks) {
             topMath = s;
         }
     }
     System.out.println("\nTopper in Mathematics:");
     System.out.println("Roll No: " + topMath.rollNo + ", Name: " + topMath.name);
 }


 public void displayByMathScienceTotal() {
     Arrays.sort(students, new Comparator<Student>() {
         public int compare(Student s1, Student s2) {
             int total1 = s1.mathMarks + s1.scienceMarks;
             int total2 = s2.mathMarks + s2.scienceMarks;
             return Integer.compare(total1, total2);
         }
     });

     System.out.println("\nStudents in Ascending Order of Math + Science Marks:");
     for (Student s : students) {
         int total = s.mathMarks + s.scienceMarks;
         System.out.println("Roll No: " + s.rollNo + ", Name: " + s.name + ", Math+Science: " + total);
     }
 }

 
 public void displayRankList() {
     Arrays.sort(students, new Comparator<Student>() {
         public int compare(Student s1, Student s2) {
             return Integer.compare(s2.totalMarks(), s1.totalMarks());
         }
     });

     System.out.println("\nRank List:");
     int rank = 1;
     for (Student s : students) {
         System.out.printf("Rank %d: Roll No: %d, Name: %s, Total: %d, Percentage: %.2f%%\n",
                 rank++, s.rollNo, s.name, s.totalMarks(), s.percentage());
     }
 }

 public static void main(String[] args) {
     Standard std = new Standard();
     std.inputStudents();               

     std.displayByRollNo();             
     std.displayHighestPercentage();    
     std.displayHighestMathMarks();     
     std.displayByMathScienceTotal();   
     std.displayRankList();             
 }
}
