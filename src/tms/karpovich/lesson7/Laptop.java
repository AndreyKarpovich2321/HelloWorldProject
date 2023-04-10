package tms.karpovich.lesson7;

public class Laptop extends Comp{
    private String tochpad;

    public Laptop(String hdd, String ram, String tochpad) {
        super(hdd, ram);
        this.tochpad = tochpad;
    }

    public String getTochpad() {
        return tochpad;
    }

    public void setTochpad(String tochpad) {
        this.tochpad = tochpad;
    }
}
