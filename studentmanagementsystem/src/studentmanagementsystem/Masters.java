package studentmanagementsystem;




public class Masters extends Student {

	private int studentNum, semester;
	
	 public Masters()
     {
        
         setStudentNum(0);
         setSemester(0);
     }

	Masters(String name, int age, String address, int studentNum, int semester) {
	
		super(name, age, address); // calls parent class’s constructor
		this.setStudentNum(studentNum);
		this.setSemester(semester);

	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
}