package homework.oop_homework;

import lombok.Setter;
import lombok.ToString;

import java.util.Date;

import static homework.oop_homework.DiscountRate.getProductDiscount;
import static homework.oop_homework.DiscountRate.getServiceDiscountRate;

@ToString
public class Visit {

    private Customer customer;
    private Date date;
    @Setter
    private double serviceExpense;
    @Setter
    private double productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        if (customer.isMember()) {
            return serviceExpense - serviceExpense * getServiceDiscountRate(customer.getMemberType());
        }
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense - productExpense * getProductDiscount(customer.isMember());
    }

    public double getTotalExpense() {
        return getProductExpense() + getServiceExpense();
    }
}
