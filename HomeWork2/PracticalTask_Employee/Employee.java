class Employee {
    private static double result;
    private String name;
        private double rate;
        private double hours;

        static double totalSum;

        //getter - setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    // constructors
    public Employee(String name, double rate, double hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    public Employee(String name, double rate){
        this.name = name;
        this.rate = rate;
    }
    public Employee(String name){
        this.name = name;
    }

    // methods

    public double getSalary(){

        return rate*hours;
    }

    @Override
    public String toString(){
        if(rate>0 && hours>0) {
            return "[Name=" + name + ", rate= " + rate + ", hours = " + hours + "]";
        }
        else if (rate>0)
        {
            return "[Name=" + name + ", rate= " + rate + "]";
        }
        else {
            return "[Name="+ name + "]";
        }
    }

    public String getBonuses(){
        return "Your bonuses = " + (getSalary()*0.1) + "";
    }

    public double sumSalary(){
        totalSum += getSalary();
        return totalSum;
    }

}
