
import java.io.IOException;
public class Tester {

    public static void main(String[] args) throws IOException {


            int kilkist;//quantity of grades
            int[] mark;//array of grades

        System.out.print("Enter integer: ");
        kilkist = DataInput.getInt("Enter quantity");
        mark = new int[kilkist];//set size of array
        System.out.println("Enter grade ");
        for (int i = 0; i < kilkist; i++){//cycle get grades and writes to the array

            int ozin = DataInput.getInt("Get value");
            if (ozin>=0 && ozin<=100) {
                mark[i] = ozin;
            }
            else{//if grade isn`t from 0 to 100
                i--;
                System.out.println("�������  ���� ����� ������ ������");
            }
        }

        StudentsGrades sg = new StudentsGrades(mark);//creates the object with array
         System.out.println("������ �����: " + sg);//void toString, shows all entered marks
        System.out.println("����������� ������: " + sg.maxGrade());//shows maximal grade
        System.out.println("̳������� ������: " + sg.minGrade());//shows minimal grade
        System.out.println("������� ������: " + sg.seredniyBall());//shows average grade
        System.out.println("ʳ������ ������ ������ �� �������: " + sg.biggerBall());//show quantity of grades which bigger than average
        System.out.println("ʳ������ ������ ������ �� �������: " + sg.lessBall());//show quantity of grades which less than average
        System.out.println("ʳ������ ��������, �� ����� ������ \"³�����\": " + sg.kVidmin());//quantity of students with grade bigger than 90
        System.out.println("ʳ������ ��������, �� ����� ������ \"�����\": " + sg.kDobre());//students with grades 71-90
        System.out.println("ʳ������ ��������, �� ����� ������ \"���������\": " + sg.kZadvilno());//students with grades 60-70
        
        
        int n = 4;

        sg.setGrade(n, 92);//setter of grade
        System.out.println("������ ������ �"+ n + ": " +sg);
        int[] grades2 = sg.getGrades();//getter
        sg.addGrades(grades2);//adder of array of grades
        System.out.println("������ �����: " + sg);
        sg.addGrade(66);//adder of grades
        System.out.println("������ �����: " + sg);
        int[] nGrades = {87, 55, 23, 89};
        sg.setGrades(nGrades);
        System.out.println(sg);

        sg.sortToBig();
        System.out.println(sg);
        sg.sortToLess();
        System.out.println(sg);
        }
        
}

