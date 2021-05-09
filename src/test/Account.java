package test;
import java.util.Comparator;
import java.util.Random;

public class Account {
    private int money;
    private int number;

    public Account(int money){
        Random r = new Random();
        this.money = money;
        this.number = r.nextInt(100000);
    }
    public Account(int money, int number){
        this.money = money;
        this.number = number;
    }
    public Account(){
        Random r = new Random();
        this.money=0;
        this.number = r.nextInt(100000);
    }
    public void setMoney(int money){
        this.money = money;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getMoney(){
        return this.money;
    }
    public int getNumber(){
        return this.number;
    }

    public boolean equals(Account acc) {
        return this.number==acc.getNumber();
    }
    @Override
    public int hashCode(){
        return this.number;
    }
    public void addValue (int value) throws Exception{
            if (value<0) throw new Exception("Данная сумма денег отрицательна!");
            this.money += value;
    }
    public void takeValue(int value) throws  Exception{
        if (value>this.money) throw new Exception("Слишком большая сумма для снятия");
        this.money-=value;
    }
    public int Putin(){
        int buf=this.money;
        this.money=0;
        return buf;
    }
    public void information(){
        System.out.println("Номер счета - " + this.number);
        System.out.println("Количество дене на счету - " + this.money + " руб.");
    }
    @Override
    public String toString(){
        System.out.print("Баланс:" + this.money + "руб, номер счёта :");
        return String.valueOf(this.number);
    }
}
class Comparator_money implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2){
        return Integer.compare(o1.getMoney(),o2.getMoney());
    }
}









