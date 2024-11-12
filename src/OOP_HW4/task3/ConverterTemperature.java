package OOP_HW4.task3;

public class ConverterTemperature implements ToFarenhait,ToKelvin{
    @Override
    public double farenhait(double celsius) {
        return (celsius * 9/5) + 32;
    }

    @Override
    public double kelvin(double celsius) {
return celsius+273.15;
    }
}
