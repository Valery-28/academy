package homework1;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите возраст покупателя: ");
        int age = sc.nextInt();
        System.out.print("Введите сумму потраченую клиентом: ");
        double pokupki=sc.nextDouble();
        double sum3;
        if(pokupki<100){
            double sum2=(pokupki/100)*5;
            sum3=pokupki-sum2;
            System.out.println("Ваша скидка состовляет: "+sum2);
            System.out.println("Сумма с учётом скидки: "+sum3);
        }
        if(100<=pokupki&pokupki<200){
            double sum2=(pokupki/100)*7;
            sum3=pokupki-sum2;
            System.out.println("Ваша скидка состовляет: "+sum2);
            System.out.println("Сумма с учётом скидки: "+sum3);
        }
        if(200<=pokupki&pokupki<300&&age>=18){
            double sum2=(pokupki/100)*(12+4);
            sum3=pokupki-sum2;
            System.out.println("Ваша скидка состовляет: "+sum2);
            System.out.println("Сумма с учётом скидки: "+sum3);
        }else if(200<=pokupki&pokupki<300){
            double sum2=(pokupki/100)*(12-3);
            sum3=pokupki-sum2;
            System.out.println("Ваша скидка состовляет: "+sum2);
            System.out.println("Сумма с учётом скидки: "+sum3);
        }
        if(300<=pokupki&pokupki<400){
            double sum2=(pokupki/100)*15;
            sum3=pokupki-sum2;
            System.out.println("Ваша скидка состовляет: "+sum2);
            System.out.println("Сумма с учётом скидки: "+sum3);
        }
        if(pokupki>400){
            double sum2=(pokupki/100)*20;
            sum3=pokupki-sum2;
            System.out.println("Ваша скидка состовляет: "+sum2);
            System.out.println("Сумма с учётом скидки: "+sum3);
        }
    sc.close();
    }
}
