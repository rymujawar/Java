public class SwitchCaseTest {
    private static final int votingAge = 18;
    public static String checkVotingEligibility() {
        switch (votingAge) {
            case 15:
                System.out.println("Not Eligible for Voting");
                break;
            case 18:
                System.out.println("Eligible for Voting");
                break;
            default:
                System.out.println("Invalid Age");
        }
        return "method called";
    }
    public static void main(String[] args) {
        String result = checkVotingEligibility();
        System.out.println(result);
    }
}
