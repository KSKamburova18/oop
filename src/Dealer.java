public class Dealer {
    private int dealerld;
    private String dealerCompanyName;
    private String dealerFirstName;
    private String dealerLastName;

    public Dealer() {
        this.dealerld = 56;
        this.dealerCompanyName = "neshtooo";
        this.dealerFirstName = "neshtosi";
        this.dealerLastName = "neshtosii";
    }

    public Dealer(int dealerld, String dealerCompanyName, String dealerFirstName, String dealerLastName) {
        this.dealerld = dealerld;
        this.dealerCompanyName = dealerCompanyName;
        this.dealerFirstName = dealerFirstName;
        this.dealerLastName = dealerLastName;
    }

    public int getDealerld() {
        return dealerld;
    }

    public String getDealerCompanyName() {
        return dealerCompanyName;
    }

    public String getDealerFirstName() {
        return dealerFirstName;
    }

    public String getDealerLastName() {
        return dealerLastName;
    }

    public void setDealerld(int dealerld) {
        this.dealerld = dealerld;
    }

    public void setDealerCompanyName(String dealerCompanyName) {
        this.dealerCompanyName = dealerCompanyName;
    }

    public void setDealerFirstName(String dealerFirstName) {
        this.dealerFirstName = dealerFirstName;
    }

    public void setDealerLastName(String dealerLastName) {
        this.dealerLastName = dealerLastName;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "dealerld=" + dealerld +
                ", dealerCompanyName='" + dealerCompanyName + '\'' +
                ", dealerFirstName='" + dealerFirstName + '\'' +
                ", dealerLastName='" + dealerLastName + '\'' +
                '}';
    }
}


