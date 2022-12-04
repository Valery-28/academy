package homework1;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите тип данных: ");
        String type = sc.next();       //тип данных
        System.out.println("Веедите значение переменной");
        String str = sc.next();       //значение переменной
        switch (type) {
            case "int":
                int in = Integer.parseInt(str);
                in = in % 2;
                System.out.println(in);
                break;
            case "double":
                double dabl =Double.parseDouble(str);
                dabl=(dabl/100)*70;
                System.out.println(dabl);
                break;
            case "string":
                System.out.println("Hello world " +str);
                break;
            case "float":
                float fl=Float.parseFloat(str);
                fl=fl*fl;
                System.out.println(fl);
                break;
            case "char":
                char ch = str.charAt(0);
                System.out.println(ch);
                break;
            default:
                System.out.println("Unsupported type");break;
        }
        sc.close();
    }
}

