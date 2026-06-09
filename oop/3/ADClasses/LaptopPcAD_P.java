
public class LaptopPcAD_P extends ElectronicsAD_P {
    private String Model, Color, Year, RomRam, CPU, GPU;

    public LaptopPcAD_P(String UserName, String UserNum,
                      String Title, String Description, float Price, int ADNumber,
                      String Model, String Color, String Year, String RomRam, String CPU, String GPU) {

        super(UserName, UserNum, Title, Description, Price, ADNumber);
        this.Model = Model;
        this.Color = Color;
        this.Year = Year;
        this.RomRam = RomRam;
        this.CPU = CPU;
        this.GPU = GPU;
    }

    @Override
    public String getCategory() {return "Laptop / PC";}

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

    public void setCPU(String NewCPU) {
        this.CPU = NewCPU;
    }

    public void setGPU(String NewGPU) {
        this.GPU = NewGPU;
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

    public String getCPU() {
        return this.CPU;
    }

    public String getGPU() {
        return this.GPU;
    }

    @Override
    public String toString() {
        return String.format(
                "%s\nBrand & model: %s\nColor: %s\nStorage & Ram: %s\nCPU: %s\nGPU: %s",
                super.toString(),
                getYear(),
                getModel(),
                getColor(),
                getRomRam(),
                getCPU(),
                getGPU());
    }
}
