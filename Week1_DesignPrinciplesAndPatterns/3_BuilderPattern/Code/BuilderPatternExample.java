public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer computer1 = Computer.ComputerBuilder.builder()
            .setCpu("Intel i7")
            .setRam("16GB")
            .setStorage("512GB SSD")
            .build();

        Computer computer2 = Computer.ComputerBuilder.builder()
            .setCpu("Intel i5")
            .setRam("8GB")
            .setStorage("1TB HDD")
            .build();

        System.out.println(computer1);
        System.out.println();
        System.out.println(computer2);
    }
}