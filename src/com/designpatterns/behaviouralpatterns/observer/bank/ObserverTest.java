package com.designpatterns.behaviouralpatterns.observer.bank;

/**
 * Created using IntelliJ IDEA.
 * User: abhijeet
 * Date: 05/02/17
 * Time: 7:29 PM
 */
public class ObserverTest {
    public static void main(String[] args) {
        NewsPaper newsPaper = new NewsPaper();
        Internet internet = new Internet();
        Loan personalLoan = new Loan("Personal Loan", 12.5f,
                "Standard Chartered");
        personalLoan.registerObserver(newsPaper);
        personalLoan.registerObserver(internet);
        personalLoan.setInterest(3.5f);
    }
}
