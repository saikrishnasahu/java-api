package string;

public class StringExample {
    public static void main(String[] args) {
//        both are same
        char[] ch = {'j', 'a', 'v', 'a'};
        String s = new String(ch);

        s = "java";

        String s1 = "welcome";
        String s2 = "Welcome";//It doesn't create a new instance

        String s3 = new String("Welcome");//creates two objects and one reference variable

        s = "Sachin";
        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects

        s = "Sachin";
        s = s.concat(" Tendulkar");
        System.out.println(s);

        s1 = "Sachin";
        s2 = "Sachin";
        s3 = new String("Sachin");
        String s4 = "Saurav";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

        s1 = "Sachin";
        s2 = "SACHIN";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

        s1 = "Sachin";
        s2 = "Sachin";
        s3 = new String("Sachin");
        System.out.println(s1 == s2);//true (because both refer to same instance)
        System.out.println(s1 == s3);//false(because s3 refers to instance created in nonpool)

        s1 = "Sachin";
        s2 = "Sachin";
        s3 = "Ratan";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//1(because s1>s3)
        System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )

        s = "Sachin" + " Tendulkar";
//         The Java compiler transforms above code to this:
//String s=(new StringBuilder()).append("Sachin").append(" Tendulkar).toString();
        System.out.println(s);//Sachin Tendulkar

        s = 50 + 30 + "Sachin" + 40 + 40;
        System.out.println(s);//80Sachin4040

        s1 = "Sachin ";
        s2 = "Tendulkar";
        s3 = s1.concat(s2);
        System.out.println(s3);//Sachin Tendulkar

        s = "SachinTendulkar";
        System.out.println(s.substring(6));//Tendulkar
        System.out.println(s.substring(0, 6));//Sachin
    }
}
