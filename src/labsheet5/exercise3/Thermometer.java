package labsheet5.exercise3;

public class Thermometer {
    private int currentTemp;
    private int maxTemp;
    private int minTemp;

    public Thermometer(){
        this(0);
        this.minTemp = Integer.MIN_VALUE;
        this.maxTemp = Integer.MAX_VALUE;
    }
    public Thermometer(int currentTemp)
    {
        setCurrentTemp(currentTemp);
        setMaxTemp(currentTemp);
        setMinTemp(currentTemp);
    }

    public int getCurrentTemp(int currentTemp){
        return currentTemp;
    }
    public int getMaxTemp(int maxTemp){
        return maxTemp;
    }
    public int getMinTemp(int minTemp) {
        return minTemp;
    }

    public void setCurrentTemp(int currentTemp){
        this.currentTemp = currentTemp;
        updateMaxMinTemp(currentTemp);
    }
    public void setMaxTemp(int maxTemp){
        //if(maxTemp>minTemp)
            this.maxTemp = maxTemp;
    }
    public void setMinTemp(int minTemp){
        //if(minTemp<maxTemp)
            this.minTemp = minTemp;
    }
    private void updateMaxMinTemp(int currentTemp){
        if(currentTemp>maxTemp)
            setMaxTemp(currentTemp);
        else if(currentTemp<minTemp)
            setMinTemp(currentTemp);
    }

    public String toString(){
        return "Current Temperature: " + getCurrentTemp(currentTemp) + "\nMaximum" +
                " Temperature: " + getMaxTemp(maxTemp) + "\nMinimum Temperature: " +
                getMinTemp(minTemp);
    }
}
