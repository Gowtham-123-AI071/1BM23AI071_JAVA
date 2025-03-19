import java.util.Scanner;
public class buffer {
    public static void main(String[] args){
        StringBuffer sb1 =new StringBuffer();
        System.out.println("Capacity of StringBuffer objects sb1:" + sb1.capacity());

        StringBuffer sb2=new StringBuffer("Hello");
        System.out.println("Capacity of StringBuffer object sb2:"+ sb2.capacity());
        Scanner sc =new Scanner(System.in);

        System.out.println("enter the string=");
        String inputstring=sc.nextLine();

        StringBuffer reversedBuffer =new StringBuffer(inputstring);
        reversedBuffer.reverse();
        String reversedUpperCase=reversedBuffer.toString().toUpperCase();
        System.out.println("reversed string in uppercase="+ reversedUpperCase);

        System.out.println("Enter a string to append=");
        String appendString=sc.nextLine();
        reversedBuffer.append(appendString);
        System.out.println("String after appending="+reversedBuffer);





    }

}
//OUTPUT
//Capacity of StringBuffer objects sb1:16
//Capacity of StringBuffer object sb2:21
//enter the string=
//Karthik.K
//reversed string in uppercase=K.KIHTRAK
//Enter a string to append=
//,THE CODER
//String after appending=K.kihtraK,THE CODER