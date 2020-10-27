package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean driver = true;


        int currentWater = 400;
        int currentMilk = 540;
        int currentBeans = 120;
        int currentMoney = 550;
        int disposableCups = 9;


        while(driver){


            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String selection = scan.nextLine();

            switch (selection) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    String cupChoice = scan.nextLine();



                    switch (cupChoice) {
                        case "1":
                            if (currentWater < 250) {
                                System.out.println("Sorry, not enough water!");
                            } else {
                                if (currentBeans < 16) {
                                    System.out.println("Sorry, not enough beans!");
                                } else {
                                    currentWater -= 250;
                                    currentBeans -= 16;
                                    currentMoney += 4;
                                    disposableCups -= 1;
                                    break;
                                }
                                break;
                            }
                            break;

                        case "2":
                            if (currentWater < 350) {
                                System.out.println("Sorry, not enough water!");
                            } else {
                                if (currentMilk < 75) {
                                    System.out.println("Sorry, not enough milk!");
                                } else {
                                    if (currentBeans < 20) {
                                        System.out.println("Sorry, not enough coffee beans!");
                                    } else {
                                        System.out.println("I have enough resources, making you a coffee!");
                                        currentWater -= 350;
                                        currentMilk -= 75;
                                        currentBeans -= 20;
                                        disposableCups -= 1;
                                        currentMoney += 7;
                                        break;
                                    }
                                }

                            }
                            break;

                        case "3":
                            if (currentWater < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else {
                                if (currentMilk < 100) {
                                    System.out.println("Sorry, not enough milk!");
                                    break;
                                } else {
                                    if(currentBeans < 12) {
                                        System.out.println("Sorry, not enough coffee beans!");
                                    } else {
                                        System.out.println("I have enough resources, making you a coffee!");
                                        currentWater -= 200;
                                        currentMilk -= 100;
                                        currentBeans -= 12;
                                        disposableCups -= 1;
                                        currentMoney += 6;
                                        break;
                                    }
                                }
                            }

                        case "back":
                            break;

                        default:
                            System.out.println("Not a valid selection.");
                            break;
                    }
                break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add: ");
                    int waterRefill = scan.nextInt();

                    System.out.println("Write how many ml of milk do you want to add: ");
                    int milkRefill = scan.nextInt();

                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    int beanRefill = scan.nextInt();

                    System.out.println("Write how man disposable cups of coffee do you want to add: ");
                    int cupRefill = scan.nextInt();

                    currentWater += waterRefill;
                    currentMilk += milkRefill;
                    currentBeans += beanRefill;
                    disposableCups += cupRefill;
                    break;

                case "take":
                    System.out.println("I give you " + currentMoney);
                    currentMoney = 0;
                    break;

                case "remaining":
                    System.out.println("The coffee machine has: \n" + currentWater + " of water \n" + currentMilk + " of milk\n" +
                            currentBeans + " of coffee beans\n" + disposableCups + " of disposable cups\n$"
                            + currentMoney + " of money");

                    break;

                case "exit":
                    driver = false;
                    break;
            }

        }

    }

}