public class Cafe{
    public static void main(String[] args){

        String generalGreeting ="Welcome to Cafe Java,";
        String pendingMessage= ", your order will be ready shortly.";
        String readyMessage ="Your order is ready!";
        String displayTotalMessage = "Your total is $";
        String changePriceMessage="Sorry for the miscalculation. You owe us $";
        String sorryPriceMessage="Sorry for the miscalculation. We owe you $";

        //Menu variables (add yours below)
        double mochaPrice = 10;
        double dripCoffeePrice = 5;
        double lattePrice = 7;
        double cappuccinoPrice= 2;

        //Customer name variables 
        String customer1 ="Cindhuri";
        String customer2 ="Sam";
        String customer3 ="Jimmy";
        String customer4 ="Noah! ";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;


//practice: 
        String ninja=new String("You are so nice to me!");
        String dojo=" You are so nice to me! ";
        int a = ninja.indexOf("a");
        int b = ninja.indexOf("nice");
        int c = ninja.indexOf("so");
        int d = ninja.indexOf("to");
//practices:
System.out.print(ninja.equals("You are so nice to me!"));
        // System.out.println(ninja==dojo);
        // System.out.println(ninja.equals(dojo));

        // System.out.println(a);
        // System.out.println(ninja.toUpperCase());
        // System.out.println(ninja.trim());
        // System.out.println(b);
        // System.out.println(d);//16
        // System.out.println(c); //output should be 7

//Practice ends here~~~
        // System.out.println(generalGreeting + customer1);
    
        // System.out.println(displayTotalMessage + mochaPrice);
        // System.out.println(customer1 + pendingMessage + readyMessage + displayTotalMessage + dripCoffeePrice);
        // System.out.println(generalGreeting+customer4);
    //     if(isReadyOrder1){
    //         System.out.println(customer4 + readyMessage+displayTotalMessage+cappuccinoPrice);
    //     }else{
    //         System.out.println(customer4+pendingMessage);

    //     }
        // System.out.println(lattePrice+lattePrice);
        // if(isReadyOrder2){
        //     System.out.println(customer2+pendingMessage);
        // }else{
        //     System.out.println(customer2+displayTotalMessage+(lattePrice+lattePrice));
        // }
        // System.out.println(changePriceMessage+(lattePrice-dripCoffeePrice));

        // if(lattePrice>dripCoffeePrice){
        //     System.out.println(changePriceMessage+(lattePrice-dripCoffeePrice));
        // }else if(lattePrice<dripCoffeePrice){
        //     System.out.println(sorryPriceMessage+(dripCoffeePrice-lattePrice));
        // }
    }


}