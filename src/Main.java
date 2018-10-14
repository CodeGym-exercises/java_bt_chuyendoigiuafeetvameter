public class Main {

    public static void main(String[] args) {
        System.out.println("Feet to meters");
        System.out.println("1 feet -> "+feetToMeter(1.0)+" meter");
        System.out.println("2 feet -> "+feetToMeter(2.0)+" meter");
        System.out.println("3 feet -> "+feetToMeter(3.0)+" meter");
        System.out.println("4 feet -> "+feetToMeter(4.0)+" meter");
        System.out.println("5 feet -> "+feetToMeter(5.0)+" meter");

        System.out.println("Meter to feet");
        System.out.println("1 metter -> "+meterToFeet(1.0)+" feet");
        System.out.println("2 metter -> "+meterToFeet(2.0)+" feet");
        System.out.println("3 metter -> "+meterToFeet(3.0)+" feet");
        System.out.println("4 metter -> "+meterToFeet(4.0)+" feet");
        System.out.println("5 metter -> "+meterToFeet(5.0)+" feet");
    }
    public static double feetToMeter(double feet){
        return 0.305*feet;
    }
    public static double meterToFeet(double meter){
        return 3.279 * meter;
    }
}
