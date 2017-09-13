import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Date e = new Date();
		
		Student[] stu = new Student[n];
		StudentGroup sg = new StudentGroup(n);
		for(int i=0;i<n;i++){
	 	  int id = sc.nextInt();
		  String Fullname = sc.next();
		  Double avgmark = sc.nextDouble();
		   stu[i] = new Student(id,Fullname,e,avgmark);
		  sg.addFirst(stu[i]);
		  stu[i].getFullName();
		  System.out.println(id+"\n"+Fullname);
		}
		
	}

}
