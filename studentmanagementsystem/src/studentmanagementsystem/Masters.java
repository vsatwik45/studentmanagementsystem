package studentmanagementsystem;

public class Masters extends Student {

	int studentNum, semester;

	Masters(String name, int age, String address, int studentNum, int semester) {
		super(name, age, address); // calls parent class’s constructor
		this.studentNum = studentNum;
		this.semester = semester;

	}

	public String getName() // name
	{
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() // age
	{
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() // address
	{
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getStudentNum() // studentNumber
	{
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public int getSemester() // semester
	{
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}
}
