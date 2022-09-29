import java.util.Scanner;;

public class metricConversion {
    

    public static float conversion(String sourceName, String targetMetric, float sourceNum) {
        float targetNum = 0;
        switch (sourceName) {
            case "km":
                switch (targetMetric) {
                    case "m":
                        targetNum = sourceNum * 1000;
                        break;
                    case "miles":
                        targetNum = sourceNum / (float) 1.6;
                        break;
                    case "cm":
                        targetNum = sourceNum * 100000;
                        break;
                    case "ft":
                        targetNum = sourceNum * 3280;
                        break;
                    case "mm":
                        targetNum = sourceNum * 1000000;
                        break;
                    default:
                        System.out.println("This conversion can not be handled, please try a different one");
                        return targetNum;

                }
        }
        System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceName, targetNum, targetMetric);
        return targetNum;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to metric conversions!");
        System.out.println("Enter exit to exit the program");
        String str;
        String[] strArray;
        float sourceNum;
        String sourceName;    
        String targetMetric;
        while (true) {
        
            System.out.println("Input your metric conversion below. Example: 1 km =  m");
            str = scanner.nextLine();
             
            if (str.equals("exit")) {
                System.out.println("Thank you! Goodbye, have a nice day!");
                scanner.close();
                break;
            }
            strArray = str.split(" ");
            if (strArray.length != 4) {
                System.out.println("Your input is invaild. Please try again or eneter ,exit, to leave.");
                continue;
            } else {
                sourceNum = Float.parseFloat(strArray[0]);
                sourceName = strArray[1];
                targetMetric = strArray[3];
                Float targetNum = conversion(sourceName, targetMetric, sourceNum);

                continue;

            }

        }
        scanner.close();
    }
}
