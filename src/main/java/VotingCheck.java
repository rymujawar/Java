public class VotingCheck {
    private static final int votingAge = 18;
    public static String checkVotingEligibility(int voterAge) {
        if (voterAge < 0) {
            throw new IllegalArgumentException("Age cannot be Negative");
        }
//            if(voterAge > votingAge)
//                return "Eligible for Voting";
//            else
//                return "Not Eligible for Voting";
        return (voterAge >= votingAge) ? "Eligible for voting" : "Not Eligible for voting";
    }
    public static void main(String[] args) {
        try {
            String nonEligibleMessage = checkVotingEligibility(15);
            String eligibleMessage = checkVotingEligibility(78);
            String InvalidMessage = checkVotingEligibility(-78);
            System.out.println(eligibleMessage.toUpperCase());
            System.out.println(nonEligibleMessage);
            System.out.println(InvalidMessage);
        } catch (Exception e) {
            System.out.println("Error--->" + e.getMessage());
        }
    }
}
