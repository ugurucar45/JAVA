package primitives;

public class ComparionPractice {
    public static void main(String[] args) {
        float fl = 4.4f;
        int i = 4;
        System.out.println(fl == i);//false
        boolean comp1 = (fl == i);
        System.out.println(comp1);//false

        System.out.println(18 == 18);//true

        System.out.println('a' == 'A');//false
        System.out.println("test" == "tesT");//false

        //!

        int num1 = 55;
        int num2 = 66;
        boolean comp2 = num1 != num2;
        System.out.println(comp2);//true

        System.out.println(18 != 18);//false

        // < less than
        System.out.println(num1<num2);//true
        System.out.println(55<num1);//false 55<55
        System.out.println(num2<num1);//false
        System.out.println('c'<'d');//true

        // > greater than
        System.out.println(num1>num2);//false
        System.out.println(num2>109);//false
        System.out.println(num2++>66);//false
        System.out.println(num2>66);//true


        // <= less than or equals
        num1=2;num2=3;
        System.out.println(num1<num2);//true
        System.out.println(num1<=num2);//true
        System.out.println(3<=num2);//true
        num1++;//num1=3
        System.out.println(num1<=num2);//true 3=3
        System.out.println(++num1<=++num2);//true

        //>= greater than or equals

        System.out.println(num2>=num1);//true
        System.out.println(num1); System.out.println(num2);//4 4
        System.out.println(7>=++num1+num2);//false 7>=5+4

                    char cj='P',cd=80;
                    System.out.println(cj==cd);



    }
}
