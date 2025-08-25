package Math;

public class NumberSystem {
    public static void main(String[] args) {
//        decimalToAnyBase(5 , 2);
        anyNumberToDecimal(11001 , 2);
    }
    public static void decimalToAnyBase(int decimal , int anyBase){
        int result = 0;
        int power = 0;
        while (decimal > 0){
            int reminder = decimal % anyBase;
            result += reminder * Math.pow(10 , power);
            decimal /= anyBase;
            power++;
        }
        System.out.println("Result is :"+result);
    }
    public static void anyNumberToDecimal(int anyNumber , int base){
        int result = 0;
        int power = 0;
        while (anyNumber > 0){
            int unitDigit = anyNumber % 10;
            result += unitDigit * Math.pow(base , power);
            anyNumber /= 10;
            power++;
        }
        System.out.println("Result is :"+result);
    }
}
