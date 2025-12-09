import java.util.Random;
import java.util.Scanner;

public class StartupSimulation {
    public static void main(String[] args) {

        // TASK 1: Declare variables
        double initialInvestment = 250000.0;
        int codeQualityScore = 70;
        double marketAcceptanceRate = 0.0;
        int betaUserCount = 0;
        String teamName = "";
        boolean isProjectClosed = false;

        // Create Scanner and Random objects
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // ==================================================================
        // WORKSPACE: TECHNOLOGY DEVELOPMENT AND TESTING
        // ==================================================================

        // TASK 2: Get Team Name
        System.out.print("Enter your Team Name: ");
        teamName = input.nextLine();

        // 2. INITIAL CODING AND RISK ANALYSIS
        System.out.println("\n--- 1. Initial Technological Platform Preparation ---");

        // TASK 3: Reassign initialInvestment (200,000.0 - 350,000.0) using Math.random()
        double minInv = 200000.0;
        double maxInv = 350000.0;
        initialInvestment = minInv + (Math.random() * (maxInv - minInv));

        // TASK 4: Reassign codeQualityScore (60 - 85)
        codeQualityScore = random.nextInt(85 - 60 + 1) + 60;

        // TASK 5: Cyberattack Risk (0.01 - 0.10)
        double minRisk = 0.01;
        double maxRisk = 0.10;
        double cyberAttackRisk = minRisk + (random.nextDouble() * (maxRisk - minRisk));

        System.out.printf("Team: %s | Budget: %.2f | Quality: %d | Risk: %.2f%%\n",
                teamName, initialInvestment, codeQualityScore, (cyberAttackRisk * 100));

        // TASK 6: Warning if quality < 75
        if (codeQualityScore < 75) {
            System.out.println("WARNING: Technical Debt detected! Code quality is low.");
        }

        // 3. DEVELOPMENT ITERATIONS AND BUDGET USAGE
        System.out.println("\n--- 2. Product Programming Iterations (8 Iterations) ---");
        int totalIterations = 8;

        // TASK 7: Loop 8 times
        for (int i = 1; i <= totalIterations; i++) {

            // TASK 8: Calculate Iteration Cost
            // Note: We used 1500.0 to force floating point division
            double iterationCost = initialInvestment * 0.10 * (1 + (100 - codeQualityScore) / 1500.0);

            // TASK 9: Subtract cost
            initialInvestment -= iterationCost;

            // TASK 10: Increase Code Quality by 2
            codeQualityScore += 2;

            // TASK 11: 10% Chance of Cyberattack
            if (random.nextDouble() < 0.10) {
                System.out.println("ALERT: Cyber Attack detected during iteration " + i + "!");
                initialInvestment -= 5000.0;
            }

            // TASK 12: Check Bankruptcy
            if (initialInvestment < 0) {
                System.out.println("CRITICAL: Budget depleted during development.");
                isProjectClosed = true;
                break; // Stop loop
            }

            // Print progress
            System.out.printf("Iter %d: Budget: %.2f | Quality: %d\n", i, initialInvestment, codeQualityScore);
        }

        // 4. INITIAL TESTING (Scanner)
        if (!isProjectClosed) {
            System.out.println("\n--- 3. Initial Internal (Alpha) Testing Results ---");

            // TASK 13: Get Bug Count
            System.out.print("Enter Bug Count from Alpha Testing: ");
            int bugCount = input.nextInt();

            // TASK 14: Adjust Quality based on Bugs
            if (bugCount > 10) {
                codeQualityScore -= 5;
                System.out.println("High bug count. Quality decreased.");
            } else if (bugCount < 3) {
                codeQualityScore += 5;
                System.out.println("Low bug count. Quality increased!");
            }

            // TASK 15: Subtract Analysis Cost
            initialInvestment -= 10000.0;
        }
    }
}
