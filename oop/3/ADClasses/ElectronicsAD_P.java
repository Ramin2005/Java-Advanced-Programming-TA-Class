

public class ElectronicsAD_P extends NormalAD {

    public ElectronicsAD_P(String UserName, String UserNum,
                         String Title, String Description, float Price, int ADNumber) {
        super(UserName, UserNum, Title, Description, Price, ADNumber);
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}
