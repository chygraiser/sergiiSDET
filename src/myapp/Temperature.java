package myapp;

public class Temperature {
    public static void main(String [] args) {
        double  celsius, fahrenheit, kelvin;
        celsius = 12;
        fahrenheit = ((celsius * 9) / 5) + 32;
        kelvin = (celsius + 273.16);
        System.out.print(celsius);
        System.out.print("С(Celsius):");
        System.out.print(fahrenheit);
        System.out.print("F(Fahrenheit);");
        System.out.print(kelvin);
        System.out.print("K(Kelvin);");
        System.out.print("GIT1");
    }
}