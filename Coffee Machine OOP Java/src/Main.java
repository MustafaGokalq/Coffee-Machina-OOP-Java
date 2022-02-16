import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CoffeeMachine defaultCoffeeMachine = new CoffeeMachine(400,540,120,9,550);

        boolean exit = false;
        String inputValue = "";
        while (!exit){
            System.out.println("write the action in writing (buy, fill, take, remaining, exit)");
            inputValue = scanner.nextLine();

            if(inputValue.equals("buy")){
                CoffeeMachine.buy(defaultCoffeeMachine);

            }else if (inputValue.equals("fill")){
                CoffeeMachine.fill(defaultCoffeeMachine);
                System.out.println("the transaction took place");
            }else if (inputValue.equals("take")){
                System.out.println("the transaction took place");
                CoffeeMachine.take(defaultCoffeeMachine);
            }else if(inputValue.equals("remaining")){
                System.out.println("the transaction took place");
                CoffeeMachine.showSupply(defaultCoffeeMachine);
            }else if(inputValue.equals("exit")){
                System.out.println("logged out");
                exit = true;
            }
        }
    }
}
