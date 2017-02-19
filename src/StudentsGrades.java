
public class StudentsGrades {

    private int[] grades;//array which will get grades

    StudentsGrades(){
        grades = new int[10];
    }



    StudentsGrades(int[] list){//constructor which use array
        grades = new int[list.length];
      for (int i=0; i<list.length;i++)
          grades[i]=list[i];
    }

    StudentsGrades(StudentsGrades sg){
        int l = grades.length;
        sg.grades = new int[l];
        for (int i =0; i < l; i++){
            grades[i] = sg.grades[i];
        }
    }

    public int[] getGrades(){//getter
        int l = grades.length;//take size of array "grades"

        int[] gradesCopy = new int[l];

        for (int i = 0; i < l; i++)//copy grades to the gradesCopy
            gradesCopy[i] = grades[i];
        return gradesCopy;//return other array

    }

    public void setGrades(int[] input){//set array of marks
        int arLength = input.length;
        grades = new int[arLength];
        for (int i=0;i<arLength;i++)grades[i]=input[i];

    }


    public String toString(){//return all grades
        String s = "";
        s += grades[0];
        for (int i = 1; i< grades.length; i++){//adds grades to the string
            s+=", " + grades[i];
        }
        return  s;
    }
    public void setGrade(int pos, int mark){//set one grade in position
        if (pos<0)pos=0;//if position<0 setted grade will be first
        if(pos>=grades.length)pos=grades.length-1;//if position>array.length grade will be the last
        if (pos < grades.length && pos>=0) grades[pos] = mark;//filter of the mark
        else if(mark>100) grades[pos] = 100;
        else grades[pos] = 0;

    }

    public void addGrade(int last){//adds one grade in the end
        int[] nMass = new int[grades.length+1];//creates new array
        int l = grades.length;

        for (int i = 0; i < l; i++)//copy grade to nMass
            nMass[i] = grades[i];
        nMass[l]=last;//adds new grade
        grades = new int[l+1];
        setGrades(nMass);

    }

    public void addGrades(int[] last){//adds array of grades
        int[] nMass = new int[grades.length+last.length];//creates new array
        int l = grades.length;

        for (int i = 0; i < l; i++)//adds grades which we have
            nMass[i] = grades[i];
        for (int i=l, j=0; i<nMass.length; i++, j++) nMass[i]=last[j];//adds input grades

        setGrades(nMass);


    }

    public int maxGrade(){//finding max grade
        int m = grades[0];
        for (int i = 1; i < grades.length; i++){
            if(grades[i] > m)  m= grades[i];
        }
        return m;
    }

    public int minGrade(){//finding min grade
        int m = grades[0];
        for (int i = 1; i < grades.length; i++){
            if(grades[i] < m)  m= grades[i];
        }
        return m;
    }

    public int seredniyBall(){//average grade of all students
        int ball = 0;
        for (int i = 0; i < grades.length; i++){
            ball+= grades[i];
        }
       return ball = ball/ grades.length;
    }


    public int biggerBall() {//quantity students whos grade higher than average
        int k =0;
        for (int i = 0; i< grades.length; i++){
            if (grades[i]>=seredniyBall()) k++;
        }
        return k;
    }

    public int lessBall() {//quantity students whos grade less than average
        int k =0;
        for (int i = 0; i< grades.length; i++){
            if (grades[i]<seredniyBall()) k++;
        }
        return k;
    }

    public int kVidmin() {//quantity of students with grade 91-100
        int k =0;
        for (int i = 0; i< grades.length; i++){
            if (grades[i]>90 && grades[i]<=100) k++;
        }
        return k;
    }

    public int kDobre() {//quantity of students with grade 71-90
        int k =0;
        for (int i = 0; i< grades.length; i++){
            if (grades[i]>70 && grades[i]<=90) k++;
        }
        return k;
    }

    public int kZadvilno() {//quantity of students with grade 60-70
        int k =0;
        for (int i = 0; i< grades.length; i++){
            if (grades[i]>59 && grades[i]<=70) k++;
        }
        return k;
    }
    public void sortToBig() {//sorting by growing
        int i = 1;
        while(i < grades.length) {
            if(i==0 || grades[i - 1] <= grades[i])
                i++;
            else {
                int temp = grades[i];
                grades[i] = grades[i - 1];
                grades[i - 1] = temp;
                i--;
            }
        }
    }

    public void sortToLess() {//sorting to the less
        int i = 1;
        while(i < grades.length) {
            if(i==0 || grades[i - 1] >= grades[i])
                i++;
            else {
                int temp = grades[i];
                grades[i] = grades[i - 1];
                grades[i - 1] = temp;
                i--;
            }
        }
        }

}