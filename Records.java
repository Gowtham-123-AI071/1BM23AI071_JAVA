import java.util.Scanner;
class Student {
    int marks;

}
public class Records{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        final int n=5;
        int sum=0;

        Student obj[] =new Student[n];
        for (int i=0;i<n;i++){
            obj[i]=new Student();

            System.out.println("enter student marks is  "+(i+1)+"=");
            obj[i].marks=sc.nextInt();
            System.out.println("student marks is="+obj[i].marks);
            sum +=obj[i].marks;

        }
        System.out.println("student marks is="+sum);

    }
}


//output
//enter student marks is  1=
//45
//student marks is=45
//enter student marks is  2=
//36
//student marks is=36
//enter student marks is  3=
//78
//student marks is=78
//enter student marks is  4=
//99
//student marks is=99
//enter student marks is  5=
//56
//student marks is=56
//student marks is=314