class Date {
    // Private data members
    private int month;
    private int day;
    private int year;

    // Constructor with parameters to initialize date with integers
    Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    // Constructor with parameters to initialize date with a string

    Date(String DOB){
        String [] DOBArray = DOB.split("/");
        month =  Integer.valueOf(DOBArray[0]);
        day =  Integer.valueOf(DOBArray[1]);
        year =  Integer.valueOf(DOBArray[2]);


    }

    // Method to set date using parameters
    public void setDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Method to print date in a specific format
    public void printDate() {
        System.out.println(month + "-" + day + "-" + year);
    }
    // toString method to provide string representation
    @Override
    public String toString() {
        return month + "-" + day + "-" + year;
    }
}