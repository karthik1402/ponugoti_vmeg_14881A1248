import java.util.*;


/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup extends Exception implements StudentArrayOperation {

	private Student[] students;
	
	
	
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}
    
	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		
		int length = students.length;
		if(students == null)
				throw new IllegalArgumentException();
		   
		this.students = students;
	}
	@Override
	public Student getStudent(int index) {
		/* Add your implementation here*/
		  ArrayList<Student> arr = new ArrayList<Student>(Arrays.asList(students));
		 int len = arr.size();
		 Student val;
		 
			 if(index<0 || index>=len)
				 throw new IllegalArgumentException();
			 else{
				   val = arr.get(index);
			 }
		return val;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		 ArrayList<Student> arr = new ArrayList<Student>(Arrays.asList(students));
		 Student val;
		if(index<0 || index>=arr.size() || student == null)
			throw new IllegalArgumentException();
		else{
			 val = arr.set(index,student);
		}
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		 ArrayList<Student> arr = new ArrayList<Student>(Arrays.asList(students));
 		
			if(student == null)
				throw  new IllegalArgumentException();
			else{
				arr.add(0,student);
			}
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		 ArrayList<Student> arr = new ArrayList<Student>(Arrays.asList(students)); 
	
			if(student == null)
				throw new IllegalArgumentException();
			else{
				arr.add(student);
			}
		
	}

	@Override
	public void add(Student student, int index) {
		 //Add your implementation here
		  ArrayList<Student> arr = new ArrayList<Student>(Arrays.asList(students));
		int len = arr.size();
	
			if(index<0 || index>=len || student == null)
				throw new IllegalArgumentException();
		    else{
				arr.add(index,student);
			}
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		 ArrayList<Student> arr = new ArrayList<Student>(Arrays.asList(students));
		 Student val;
		if(index<0 || index>=(arr.size()))
				throw new IllegalArgumentException();
		else{
			val = arr.remove(index);
			arr.remove(val);
		}
		Student[] stu = new Student[arr.size()];
		stu = arr.toArray(stu);
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		 ArrayList<Student> arr = new ArrayList<Student>(Arrays.asList(students));
		 Student val;int i;
		 if((arr.contains(student)) == false || student == null)
				throw new IllegalArgumentException();
		 else{
			  for(i=0;i<students.length;i++){
				   if(students[i] == student)
					   break;
			  }
			  val = arr.get(i);
			  arr.remove(val);
	    }
		Student[] stu = new Student[arr.size()];
		stu = arr.toArray(stu);
	}

	@Override
	public void removeFromIndex(int index) {
		//Add your implementation here
		 ArrayList<Student> arr = new ArrayList<Student>(Arrays.asList(students));
		 Student val;
			if(index<0 || index>(arr.size()))
				throw new IllegalArgumentException();
		    else{
				for(int i=index+1;i<arr.size();i++){
					val = arr.get(i);
					arr.remove(val);
				}
		    }
			Student[] stu = new Student[arr.size()];
		stu = arr.toArray(stu);
		}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		 ArrayList<Student> arr = new ArrayList<Student>(Arrays.asList(students));
		 Student val;int i;
			if(student == null)
				throw new IllegalArgumentException();
		    else{
				for(i=0;i<students.length;i++){
				   if(students[i] == student)
					   break;
			   }
				for(int k = 0;k<i;k++){
					val = arr.get(k);
					arr.remove(val);
				}
			}
			Student[] stu = new Student[arr.size()];
		stu = arr.toArray(stu);
		
    }

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		 ArrayList<Student> arr = new ArrayList<Student>(Arrays.asList(students));
		Student val;
			if(index<0 || index>(arr.size()))
				throw new IllegalArgumentException();
		    else{
				for(int i=0;i<index;i++){
					val = arr.get(i);
					arr.remove(val);
				}
		}
		Student[] stu = new Student[arr.size()];
		stu = arr.toArray(stu);
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		 ArrayList<Student> arr = new ArrayList<Student>(Arrays.asList(students));
		 Student val;int i;
			if(student == null)
				throw new IllegalArgumentException();
		   else{
			   
			   for(i=0;i<students.length;i++){
				   if(students[i] == student)
					   break;
			   }
				for(int k = 0;k<i;k++){
					val = arr.get(k);
					arr.remove(val);
				}
		   }
		   Student[] stu = new Student[arr.size()];
		stu = arr.toArray(stu);
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		
			if(date == null)
				throw new IllegalArgumentException();
		
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		
			if(firstDate == null || lastDate == null)
				throw new IllegalArgumentException();
		
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		
			if(date == null)
				throw new IllegalArgumentException();
		
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		
			if(indexOfStudent == 0)
				throw new IllegalArgumentException();
		
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double max = 0;int i;
		for(i=0;i<students.length;i++){
			if(max<students[i].getAvgMark())
				max = students[i].getAvgMark();
		}
		LinkedList<Student> ll = new LinkedList<Student>();
		for(i=0;i<students.length;i++){
			if(max == students[i].getAvgMark()){
				ll.add(students[i]);
			}
		}
		Student[] stu = new Student[ll.size()];
		stu = ll.toArray(stu);
		return stu;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		
			if(student == null)
				throw new IllegalArgumentException();
		
		return null;
	}
}
