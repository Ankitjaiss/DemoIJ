
// defining enum Grade
enum Grade{
    A,B,C,D,E;
}

class Student{
    private Integer studentId;
    private String name;
    private Integer totalMarks;
    private Grade grade;
    //Grade is the name of enum

    private float scholarshipAmount;
    public Integer getStudentId() {
        return studentId;
    }
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getTotalMarks() {
        return totalMarks;
    }
    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }
    public Grade getGrade() {
        return grade;
    }
    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    public float getScolarshipAmount() {
        return scholarshipAmount;
    }
    public void setScolarshipAmount(float scolarshipAmount) {
        this.scholarshipAmount = scolarshipAmount;
    }

    public void calculateGrade() {
	/*
	    write the logic to calculate the grade of the student
	*/
        if(getTotalMarks()>=250){
            setGrade(Grade.A);
        }
        else if(getTotalMarks()>=200 && getTotalMarks()<250){
            setGrade(Grade.B);
        }
        else if(getTotalMarks()>=175 && getTotalMarks()<200){
            setGrade(Grade.C);
        }
        else if(getTotalMarks()>=150 && getTotalMarks()<175){
            setGrade(Grade.D);
        }
        else{
            setGrade(Grade.D);
        }

    }

    public void calculateScolarshipAmount() {
	/*
	    write the logic to calculate scholarship amount based on grade 
	*/
       calculateGrade();
        if(getGrade()==Grade.A){
            setScolarshipAmount(5000);
        }
        else if(getGrade()==Grade.B){
            setScolarshipAmount(4000);
        }
        else if(getGrade()==Grade.C){
            setScolarshipAmount(3000);
        }
        else if(getGrade()==Grade.D){
            setScolarshipAmount(2000);
        }
        else {
            System.out.println("NOT APLLICABLE");
        }
    }
}

class Exercise1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(1000);
        student.setName("Alvin");
        student.setTotalMarks(280);
        student.calculateGrade();
        student.calculateScolarshipAmount();
        System.out.println("Student Details");
        System.out.println("***************");
        System.out.println("Student Id : "+student.getStudentId());
        System.out.println("Name : "+student.getName());
        System.out.println("Grade : "+student.getGrade());
        System.out.println("Scholarship Amount : "+student.getScolarshipAmount());

    }
}