package tms.karpovich.lesson9;

public class NinthHomework {
    public static void main(String[] args) {
        Voter[] voters = new Voter[100];
        for (Voter i: voters){
            i = new Voter();
            i.vote();
        }
        System.out.println("Voting results");
        System.out.println("OfficialCandidate " + OfficialCandidate.votesCount);
        System.out.println("IllegalCandidate " + IllegalCandidate.votesCount);
        System.out.println("RandomCandidate " + RandomCandidate.votesCount);


    }
}
