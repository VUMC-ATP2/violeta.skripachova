package homework.oop_homework;

public class DiscountRate {

    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscount = 0.1;

    public static double getServiceDiscountRate(String memberType) {
        switch (memberType) {
            case "premium":
                return serviceDiscountPremium;
            case "gold":
                return serviceDiscountGold;
            case "silver":
                return serviceDiscountSilver;
            default:
                return 0;
        }
    }

    public static double getProductDiscount(boolean isMember) {
        if (isMember) {
            return productDiscount;
        } return 0;
    }

}
