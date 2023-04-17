package tms.karpovich.lesson8;

public class EighthHomework {
    public static void main(String[] args) {
        phone();
        clinic();

    }

    private static void clinic() {
        Patient patient = new Patient();
        patient.setDoctor();
    }

    private static void phone() {
        Phone firstPhone = new Phone("+375332458624", "Samsung", 300);
        Phone secondPhone = new Phone("+375332458624", "Xiaomi", 200);
        Phone thirdPhone = new Phone("+375332458624", "Iphone", 100);
        firstPhone.showParameters();
        secondPhone.showParameters();
        thirdPhone.showParameters();
        firstPhone.receiveCall("John ");
        System.out.println(firstPhone.getNumber());
        secondPhone.receiveCall("Andrew ");
        System.out.println(secondPhone.getNumber());
        thirdPhone.receiveCall("Peter ");
        System.out.println(thirdPhone.getNumber());
    }
}
