import java.util.Scanner;

class ResultDeclaration{

    public static String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {
        String results = null;
        if((subject1Marks>60) && (subject2Marks>60) && (subject3Marks>60)){
            results = ("passed");
        }
        else if(subject1Marks > 60 && subject2Marks >60 || subject2Marks > 60 && subject3Marks > 60 || subject1Marks > 60 && subject3Marks >60) {
            results=("passed\n"+"promoted");
        }
        else if(subject1Marks<60 || subject2Marks<60 || subject3Marks<60){
            results= ("failed");
        }
        return results;
    }

}
public class Assignment1Q4 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter Subject1 marks");
			double subject1marks = sc.nextDouble();
			System.out.println("Please enter Subject2 marks");
			double subject2marks = sc.nextDouble();
			System.out.println("Please enter Subject3 marks");
			double subject3marks = sc.nextDouble();
			System.out.print(ResultDeclaration.declareResults(subject1marks,subject2marks,subject3marks));
		}
    }

	}


