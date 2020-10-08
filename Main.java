package sk.kosickaakademia.stanovska.projectmath.cyklus;

import java.util.Scanner;
//Veronika

public class Main {
    public static void main(String[] args) {
        System.out.println("Sem zadaj číslo: ");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int x2=x;
        int reversed= 0;
        while (x2>0){
            reversed= reversed + (x2%10);
            reversed = reversed * 10;
            x2= x2/10;
        }
        reversed= reversed/10;
        if (reversed==x)
            System.out.println("čislo je palindróm");
        else
            System.out.println("čislo nie je palindróm");




    }
}









