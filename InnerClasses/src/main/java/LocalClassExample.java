/*You can define a local class in a method body or in for loop or an if clause
* A local class has access to the members of its enclosing class. In addition a local class has access to local variables.*/
public class LocalClassExample {
    static String regExe="[^0-9]";

    public static void validatePhoneNumber(final String phoneNumber1, final String phoneNumber2){
        final int numberLength=10;   //local variable

        //local class: PhoneNumber
        class PhoneNumber{
            String formattedPhoneNumber=null;

            PhoneNumber(String phoneNumber){
                String currentNumber= phoneNumber.replaceAll(regExe,"");
                if(currentNumber.length()==numberLength){   //if local variable referencing inside the local class it should be final
                    formattedPhoneNumber=currentNumber;
                }else{
                    formattedPhoneNumber=null;
                }
            }

            public String getNumber(){
                return formattedPhoneNumber;
            }

            public void printOriginalNumber(){  // local class can access the parameters of the method i.e validatePhoneNumber
                System.out.println("Original numbers are "+phoneNumber1+" and "+phoneNumber2);
            }
        }

        PhoneNumber number1= new PhoneNumber(phoneNumber1);
        PhoneNumber number2= new PhoneNumber(phoneNumber2);

        number1.printOriginalNumber();
        if(number1.getNumber()==null){
            System.out.println("First phone number is invalid");
        }else{
            System.out.println("First phone number is valid: "+number1.getNumber());
        }
        if(number2.getNumber()==null){
            System.out.println("Second phone number is invalid");
        }else{
            System.out.println("Second phone number is valid: "+number2.getNumber());
        }
    }

    public static void main(String[] args){
        validatePhoneNumber("123-456-7890","456-7890");
    }
}
