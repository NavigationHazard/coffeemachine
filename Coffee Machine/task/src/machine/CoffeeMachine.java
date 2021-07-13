package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // init maschine from maschine class
        Maschine maschine = new Maschine();
        System.out.println();
        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");

            String action = in.next();
            // switch cases

            switch (action) {
                case "exit":
                    exit = true;
                    break;
                case "remaining":
                    maschine.showLevels();
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String purchase = in.next();

                    switch (purchase) {
                        case "1":
                            maschine.makeEspresso();
                            break;
                        case "2":
                            maschine.makeLatte();
                            break;
                        case "3":
                            maschine.makeCappuccino();
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int water = in.nextInt();
                    maschine.addWater(water);
                    System.out.println("Write how many ml of milk you want to add:");
                    int milk = in.nextInt();
                    maschine.addMilk(milk);
                    System.out.println("Write how many grams of beans you want to add:");
                    int beans = in.nextInt();
                    maschine.addBeans(beans);
                    System.out.println("Write how many disposable cups of coffee you want to add:");
                    int cups = in.nextInt();
                    maschine.addCups(cups);
                    break;

                case "take":
                    System.out.printf("I gave you $%d", maschine.cashOut());
                    break;
            }
        }

    }

    // buy  nested which coffee 1 2 3

    // fill nested fill which ingredient and how much

    // take money all it earned
}


class Maschine {

    private int water;
    private int milk;
    private int beans;
    private int money;
    private int cups;

    private boolean waterB;
    private boolean milkB;
    private boolean beansB;
    private boolean cupsB;


    // Current ingredients inside the machine
    public Maschine() {
        this.water = 400;
        this.milk = 540;
        this.beans = 120;
        this.money = 550;
        this.cups = 9;

        this.milkB = false;
        this.waterB = false;
        this.beansB = false;
        this.cupsB = false;

    }


    // output current ingredients

    public void showLevels() {
        System.out.printf("The coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money", getWater(), getMilk(), getBeans(), getCups(), getMoney());

    }

    public void addWater(int amount) {
        water += amount;
    }

    public void addMilk(int amount) {
        milk += amount;
    }

    public void addBeans(int amount) {
        beans += amount;
    }

    public void addCups(int amount) {
        cups += amount;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getCups() {
        return cups;
    }

    public int getMoney() {
        return money;
    }

    public int cashOut() {
        int temp = getMoney();
        money = 0;
        return temp;
    }

    public void makeEspresso() {
        if (this.water < 250) {
            waterB = false;
            System.out.println("Sorry, not enough water!");
        } else waterB = true;
        if (this.beans < 16) {
            beansB = false;
            System.out.println("Sorry, not enough beans!");
        } else beansB = true;
        if (this.cups < 1) {
            cupsB = false;
            System.out.println("Sorry, not enough cups!");
        } else cupsB = true;
        if (beansB && waterB && cupsB) {
            System.out.println("I have enough resources, making you a coffee!");

            water -= 250;
            beans -= 16;
            cups--;
            money += 4;
        }
    }

    public void makeLatte() {
        if (this.water < 350) {
            waterB = false;
            System.out.println("Sorry, not enough water!");
        } else waterB = true;
        if (this.beans < 25) {
            beansB = false;
            System.out.println("Sorry, not enough beans!");
        } else beansB = true;
        if (this.milk < 75) {
            milkB = false;
            System.out.println("Sorry, not enough cups!");
        } else milkB = true;
        if (this.cups < 1) {
            cupsB = false;
            System.out.println("Sorry, not enough cups!");
        } else cupsB = true;
        if (beansB && waterB && cupsB) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            milk -= 75;
            beans -= 20;
            cups--;
            money += 7;
        }
    }

    public void makeCappuccino() {
        if (this.water < 200) {
            waterB = false;
            System.out.println("Sorry, not enough water!");
        } else waterB = true;
        if (this.beans < 12) {
            beansB = false;
            System.out.println("Sorry, not enough beans!");
        } else beansB = true;
        if (this.milk < 100) {
            milkB = false;
            System.out.println("Sorry, not enough cups!");
        } else milkB = true;
        if (this.cups < 1) {
            cupsB = false;
            System.out.println("Sorry, not enough cups!");
        } else cupsB = true;
        if (beansB && waterB && cupsB) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 200;
            milk -= 100;
            beans -= 12;
            cups--;
            money += 6;
        }
    }


}