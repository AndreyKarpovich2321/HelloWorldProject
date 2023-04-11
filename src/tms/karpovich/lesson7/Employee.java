package tms.karpovich.lesson7;

public interface Employee {
    default void showPosition(String position){
        System.out.println(this.getClass().getSimpleName());
        System.out.println(position);
    }
}
