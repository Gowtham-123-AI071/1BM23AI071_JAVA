public class concatenate {
    public static boolean compareStrings(String str1,String str2){
        return str1.equals(str2);
    }
    public static String copyString(String original){
        return new String(original);
    }
    public static String concatenateStrings(String str1,String str2){
        return str1+str2;

    }
    public static void main(String[] args){
        String str1="hello";
        String str2="hello";
        System.out.println("String comparision:");
        System.out.println("Are the strings equal="+ compareStrings(str1,str2));

        String original="Copy me!";
        String copied=copyString(original);

        System.out.println("String copy");
        System.out.println(("Original string:"+ original));
        System.out.println("Copied string;" + copied);

        String part1 ="Karthik.K,";
        String part2="The coder";
        String concatenated= concatenateStrings(part1,part2);
        System.out.println("string concatenated;");
        System.out.println("concatenated string=" + concatenated);



    }
}

//output
//String comparision:
//Are the strings equal=true
//String copy
//Original string:Copy me!
//Copied string;Copy me!
//string concatenated;
//concatenated string=Karthik.K,The Coder

