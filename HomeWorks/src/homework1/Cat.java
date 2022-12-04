package homework1;

public class Cat {
    int age;
    String nickname;
    double money=1;
    public Cat(){
        super();
    }
    public Cat(String nickname){
        this.nickname=nickname;
        System.out.print(nickname);
    }
    public void grow() {
        //for (age = 0; age < 3; ++age)
          age++;
          System.out.println(" Кошка растёт, Кошке : " + age);
    }
    public void eat() {
        System.out.print(" Кошка кушает ");
    }
    public void sleep() {
        System.out.print(" Кошка спит ");
    }
    public void walk() {
        System.out.println(" Кошка гуляет ");
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
        System.out.println(money);
    }
}

