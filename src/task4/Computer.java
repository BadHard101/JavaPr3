package task4;

public class Computer {
    private int articul = -1;
    private String chipset = "unknown chipset";
    private String processor = "unknown processor";
    private int RAM = -1;
    private int GPU = -1;

    public Computer(int articul, String chipset, String processor, int RAM, int GPU) {
        this.articul = articul;
        this.chipset = chipset;
        this.processor = processor;
        this.RAM = RAM;
        this.GPU = GPU;
    }

    public int getArticul() {
        return articul;
    }

    public void setArticul(int articul) {
        this.articul = articul;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getGPU() {
        return GPU;
    }

    public void setGPU(int GPU) {
        this.GPU = GPU;
    }

    @Override
    public String toString() {
        return "Computer Articul: " + articul +
                ", Chipset: '" + chipset + '\'' +
                ", Processor: '" + processor + '\'' +
                ", RAM = " + RAM +
                ", GPU = " + GPU;
    }
}
