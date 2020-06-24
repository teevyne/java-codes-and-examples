//public class CreditCardFactory {
//
//
//    private CreditCardFactory(){}
//    
//    public static CreditCard createCreditCard(String creditCardNumber) {
//   
//        if (creditCardNumber.startsWith("4")){
//            return new VisaCard(creditCardNumber);
//        }
//
//        if (creditCardNumber.startsWith("5")){
//            return new Mastercard(creditCardNumber);
//        }
//
//        if (creditCardNumber.startsWith("37")){
//            return new AmericanExpress(creditCardNumber);
//        }
//
//        if (creditCardNumber.startsWith("6")){
//            return new DiscoverCard(creditCardNumber);
//
//        else {
//            return new CreditCard(creditCardNumber+"     ") {
//                @Override
//                public String getCARDTYPE() {
//                    return "Invalid Card";
//                }
//                @Override
//                public int getSize(){
//                    return creditCardNumber.length();
//                }
//            };
//        }
//    }
//}
