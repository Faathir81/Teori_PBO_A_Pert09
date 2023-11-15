public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        // buat object Processor
        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");

        // buat object RAM
        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        // panggil metode getCPUInfo()
        myKomputer.getCPUInfo();

        // panggil metode getProcessorInfo()
        i7.getProcessorInfo();

        // panggil metode getInfoRAM()
        rs32GB.getInfoRAM();

        // buat object harddisk, vga, motherboard, powersupply
        CPU.Harddisk hdd1TB = myKomputer.new Harddisk(1000, "Seagate");
        CPU.VGA vgaRTX3080 = myKomputer.new VGA("NVIDIA", "RTX 3080", 10);
        CPU.Motherboard asusZ690 = myKomputer.new Motherboard("ASUS", "Z690-A", "DDR4");
        CPU.PowerSupply corsairRM850x = myKomputer.new PowerSupply("Corsair", "RM850x", 850);

        // panggil metode getHarddiskInfo()
        hdd1TB.getHarddiskInfo();

        // panggil metode getVGAInfo()
        vgaRTX3080.getVGAInfo();

        // panggil metode getMotherboardInfo()
        asusZ690.getMotherboardInfo();

        // panggil metode getPowerSupplyInfo()
        corsairRM850x.getPowerSupplyInfo();
    }
}
