package tms.karpovich.lesson8;

public class Patient {
    TreatmentPlan treatmentPlan;

    public Patient() {
        treatmentPlan = new TreatmentPlan();
    }

    public void setDoctor(){
        switch (treatmentPlan.code){
            case 1:
                Surgeon.treat();
                break;
            case 2:
                Dentist.treat();
                break;
            default:
                Therapist.treat();
                break;
        }
    }
}
