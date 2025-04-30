package practice3;

public class Feedback {
    private String[] feedbacks;

    public Feedback(String[] feedbacks) {
        this.feedbacks = feedbacks;
    }

    public void summarize() {
        int good = 0, bad = 0, excellent = 0;

        for (String feedback : feedbacks) {
            switch (feedback.toLowerCase()) {
                case "good":
                    good++;
                    break;
                case "bad":
                    bad++;
                    break;
                case "excellent":
                    excellent++;
                    break;
                default:
                    System.out.println("Unknown feedback: " + feedback);
            }
        }

        System.out.println("Feedback Summary:");
        System.out.println("Good: " + good);
        System.out.println("Bad: " + bad);
        System.out.println("Excellent: " + excellent);
    }

    public static void main(String[] args) {
        // ✅ Manually assigned feedback inputs
        String[] feedbackInputs = new String[5];
        feedbackInputs[0] = "Good";
        feedbackInputs[1] = "Excellent";
        feedbackInputs[2] = "Bad";
        feedbackInputs[3] = "Good";
        feedbackInputs[4] = "Excellent";

        Feedback processor = new Feedback(feedbackInputs);
        processor.summarize();
    }
}
