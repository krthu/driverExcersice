

public abstract class Vehicle {
    private int miles;
    private Driver driver;

    protected int consumption;

    protected int ageToDrive;

    private String name;

    public Vehicle(int miles, String name){
        this.miles = miles;
        this.name = name;
        System.out.println(name +  " created. " + miles + " miles to go!" );
    }

    public void setDriver(Driver driver) {
        if (driver.getAge() < ageToDrive){
            System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() +
                    ", but must be " + ageToDrive + " or older to drive " + name.toLowerCase());
        }else {
            this.driver = driver;
            System.out.println("Driver changed to " + driver.getName());
        }
    }

    public void drive(){
        if(!isDriverSet()){
            System.out.println(name + " didn´t drive - there´s no driver");
        }else {
            miles -= consumption;
            System.out.println(name + " drove " + consumption + " miles - " + miles + " miles to go");
        }
    }

    public boolean isDriverSet(){
        if(this.driver == null){
            return false;
        }
        return true;
    }

}
