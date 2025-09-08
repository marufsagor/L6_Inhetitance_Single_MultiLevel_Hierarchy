package ClassSix_Inhetitance_Single_MultiLvel_Hierarchy;

public class SingleInheritance  {
    public static void main(String[] args) {

        Student Tanmoy= new Student();
        Tanmoy.name="Tanmoy Sarkar";
        Tanmoy.rollNo=01;
        Tanmoy.sayHellow();
        Tanmoy.DisplayStudentInfo();

        System.out.println("-----------------------------");

        GraduateStudent Dr = new GraduateStudent();
        Dr.name="Dr Khan";
        Dr.ResarchTopics="Orthopadics";
        Dr.rollNo=02;
        Dr.sayHellow();
        Dr.DisplayRearchInfo();
        Dr.DisplayStudentInfo();

    }




}
