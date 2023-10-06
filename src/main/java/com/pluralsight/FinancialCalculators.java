package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number of the calculator that you want to use");
        System.out.println("(1)Mortgage\t (2)CD\t (3)Annuity\t");
        int calculator = myScanner.nextInt();
        if (calculator == 1){
            MortgageCalculator();
        }
        if (calculator == 2){
            CDCalculator();
        }
        if (calculator == 3){
            AnnuityCalculator();
        }
    }

    public static void MortgageCalculator() {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to your Mortgage Calculator!");
        System.out.println("How much is the pricipal on your loan?: ");
        double principal = myScanner.nextDouble();
        System.out.println(principal);

        System.out.println("What is your interest rate?: ");
        double interest = myScanner.nextDouble();
        interest = interest / 1200;

        System.out.println("What is the length of your loan in years?: ");
        double loan = myScanner.nextDouble();
        System.out.println(loan);

        double MonthlyPayments = principal * interest / (1 - Math.pow((1 + interest), (-1 * (loan * 12))));

        System.out.printf("Your mortgage monthly payment is: %.2f", MonthlyPayments);
        System.out.println();
        System.out.printf("Your total interest payed is: %.2f", (MonthlyPayments * (loan * 12) - principal));

    }

    public static void CDCalculator() {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to your CD Calculator!");
        System.out.println("What is your deposit amount?: ");
        double deposit = myScanner.nextDouble();
        System.out.println(deposit);

        System.out.println("The Interest?: ");
        double interest = myScanner.nextDouble();
        System.out.println(interest);

        System.out.println("The number of years?: ");
        double years = myScanner.nextDouble();
        System.out.println(years);


        interest /= 100;
        double total = deposit * Math.pow(interest + 1, years);

        double TotalInterest = total - deposit;
        System.out.printf("Your ending balance: %.2f", total);
        System.out.println();
        System.out.printf("Total interest earned: %.2f", TotalInterest);
    }

    public static void AnnuityCalculator() {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to your Annuity Calculator!");
        System.out.println("What is your monthly payout?: ");
        double monthly = myScanner.nextDouble();
        System.out.println();

        System.out.println("What is your expected interest rate?: ");
        double interest = myScanner.nextDouble();
        System.out.println();

        System.out.println("How many years to mature?: ");
        double mature = myScanner.nextDouble();
        System.out.println();

        interest /= 1200;
        double PresentValue = monthly * ((1 - Math.pow((1 + interest), (-1 * mature * 12))) / interest);
        System.out.printf("Present Value: %.2f", PresentValue);

    }
}