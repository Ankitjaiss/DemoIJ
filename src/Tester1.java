class Student1{
    private String studentId;
    private String name;
    private String examId;

    public Student1(String studentId,String name){
        this.studentId=studentId;
        this.name=name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String generateExamId() {
        int i = Integer.parseInt(this.getStudentId());
        String[] split =(this.getName().split(" "));
        String name="";
        StringBuilder st=new StringBuilder();
        for(int j=0;j<split.length;j++) {
             name = String.valueOf(split[j].substring(0, 3));
             st.append(name+"-");
        }
        String s2=st.substring(0,st.length()-1);
        String s=Integer.toString(i);
        String s1=s.substring(s.length()-1);
        int in= Integer.valueOf(s1);
        return s2+":"+i+"-"+(in*in);

    }

}

public class Tester1{
    public static void main(String[] args) {
        Student1 stud1 = new Student1("4596","John Wheedon");
        Student1 stud2 = new Student1("3412","Ross Stark");
        System.out.println(stud1.generateExamId());
        System.out.println(stud2.generateExamId());
    }
}
