package tms.karpovich.lesson7;


public class SeventhHomework {
    public static void main(String[] args) {
        sumOfPerimeters();
        employeePosition();
    }

    private static void employeePosition() {
        Director dir = new Director();
        dir.showPosition();
        Worker worker = new Worker();
        worker.showPosition();
    }

    private static void sumOfPerimeters() {
        int sum = 0;
        Figure[] array = new Figure[5];
        array[0] = new Circle(3);
        array[1] = new Rectangle(3, 5, 3,5);
        array[2] = new Triangle(3, 5, 4);
        array[3] = new Circle(4);
        array[4] = new Rectangle(4, 6, 4, 6);
        for (Figure figure : array){
            sum += figure.perimeter();
        }
        System.out.println(sum);
    }
}
