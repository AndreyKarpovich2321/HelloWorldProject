package tms.karpovich.lesson9;

import java.util.Random;

public class Voter {
    Random random = new Random();
    public void vote(){
        int number = random.nextInt(100);
        if (number < 34) OfficialCandidate.votesCount++;
        else if (number >33 && number < 67) IllegalCandidate.votesCount++;
        else if (number >66 && number < 100) RandomCandidate.votesCount++;
    }
}
