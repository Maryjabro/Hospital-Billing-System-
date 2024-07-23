class Bill {
    // Data members
    private int ID;
    private double pharmacyCharges;
    private double roomCharges;
    private double doctorFee;

    // Constructor with parameters to initialize data members
    public Bill(int ID, double pharmacyCharges, double roomCharges, double doctorFee) {
        this.ID = ID;
        this.pharmacyCharges = pharmacyCharges;
        this.roomCharges = roomCharges;
        this.doctorFee = doctorFee;
    }

    // Getters and setters for data members
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    //calculate total charges by adding all charges
    public double getTotalCharges() {
        return pharmacyCharges + roomCharges + doctorFee;
    }


    public double getPharmacyCharges() {
        return pharmacyCharges;
    }

    public void setPharmacyCharges(double pharmacyCharges) {
        this.pharmacyCharges = pharmacyCharges;
    }

    public double getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }

    public double getDoctorFee() {
        return doctorFee;
    }

    public void setDoctorFee(double doctorFee) {
        this.doctorFee = doctorFee;
    }

    // toString method to provide string representation
    @Override
    public String toString() {
        return
                "Bill for ID "+ID+"\n"+
                "Pharmacy Charges: $" + pharmacyCharges +"\n"+
                "Room Charges: $" + roomCharges +"\n"+
                "Doctor Fee: $" + doctorFee +"\n"+
                "-------------------------------"+"\n"+
                "Total Charges: $" + getTotalCharges() +"\n"
                ;
    }
}