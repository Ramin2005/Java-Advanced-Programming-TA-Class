
public class NormalAD extends AD_P {

    public NormalAD(String UserName, String UserNum,
                    String Title, String Description, float Price, int ADNumber) {
        super(UserName, UserNum, Title, Description, Price, ADNumber);
    }

    @Override
    public void setUserNum(String NewUserNum) {
        super.UserNum = NewUserNum;
    }

    @Override
    public void setTitle(String NewTitle) {
        super.Title = NewTitle;
    }

    @Override
    public void setDescription(String NewDescription) {
        super.Description = NewDescription;
    }

    @Override
    public void setPrice(float NewPrice) {
        if (Price <= 0) {
            throw new IllegalArgumentException("Price must be > 0");
        }

        super.Price = NewPrice;
    }

    @Override
    public String getUserName() {
        return super.UserName;
    }

    @Override
    public String getUserNum() {
        return super.UserNum;
    }

    @Override
    public String getTitle() {
        return super.Title;
    }

    @Override
    public String getDescription() {
        return super.Description;
    }

    @Override
    public double getPrice() {
        return super.Price;
    }

    @Override
    public int getADNumber() {
        return super.ADNumber;
    }


    @Override
    public String getCategory() {
        return "Universal";
    }

    @Override
    public String toString() {
        return String.format(
                "Ad number: %d\nCategory: %s\nSeller name: %s\nSeller rate: %s\nSeller phone number: %s\nName: %s\nDescription: %s\nPrice: %.3f",
                getADNumber(),
                getCategory(),
                getUserName(),
                "",
                // User.getRate(getUserName()),
                getUserNum(),
                getTitle(),
                getDescription(),
                getPrice());
    }
}
