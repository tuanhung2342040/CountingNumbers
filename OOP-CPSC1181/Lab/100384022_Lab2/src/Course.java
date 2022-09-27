import java.util.ArrayList;

public class Course {
   private ArrayList<Student> students; 
   /**
    * This constructs a course with ArrayList of students
    */
   public Course() {
      students = new ArrayList<>();  
   }

   /**
    * This adds a new student to the Course
    * @param name the name of the new student
    * @param familyName the family name of the new student
    * @return reference of the new student
    */
   public Student addStudent(String name, String familyName){
      if(name == null || familyName == null){
         return null;
      }
      Student newStudent = new Student(name, familyName);
      students.add(newStudent);
      return newStudent; 
   }

   /**
    * This finds a student in the course with a given student number.
    * @param studentNumber the student number of the student
    * @return reference of the student
    */
   public Student findStudent(long studentNumber){
      if(students.isEmpty()){
         return null;
      }
      for(Student s : students){
         if(s.getStudentNumber() == studentNumber){
            return s;
         }
      }
      return null;
   }

   /**
    * This removes a student from the course with a given student number.
    * @param studentNumber the student number of the student
    * @return reference of the student 
    */
   public Student deleteStudent(long studentNumber){
      if(students.isEmpty()){
         return null;
      }
      for(Student s : students){
         if(s.getStudentNumber() == studentNumber){
            students.remove(s);
            return s;
         }
      }
      return null;
   }

   /**
    * This adds a quiz of the student 
    * @param studentNumber the student number of the student
    * @param maxGrade the maximum grade of the quiz
    * @param studentGrade the grade of the student
    * @return true if the given student number 
    matches with the student, otherwise return false
    */
   public boolean addQuiz(long studentNumber, double maxGrade, double studentGrade){
      if(maxGrade <= 0 || studentGrade < 0 || studentNumber < 10000001 || 
             maxGrade < studentGrade){
         return false;
      }
      for(Student s : students){
         if(s.getStudentNumber() == studentNumber){
            s.addQuiz(maxGrade, studentGrade);
            return true;
         }
      }
      return false;
   }

   /**
    * This returns the top student of the course
    * @return reference of the top student
    */
   public Student findTopStudent(){
      if(students.isEmpty()){
         return null;
      }
      Student topStudent = students.get(0);
      for(Student s : students){
         if(s.getQuizAverage() > topStudent.getQuizAverage()){
            topStudent = s;
         }
      }
      return topStudent;
   }

   /**
    * This return the average grade of all students of the class
    * @return average grade
    */
   public double getAverage(){
      int length = students.size();
      double sum = 0;
      for(Student s : students){
         sum += s.getQuizAverage();
      }
      return sum/length;
   }

   public void printStudentNumbers(){
      for(Student s : students){
         System.out.println(s.getStudentNumber());
      }
   }
   public String toString(){
      return students.toString() + "AverageGrade: " + getAverage();
   }

}