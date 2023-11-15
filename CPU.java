public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }

    class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM + "GB");
            System.out.println("Pabrik RAM: " + this.manufacturer);
        }
    }

    class Harddisk {
        int kapasitas;
        String manufacturer;

        Harddisk(int kapasitas, String manufacturer) {
            this.kapasitas = kapasitas;
            this.manufacturer = manufacturer;
        }

        public void getHarddiskInfo() {
            System.out.println("Kapasitas harddisk: " + this.kapasitas + "GB");
            System.out.println("Merek harddisk: " + this.manufacturer);
        }
    }

    class VGA {
        String manufacturer;
        String model;
        int vram;

        VGA(String manufacturer, String model, int vram) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.vram = vram;
        }

        public void getVGAInfo() {
            System.out.println("Merek VGA: " + this.manufacturer);
            System.out.println("Model VGA: " + this.model);
            System.out.println("VRAM: " + this.vram + "GB");
        }
    }

    class Motherboard {
        String manufacturer;
        String model;
        String ramType;

        Motherboard(String manufacturer, String model, String ramType) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.ramType = ramType;
        }

        public void getMotherboardInfo() {
            System.out.println("Merek motherboard: " + this.manufacturer);
            System.out.println("Model motherboard: " + this.model);
            System.out.println("Tipe RAM: " + this.ramType);
        }

        public void getPowerSupplyInfo() {
            System.out.println("Daya: 850W");
            System.out.println("Merek: Corsair");
            System.out.println("Model: RM850x");
        }
    }

    public void getCPUInfo() {
        System.out.println("Komputer Merek: " + this.merek);
        System.out.println("Harga: " + this.harga);
    }

    class PowerSupply {
        String watt;
        String manufacturer;
        int model;

        PowerSupply(String watt, String manufacturer, int model) {
            this.watt = watt;
            this.manufacturer = manufacturer;
            this.model = model;
        }

        public void getPowerSupplyInfo() {
            System.out.println("Daya: " + this.watt + "W");
            System.out.println("Merek: " + this.manufacturer);
            System.out.println("Model: " + this.model);
        }
    }
}
