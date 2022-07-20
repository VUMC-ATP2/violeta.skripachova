package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {

        Customer customerPremium = new Customer("customerPremium");
        customerPremium.setMember(true);
        customerPremium.setMemberType("premium");

        Visit premiumVisit = new Visit(customerPremium, new Date());
        premiumVisit.setProductExpense(50);
        premiumVisit.setServiceExpense(100);
        System.out.println("Client's name: " + premiumVisit.getName());
        System.out.println("Client type: " + customerPremium.getMemberType());
        System.out.println("Product expenses: " + premiumVisit.getProductExpense());
        System.out.println("Service expenses: " + premiumVisit.getServiceExpense());
        System.out.println("Total expenses: " + premiumVisit.getTotalExpense());

        Customer customerGold = new Customer("customerGold");
        customerGold.setMember(true);
        customerGold.setMemberType("gold");

        Visit goldVisit = new Visit(customerGold, new Date());
        goldVisit.setProductExpense(10);
        goldVisit.setServiceExpense(100);
        System.out.println("Client's name: " + goldVisit.getName());
        System.out.println("Client type: " + customerGold.getMemberType());
        System.out.println("Product expenses: " + goldVisit.getProductExpense());
        System.out.println("Service expenses: " + goldVisit.getServiceExpense());
        System.out.println("Total expenses: " + goldVisit.getTotalExpense());

        Customer customerSilver = new Customer("customerSilver");
        customerSilver.setMember(true);
        customerSilver.setMemberType("silver");

        Visit silverVisit = new Visit(customerSilver, new Date());
        silverVisit.setProductExpense(10);
        silverVisit.setServiceExpense(100);
        System.out.println("Client's name: " + silverVisit.getName());
        System.out.println("Client type: " + customerSilver.getMemberType());
        System.out.println("Product expenses: " + silverVisit.getProductExpense());
        System.out.println("Service expenses: " + silverVisit.getServiceExpense());
        System.out.println("Total expenses: " + silverVisit.getTotalExpense());

        Customer customerLoser = new Customer("customerLoser");
        customerLoser.setMember(false);
        customerLoser.setMemberType("");

        Visit loserVisit = new Visit(customerLoser, new Date());
        loserVisit.setProductExpense(10);
        loserVisit.setServiceExpense(100);
        System.out.println("Client's name: " + loserVisit.getName());
        System.out.println("Client type: " + customerLoser.getMemberType());
        System.out.println("Product expenses: " + loserVisit.getProductExpense());
        System.out.println("Service expenses: " + loserVisit.getServiceExpense());
        System.out.println("Total expenses: " + loserVisit.getTotalExpense());


    }

}
