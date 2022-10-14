class CollegeTester{

public static void main(String args[]){

College college = new College();
college.name = "Basaveshwara Engineering College";
college.address = "Vidyagiri";
college.departments = 9;
college.students = 900;

System.out.println(college.name + " " + college.address + " " + college.departments + " " + college.students);

College college1 = new College();
college1.name = "BGMIT";
college1.address = "Mudhol";
college1.departments = 9;
college1.students = 900;

System.out.println(college1.name + " " + college1.address + " " + college1.departments + " " + college1.students);


}

}