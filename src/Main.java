import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter buying price per share: ");
        double buyingPrice;
        buyingPrice = scan.nextDouble();
        int day;
        day = 1;
        double closingPrice;

        while (true){
            System.out.println("Enter closing price day" + day + "(any negative value to leave the program)");
            closingPrice = scan.nextDouble();
            if(closingPrice < 0.0){
                System.out.println("Exiting the program");
                break;
            }
            double earnings = closingPrice - buyingPrice;
            if(earnings > 0.0){
                System.out.println("After day "+ day+ "you earned "+ earnings +" per share.");
            }
            else if(earnings < 0.0){
                System.out.println("After day "+ day +"you have lost "+ (-earnings)+ " per share.");
            }
            else{
                System.out.println("After day"+ day +",you have "+ "no earnings per share.");
            }
            day +=1;

        }
        scan.close();

    }
}