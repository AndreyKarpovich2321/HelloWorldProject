package tms.karpovich.lesson7;

public class Comp {
    private String hdd;
    private String ram;

    public Comp(String hdd, String ram) {
        this.hdd = hdd;
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
