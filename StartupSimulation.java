
// THIS ONE WAS CHANGED BY JALA VERDIYEVA THAT INITIAL ONE IS IN FILE src

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
        // WORKSPACE: TECHNOLOGY DEVELOPMENT AND TESTING 👷🏻‍♀️
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
        // TƏLƏBƏ B İŞ SAHƏSİ: MALİYYƏ ANALİZİ VƏ BAZAR STRATEJİYASI 👷🏻‍♀️
        // ==================================================================

// 5. MARKET TESTING (DO-WHILE LOOP)
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        if (!isProjectClosed) {
            System.out.println("\n--- 4. Beta Testing and Market Acceptance ---");

            /*
             * TASK 16: do-while döngüsünü başladın. Döngü betaIstifadeciSayi < 500 olduğu müddətcə davam etməlidir.
             */

            // TASK 16: Start do-while loop (continue while betaUserCount < 500)
            do {

                /*
                 * TASK 17: Scanner ilə "Marketing Xərci"ni (double 500.0-1500.0) daxil etməsini istəyin.
                 * TASK 18: ilkinInvestisiya dəyərindən daxil edilmiş xərci çıxın.
                 * TASK 19: betaIstifadeciSayi dəyərini (Random * 100 + kodKeyfiyyetBali) ilə artırın.
                 * TASK 20: bazarQebuluFaizi dəyərini (Random * 0.05) ilə artırın.
                 * TASK 21: if istifadə edərək, ilkinInvestisiya 0-dan kiçikdirsə, layiheBaglandi dəyərini true edərək döngünü dayandırın.
                 */

                // TASK 17: Get Marketing Cost
                System.out.print("     🤳🏻Enter Marketing Cost ($500-$1500): ");
                double marketingCost = input.nextDouble();

                // TASK 18: Subtract marketing cost
                initialInvestment -= marketingCost;

                // TASK 19: Increase beta users
                betaUserCount += random.nextInt(100) + codeQualityScore;

                // TASK 20: Increase market acceptance rate
                marketAcceptanceRate += random.nextDouble() * 0.05;

                // TASK 21: Check bankruptcy
                if (initialInvestment < 0) {
                    System.out.println("🧨CRITICAL: Budget depleted during market testing.");
                    isProjectClosed = true;
                    break;
                }

                // Print progress
                System.out.printf("                          ↪︎ Beta Users: %d\n",
                        betaUserCount);
                System.out.printf("                          ↪︎ Market Acceptance: %.2f%%\n", (marketAcceptanceRate * 100));

            } while (betaUserCount < 500);
        }

        // 6. COMPETITION ANALYSIS AND STRATEGIC DECISIONS
        if (!isProjectClosed) {
            System.out.println("\n--- 5. Competition Analysis and Monetization Strategy ---");

            /*
             * TASK 22: İstifadəçidən "Monetizasiya Strategiyasını" seçməsini istəyin (1: Abunə, 2: Reklam, 3: Premium Xidmət).
             * TASK 23: İstifadəçinin seçimini yoxlamaq üçün switch-case blokunu tətbiq edin.
             */

            // TASK 22: Get monetization strategy choice
            System.out.println("     🤳🏻Choose Monetization Strategy:");
            System.out.println("                1 ⥂ Subscription");
            System.out.println("                2 ⥂ Advertising");
            System.out.println("                3 ⥂ Premium Service");

            int choice = input.nextInt();

            // TASK 23: Implement switch-case block
            switch (choice) {

                /*
                 * TASK 24: Case 1 (Abunə) üçün: if-else ilə bazarQebuluFaizi 0.3-dən böyükdürsə, ilkinInvestisiya-ya 30000.0 əlavə edin (Erkən qazanc).
                 * TASK 25: Case 2 (Reklam) üçün: Random istifadə edərək 50% şansla ya büdcə artımı (+15000.0), ya da kodKeyfiyyetBali cəzası (-10) tətbiq edin.
                 * TASK 26: Case 3 (Premium) üçün: kodKeyfiyyetBali > 80 olarsa, ilkinInvestisiya-ya 40000.0 əlavə edin.
                 */

                case 1: // Subscription
                    // TASK 24: Add revenue if market acceptance is high
                    if (marketAcceptanceRate > 0.3) {
                        initialInvestment += 30000.0;
                        System.out.println("                          ↪︎ Subscription revenue added: $30,000");
                    }
                    break;

                case 2: // Advertising
                    // TASK 25: 50% chance of profit or penalty
                    if (random.nextBoolean()) {
                        initialInvestment += 15000.0;
                        System.out.println("                          ↪︎ Advertising revenue added: $15,000");
                    } else {
                        codeQualityScore -= 10;
                        System.out.println("                          ↪︎ Advertising penalty applied: Quality reduced by 10");
                    }
                    break;

                case 3: // Premium
                    // TASK 26: Add revenue if code quality is excellent
                    if (codeQualityScore > 80) {
                        initialInvestment += 40000.0;
                        System.out.println("                          ↪︎ Premium service revenue added: $40,000");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. No revenue added.");
            }
        }

        // 7. FINAL MARKET ACCEPTANCE AND APPROVAL
        if (!isProjectClosed) {
            System.out.println("\n--- 6. Final Handover and Financial Approval ---");

            /*
             * TASK 27: Scanner ilə "Bazar Təhlilçisinin Qərarını" (int 1: Qəbul, 2: Rədd) alın.
             * TASK 28: if-else if blokunu yaradın.
             * TASK 29: Əgər Qəbul edilsə (Seçim 1): ilkinInvestisiya dəyərinə (betaIstifadeciSayi * 10) əlavə edin.
             * TASK 30: Əgər Rədd edilsə (Seçim 2): ilkinInvestisiya-dan 50000.0 çıxın VƏ kodKeyfiyyetBali-nı 15 vahid azaldın.
             * TASK 31: Əgər ilkinInvestisiya 0-dan kiçikdirsə, layiheBaglandi dəyərini true edin.
             */

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
                    isProjectClosed = true;
                }
            }
        }

        // 8. ADDITIONAL REPORT AND CODE CLEANUP  (Tələb A 👷🏻‍♀️)

        if (!isProjectClosed) {
            System.out.println("\n--- 7. Additional Report and Code Cleanup ---");

            /*
             * TASK 32: kodKeyfiyyetBali dəyərini Random ilə 90-100 aralığına gətirin (Yekun təmizlənmə).
             * TASK 33: ilkinInvestisiya dəyərindən (kodKeyfiyyetBali / 100 * 20000) məbləğini çıxın (Yekun Əmək Haqqı).
             * TASK 34: Əgər kodKeyfiyyetBali 95-dən böyükdürsə, bazarQebuluFaizi dəyərini 0.10 artırın.
             */

            // TASK 32: Final code quality cleanup
            codeQualityScore = 90 + random.nextInt(11);  // Set to 90-100 range

            // TASK 33: Deduct final payment
            initialInvestment -= (codeQualityScore / 100.0) * 20000;

            // TASK 34: Bonus for excellent quality
            if (codeQualityScore > 95) {
                marketAcceptanceRate += 0.10;
                System.out.println("                          ↪ Quality bonus applied! Market acceptance increased.");
            } else{
                System.out.println("                          ↪︎ Nothing applied.");
            }
        }

        // 9. FINAL RESULTS AND REPORT

        System.out.println();
        System.out.println("\n★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★✪★✪★✪★✪★✪★✪★✪★✪★✪★✪★✪★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★");
        System.out.println("                    ★ FINAL STARTUP REPORT ★");

        /*
         * TASK 35: Üç fərqli sonluq göstərmək üçün if-else if-else blokunu tətbiq edin:
         * - 1) Mükəmməl Uğur (layiheBaglandi == false VƏ bazarQebuluFaizi > 0.50).
         * - 2) Qismən Uğur (layiheBaglandi == false VƏ bazarQebuluFaizi <= 0.50).
         * - 3) Layihənin Bağlanması (layiheBaglandi == true).
         * TASK 36: Yekun parametrləri (kodKeyfiyyetBali, ilkinInvestisiya, bazarQebuluFaizi, betaIstifadeciSayi) çap edin.
         */

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

        /*
         * TASK 37: İstifadəçilərin konversiya nisbətini (betaIstifadeciSayi / xesteSayi, burada xesteSayi hər hansı bir böyük rəqəm ola bilər, məsələn 2000) hesablayın və çap edin.
         * TASK 38: Məhsulun Yekun Qiymətləndirmə Dəyərini (ilkinInvestisiya * (1 + bazarQebuluFaizi)) hesablayın.
         * TASK 39: Hesablanmış qiymətləndirmə dəyərini çap edin.
         * TASK 40: Scanner-i bağlayın.
         */

        // TASK 37: Conversion rate calculation
        double conversionRate = betaUserCount / 3178.0;  // Assuming 3178 total potential users
        System.out.printf("                          ↪︎ Conversion Rate: %.2f%%\n", (conversionRate * 100));

        // TASK 38-39: Final valuation calculation
        double finalValuation = initialInvestment * (1 + marketAcceptanceRate);
        System.out.printf("                          ↪︎ Final Valuation: $%.2f\n", finalValuation);
        System.out.println();
        System.out.println();
        // Close scanner
        input.close();
    }
}
