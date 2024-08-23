import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

//        switch (fruit) {
//            case "apple":
//                System.out.println("King of fruit");
//                break;
//                case "orange":
//                    System.out.println("Small");
//                    break;
//                    case "banana":
//                        System.out.println("kela");
//                        break;
//                        case "grape":
//                            System.out.println("lily");
//                            break;
//                            default:
//                                System.out.println("unknown");

        switch (fruit) {
            case "apple" -> System.out.println("King of fruit");
            case "orange" -> System.out.println("Small");
            case "banana" -> System.out.println("kela");
            case "grape" -> System.out.println("lily");
            default -> System.out.println("unknown");
        }

        //nested switch case

    }
}
