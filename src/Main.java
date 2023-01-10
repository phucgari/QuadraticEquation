import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a");
        double a=Double.parseDouble(s.nextLine());
        System.out.println("enter b");
        double b=Double.parseDouble(s.nextLine());
        System.out.println("enter c");
        double c=Double.parseDouble(s.nextLine());
        QuadraticEquation formula=new QuadraticEquation(a,b,c);
        if(formula.getDiscriminant()<0){
            System.out.println("this equation have no roots");
        } else if (formula.getDiscriminant()==0) {
            System.out.println(formula.getRoot1());
        }else{
            System.out.println(formula.getRoot1());
            System.out.println(formula.getRoot2());
        }
    }
}