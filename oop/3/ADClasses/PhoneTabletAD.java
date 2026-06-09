

public class PhoneTabletAD extends ElectronicsAD_P {
    private String Model, Color, Year, RomRam, Chipset;

    public PhoneTabletAD(String UserName, String UserNum,
            String Title, String Description, float Price, int ADNumber,
            String Model, String Color, String Year, String RomRam, String Chipset) {

        super(UserName, UserNum, Title, Description, Price, ADNumber);
        this.Model = Model;
        this.Color = Color;
        this.Year = Year;
        this.RomRam = RomRam;
        this.Chipset = Chipset;
    }

    @Override
    public String getCategory() {return "Phone / Tablet";}

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

    public void setRomRam(String NewRomRam) {
        this.RomRam = NewRomRam;
    }

    public void setChipset(String NewChipset) {
        this.Chipset = NewChipset;
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

    public String getRomRam() {
        return this.RomRam;
    }

    public String getChipset() {
        return this.Chipset;
    }

    @Override
    public String toString() {
        return String.format(
                "%s\nBrand & model: %s\nColor: %s\nStorage & Ram: %s\nChipset: %s",
                super.toString(),
                getYear(),
                getModel(),
                getColor(),
                getRomRam(),
                getChipset());
    }
}
