package homework1;

public class Application {
        public static void main (String[] args){
            Cat cat=new Cat();
            Cat cat1 =new Cat("Цири");
            cat1.eat();
            cat1.sleep();
            cat1.walk();
            

            cat.grow(); cat.grow(); cat.grow();
            cat.setMoney(12);
            System.out.println(cat.getMoney());
        }
    }

