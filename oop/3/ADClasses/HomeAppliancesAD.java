
public class HomeAppliancesAD extends NormalAD {

    public HomeAppliancesAD(String UserName, String UserNum, String Title, String Description, float Price,
                            int ADNumber) {
        super(UserName, UserNum, Title, Description, Price, ADNumber);
    }

    @Override
    public String getCategory() {
        return "Home Appliances";
    }
}
