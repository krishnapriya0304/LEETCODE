class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin=celsius+273.15;
        double fahrenheit=(celsius*9/5)+32;
        double[] arr=new double[2];
        arr[0]=kelvin;
        arr[1]=fahrenheit;
        return arr;
    }
}
