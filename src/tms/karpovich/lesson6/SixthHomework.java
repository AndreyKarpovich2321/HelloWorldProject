package tms.karpovich.lesson6;

public class SixthHomework {
    public static void main(String[] args) {
        CreditCard firstCard = new CreditCard(100);
        CreditCard secondCard = new CreditCard(200);
        CreditCard thirdCard = new CreditCard(300);
        firstCard.topUp(50);
        secondCard.topUp(150);
        thirdCard.withdraw(100);
        System.out.println(firstCard.showInfo());
        System.out.println(secondCard.showInfo());
        System.out.println(thirdCard.showInfo());
        Computer firstComputer = new Computer(500, "ASUS", new RAM(), new HDD());
        Computer secondComputer = new Computer(1000, "HP",new RAM("Kingston", 16),new HDD("Samsung", 2048, "Internal"));
        System.out.println(firstComputer);
        System.out.println(secondComputer);

    }
}
