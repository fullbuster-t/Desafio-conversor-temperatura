public class Conversor {
    public static void main(String[] args) {

        double degreesCelsius = 13;
        double degreesFahrenheit = convertCelsiusFahrenheit(degreesCelsius);

        // Output the result - Mostrar el resultado
        System.out.println(degreesCelsius + " grados Celsius equivale a: " + degreesFahrenheit + " grados Fahrenheit");
    }

    /* Conversion method Celsius to Fahrenheit
       Indicate that the return value is of type double*/
    /* Mét/odo de conversion Celsius a Fahrenheit
       Indicamos que el valor de retorno es double*/
    public static double convertCelsiusFahrenheit (double temperature){
        // We perform the conversion and return the value - Realizamos la conversion y regresamos el valor
        return (temperature * 1.8) + 32;
    }
}