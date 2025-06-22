class Computer {

    private final String cpu;
    private final String ram;
    private final String storage;

    private Computer(ComputerBuilder builder) {
        // constructor
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    // inner Class

    @Override
    public String toString() {
        return ("CPU : " + this.cpu + "\nRAM : " + this.ram + "\nStorage : " + this.storage);
    }

    static class ComputerBuilder {
        private String cpu;
        private String ram;
        private String storage;

        public ComputerBuilder(){

        }

        public static ComputerBuilder builder() {
            return new ComputerBuilder();
        }

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}