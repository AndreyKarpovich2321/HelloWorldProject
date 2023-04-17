package tms.karpovich.lesson8;

import java.util.Random;

public class TreatmentPlan {
    int code;
    public TreatmentPlan() {
        code = new Random().nextInt(4);
    }
}
