public class Typecasting {
    public static void main(String[] args) {

        int num = (int)(48.888f);
        System.out.println(num);

//       automatic type promotion in expression
//        int a = 258;
//        byte b = (byte)(a); //258 % 256 = 2
//        System.out.println(b);

        byte a = 50;
        byte b = 50;
        byte c = 100;
        int d = a*b/c;

        System.out.println(d);
    }
}
