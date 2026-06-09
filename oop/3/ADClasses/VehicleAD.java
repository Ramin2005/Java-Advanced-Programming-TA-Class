

public class VehicleAD extends NormalAD {
    private String Model, Color, Year, Mileage, Accident, EngineInfo;

    public VehicleAD(String UserName, String UserNum,
            String Title, String Description, float Price, int ADNumber,
            String Model, String Color, String Year, String Mileage, String Accident, String EngineInfo) {

        super(UserName, UserNum, Title, Description, Price, ADNumber);
        this.Model = Model;
        this.Color = Color;
        this.Year = Year;
        this.Mileage = Mileage;
        this.Accident = Accident;
        this.EngineInfo = EngineInfo;
    }

    @Override
    public String getCategory() {
        return "Vehicle";
    }

    // new set methods
    public void setModel(String NewModel) {
        this.Model = NewModel;
    }

    public void setColor(String NewColor) {
        this.Color = NewColor;
    }

    public void setYear(String NewYear) {
        this.Year = NewYear;
    }

    public void setMileage(String NewMileage) {
        this.Mileage = NewMileage;
    }

    public void setAccident(String NewAccident) {
        this.Accident = NewAccident;
    }

    public void setEngineInfo(String NewEngineInfo) {
        this.EngineInfo = NewEngineInfo;
    }

    // new get methods
    public String getModel() {
        return this.Model;
    }

    public String getColor() {
        return this.Color;
    }

    public String getYear() {
        return this.Year;
    }

    public String getMileage() {
        return this.Mileage;
    }

    public String getAccident() {
        return this.Accident;
    }

    public String getEngineInfo() {
        return this.EngineInfo;
    }

    @Override
    public String toString() {
        return String.format(
                "%s\nBrand & model: %s\nColor: %s\nCar mileage in kilometers: %s\nCar accident situation: %s\nCar engine: %s",
                super.toString(),
                getYear(),
                getModel(),
                getColor(),
                getMileage(),
                getAccident(),
                getEngineInfo());
    }
}
