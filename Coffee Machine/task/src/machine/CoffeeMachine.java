package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
       CoffeeMachine coffeeMachine = new CoffeeMachine();
       coffeeMachine.machineOption();
    }

    Scanner sc = new Scanner(System.in);

    // variables declaration
    String selectOption;
    String coffeeOptions;
    int amountWater = 400;
    int amountMilk = 540;
    int amountCoffee = 120;
    int amountCups = 9;
    int amountMoney = 550;



    public void initialValues() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(amountWater+" of water");
        System.out.println(amountMilk+" of milk");
        System.out.println(amountCoffee+" of coffee beans");
        System.out.println(amountCups+" of disposable cups");
        System.out.println(amountMoney +" of money");
        System.out.println();
    }

    public void machineOption() {
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            selectOption = sc.next();
            switch (selectOption) {
                case "buy":
                    buyCoffee();
                    break;
                case "fill":
                    fillMachine();
                    break;
                case "take":
                    takeMoney();
                    break;
                case "remaining":
                    initialValues();
                    break;
                case "exit":
                    break;
            }
        } while (!selectOption.equals("exit"));
    }

    public void buyCoffee() {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

        coffeeOptions = sc.next();
        switch (coffeeOptions) {
            case "1":
                buyEspresso();
                break;
            case "2":
                buyLatte() ;
                break;
            case "3":
                buyCappuccino();
                break;
            case "back":
                break;
            default:
                throw new IllegalStateException("Out of our options: " + coffeeOptions);
        }
    }

    public void buyEspresso() {
        if (amountWater < 250) {
            waterAvailable();
        } else if (amountCoffee < 16 ) {
            coffeeAvailable();
        } else if (amountCups < 1) {
            cupsAvailable();
        } else {
            productsAvailable();
            getEspresso();
            System.out.println();
        }
    }

    public void getEspresso() {
        amountWater -= 250;
        amountCoffee -= 16;
        amountCups -= 1;
        amountMoney +=4;
    }

    public void buyLatte() {
        if (amountWater < 350) {
            waterAvailable();
        } else if (amountMilk < 75 ) {
            milkAvailable();
        } else if (amountCoffee < 16 ) {
            coffeeAvailable();
        } else if (amountCups < 1) {
            cupsAvailable();
        } else {
            productsAvailable();
            getLatte();
            System.out.println();
        }
    }

    public void getLatte() {
        amountWater -= 350;
        amountMilk -= 75;
        amountCoffee -= 20;
        amountCups -= 1;
        amountMoney += 7;
    }

    public void buyCappuccino() {
        if (amountWater < 200) {
            waterAvailable();
        } else if (amountCoffee < 12 ) {
            coffeeAvailable();
        } else if (amountCups < 1) {
            cupsAvailable();
        } else {
            productsAvailable();
            getCappuccino();
            System.out.println();
        }
    }

    public void getCappuccino(){
        amountWater -= 200;
        amountCoffee -= 12;
        amountMilk-= 100;
        amountCups -= 1;
        amountMoney += 6;
    }

    public void fillMachine() {
        System.out.println();
        System.out.println("Write how many ml of water do you want to add:");
        int waterAdd = sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int milkAdd = sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int coffeeAdd = sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cupsAdd = sc.nextInt();

        amountWater += waterAdd;
        amountMilk += milkAdd;
        amountCoffee += coffeeAdd;
        amountCups += cupsAdd;
        System.out.println();
    }

    public void takeMoney() {
        System.out.println("I gave you $"+amountMoney);
        amountMoney -= amountMoney;
        System.out.println();
    }

    public void productsAvailable() {
        System.out.println("I have enough resources, making you a coffee!");
    }

    public void coffeeAvailable() {
        System.out.println("Sorry, not enough coffee beans!");
        System.out.println();
    }

    public void waterAvailable() {
        System.out.println("Sorry, not enough water!");
    }

    public void milkAvailable() {
        System.out.println("I have enough resources, making you a coffee!");
        System.out.println();
    }

    public void cupsAvailable() {
        System.out.println("Sorry, not enough cups of coffee !");
        System.out.println();
    }
}


