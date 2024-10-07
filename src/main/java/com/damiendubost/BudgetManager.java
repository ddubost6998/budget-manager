package com.damiendubost;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class BudgetManager {
    private List<Expense> expenses;

    public BudgetManager() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public double calculateTotal() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    public void displaySummary() {
        System.out.println("Résumé des dépenses :");
        for (Expense expense : expenses) {
            System.out.printf("%s: %.2f EUR le %s%n", 
                expense.getName(), expense.getAmount(), expense.getDate());
        }
        System.out.printf("Total des dépenses : %.2f EUR%n", calculateTotal());
    }

    public static void main(String[] args) {
        BudgetManager manager = new BudgetManager();
        System.out.println("Bienvenue dans le Gestionnaire de Budget !");

        manager.addExpense(new Expense("Courses", 50.0, LocalDate.of(2024, 10, 1)));
        manager.addExpense(new Expense("Transport", 15.0, LocalDate.of(2024, 10, 2)));

        manager.displaySummary();
    }
}
