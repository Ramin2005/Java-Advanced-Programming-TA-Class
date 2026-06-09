
import java.io.Serializable;

public abstract class AD_P implements Serializable {
    protected String UserName, UserNum, Title, Description;
    protected final int ADNumber;
    protected float Price;
    protected Boolean Deleted = false;

    AD_P(String UserName, String UserNum,
       String Title, String Description, float Price, int ADNumber) {
        if (Price <= 0) {
            throw new IllegalArgumentException("Price must be > 0");
        }

        this.UserName = UserName;
        this.UserNum = UserNum;
        this.Title = Title;
        this.Description = Description;
        this.Price = Price;
        this.ADNumber = ADNumber;
    }

    // abstract set methods
    abstract public void setUserNum(String NewUserNum);

    abstract public void setTitle(String NewTitle);

    abstract public void setDescription(String NewDescription);

    abstract public void setPrice(float NewPrice);

    // abstract get methods
    abstract public String getUserName();

    abstract public String getUserNum();

    abstract public String getCategory();

    abstract public String getTitle();

    abstract public String getDescription();

    abstract public double getPrice();

    abstract public int getADNumber();
}
