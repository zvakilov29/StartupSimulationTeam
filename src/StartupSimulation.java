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

        // ==================================================================
        // WORKSPACE: FINANCIAL ANALYSIS AND MARKET STRATEGY
        // ==================================================================

        // 5. MARKET TESTING (DO-WHILE LOOP)
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        if (!isProjectClosed) {
            System.out.println("\n--- 4. Beta Testing and Market Acceptance ---");

            // TASK 16: Start do-while loop
            do {
                // TASK 17: Get Marketing Cost (WITH VALIDATION FIX)
                // This logic is merged from Version 1 to prevent crashes/cheating
                double marketingCost = 0;
                while (true) {
                    System.out.print("     🤳🏻Enter Marketing Cost ($500-$1500): ");
                    marketingCost = input.nextDouble();

                    if (marketingCost >= 500.0 && marketingCost <= 1500.0) {
                        break;
                    } else {
                        System.out.println("     ❌ Error: Value must be between 500 and 1500.");
                    }
                }

                // TASK 18: Subtract marketing cost
                initialInvestment -= marketingCost;

                // TASK 19: Increase beta users
                betaUserCount += random.nextInt(100) + codeQualityScore;

                // TASK 20: Increase market acceptance rate
                marketAcceptanceRate += random.nextDouble() * 0.05;

                // TASK 21: Check bankruptcy
                if (initialInvestment < 0) {
                    System.out.println("🧨 CRITICAL: Budget depleted during market testing.");
                    isProjectClosed = true;
                    break;
                }

                // Print progress
                System.out.printf("                          ↪︎ Beta Users: %d\n", betaUserCount);

            } while (betaUserCount < 500);
        }

        // 6. COMPETITION ANALYSIS AND STRATEGIC DECISIONS
        if (!isProjectClosed) {
            System.out.println("\n--- 5. Competition Analysis and Monetization Strategy ---");

            // TASK 22: Get monetization strategy choice
            System.out.println("     🤳🏻Choose Monetization Strategy:");
            System.out.println("                1 ⥂ Subscription");
            System.out.println("                2 ⥂ Advertising");
            System.out.println("                3 ⥂ Premium Service");
            System.out.print("     Choice: ");
            int choice = input.nextInt();

            // TASK 23: Implement switch-case block
            switch (choice) {
                case 1: // Subscription
                    // TASK 24
                    if (marketAcceptanceRate > 0.3) {
                        initialInvestment += 30000.0;
                        System.out.println("                          ↪︎ Subscription revenue added: $30,000");
                    } else {
                        System.out.println("                          ↪︎ Market acceptance too low for Subscriptions.");
                    }
                    break;

                case 2: // Advertising
                    // TASK 25
                    if (random.nextBoolean()) {
                        initialInvestment += 15000.0;
                        System.out.println("                          ↪︎ Advertising revenue added: $15,000");
                    } else {
                        codeQualityScore -= 10;
                        System.out.println("                          ↪︎ Advertising penalty applied: Quality reduced by 10");
                    }
                    break;

                case 3: // Premium
                    // TASK 26
                    if (codeQualityScore > 80) {
                        initialInvestment += 40000.0;
                        System.out.println("                          ↪︎ Premium service revenue added: $40,000");
                    } else {
                        System.out.println("                          ↪︎ Quality too low for Premium service.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. No revenue added.");
            }
        }

        // 7. FINAL MARKET ACCEPTANCE AND APPROVAL
        if (!isProjectClosed) {
            System.out.println("\n--- 6. Final Handover and Financial Approval ---");

            // TASK 27: Get market analyst decision
            System.out.println("     🤳🏻Enter Market Analyst Decision (1 ⥂ Accept, 2 ⥂ Reject): ");
            int decision = input.nextInt();

            // TASK 28-31: Process decision impact
            if (decision == 1) {  // Accepted
                initialInvestment += (betaUserCount * 10);
                System.out.println("                          ↪︎ Final approval revenue added: $" + (betaUserCount * 10));
            } else if (decision == 2) {  // Rejected
                initialInvestment -= 50000.0;
                codeQualityScore -= 15;
                System.out.println("                          ↪︎ Project rejected. Loss of $50,000 and quality penalty of 15");

                if (initialInvestment < 0) {
                    System.out.println("🧨 CRITICAL: Budget depleted after rejection.");
                    isProjectClosed = true;
                }
            }
        }

        // 8. ADDITIONAL REPORT AND CODE CLEANUP
        if (!isProjectClosed) {
            System.out.println("\n--- 7. Additional Report and Code Cleanup ---");

            // TASK 32: Final code quality cleanup
            codeQualityScore = 90 + random.nextInt(11);  // Range 90-100

            // TASK 33: Deduct final payment
            initialInvestment -= (codeQualityScore / 100.0) * 20000;

            // TASK 34: Bonus for excellent quality
            if (codeQualityScore > 95) {
                marketAcceptanceRate += 0.10;
                System.out.println("                          ↪ Quality bonus applied! Market acceptance increased.");
            }
        }

        // 9. FINAL RESULTS AND REPORT
        System.out.println();
        System.out.println("\n★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★✪★✪★✪★✪★✪★✪★✪★✪★✪★✪★✪★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★");
        System.out.println("                    ★ FINAL STARTUP REPORT ★");

        // TASK 35: Three different ending scenarios
        if (!isProjectClosed && marketAcceptanceRate > 0.50) {
            System.out.println("💁🏻 ULTIMATE SUCCESS: Project completed successfully with strong market acceptance!");
        } else if (!isProjectClosed && marketAcceptanceRate <= 0.50) {
            System.out.println("🤷🏻 PARTIAL SUCCESS: Project completed with moderate market acceptance.");
        } else {
            System.out.println("🙅🏻 PROJECT CLOSED: Insufficient funds caused project closure.");
        }

        // TASK 36: Print final parameters
        System.out.printf("\nFINAL PARAMETERS:         ↪︎ Team Name: %s\n", teamName);
        System.out.printf("                          ↪︎ Final Investment: $%.2f\n", initialInvestment);
        System.out.printf("                          ↪︎ Final Code Quality: %d\n", codeQualityScore);
        System.out.printf("                          ↪︎ Market Acceptance Rate: %.2f%%\n", (marketAcceptanceRate * 100));
        System.out.printf("                          ↪︎ Beta Users: %d\n", betaUserCount);

        // TASK 37: Conversion rate calculation
        double conversionRate = betaUserCount / 3178.0;
        System.out.printf("                          ↪︎ Conversion Rate: %.2f%%\n", (conversionRate * 100));

        // TASK 38-39: Final valuation calculation
        double finalValuation = initialInvestment * (1 + marketAcceptanceRate);
        System.out.printf("                          ↪︎ Final Valuation: $%.2f\n", finalValuation);
        System.out.println();

        input.close();
    }
}

