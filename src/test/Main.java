package test;

import java.util.*;

public class Main {

    public static void main(String[] args) {
     try{
         HashSet<Account> accounts = new HashSet<>();
       Account acc1 = new Account();
       accounts.add(acc1);
       Account acc2 = new Account(10000);
       accounts.add(acc2);
       Account acc3 = new Account(35000,77777);
       accounts.add(acc3);
       System.out.println("Данные аккаунтов до операций:");
       accounts.forEach(System.out::println);
       acc1.addValue(20000);
       acc2.takeValue(9000);
       System.out.println("Денег на счету до обнуления - "+ Collections.min(accounts, new Comparator_money()).Putin());
       System.out.println("\nДанные аккаунтов после операций:");
       accounts.forEach(System.out::println);
       System.out.println("Commit");

     }
     catch (Exception e){
         System.out.println(e.getMessage());
     }

    }
}

