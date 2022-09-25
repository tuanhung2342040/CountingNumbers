import java.util.ArrayList;

public class Course {
   private ArrayList<Student> students; 
   
   public Course() {
      students = new ArrayList<>();  
   }
   public Student addStudent(String name, String familyName){
      Student newStudent = new Student(name, familyName);
      students.add(newStudent);
      return newStudent; 
   }
   public Student findStudent(long studentNumber){
      for(Student s : students){
         if(s.getStudentNumber() == studentNumber){
            return s;
         }
      }
      return null;
   }
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

}