public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Student student = new Student();
        //setting field values
        student.setName("John Hamill");
        student.setStudentId(007);
        student.setNumberOfCredits(1);
        student.setGpa(4.0);

        //Get 'em
        String name = student.getName();
        int studentId = student.getStudentId();
        int credits = student.getNumberOfCredits();
        double gpa = student.getGpa();

        //Print 'em
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("No. Credits: " + credits);
        System.out.println("GPA: " + gpa);

    }
}
