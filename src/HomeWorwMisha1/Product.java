package HomeWorwMisha1;

public class Product {
    private String nameOfGood;
    private String codeOfGood;
    private int priceOfGood;
    private String descriptionOfGood;
    private boolean availabilityOfGood;


    public void setCodeOfGood(String codeOfGood) {
        this.codeOfGood = codeOfGood;
    }

    public void setPriceOfGood(int priceOfGood) {
        this.priceOfGood = priceOfGood;
    }

    public void setAvailabilityOfGood(boolean availabilityOfGood) {
        this.availabilityOfGood = availabilityOfGood;
    }

    public String getNameOfGood() {
        return nameOfGood;
    }

    public String getCodeOfGood() {
        return codeOfGood;
    }

    public int getPriceOfGood() {
        return priceOfGood;
    }

    public String getDescriptionOfGood() {
        return descriptionOfGood;
    }

    public boolean isAvailabilityOfGood() {
        return availabilityOfGood;
    }

    public Product(String nameOfGood, String codeOfGood, int priceOfGood, String descriptionOfGood, boolean availabilityOfGood) {
        this.nameOfGood = nameOfGood;
        this.codeOfGood = codeOfGood;
        this.priceOfGood = priceOfGood;
        this.descriptionOfGood = descriptionOfGood;
        this.availabilityOfGood = availabilityOfGood;
    }

    public Product( String nameOfGood,int priceOfGood, boolean availabilityOfGood) {
        this.nameOfGood = nameOfGood;
        this.priceOfGood = priceOfGood;
        this.availabilityOfGood = availabilityOfGood;
    }
}
