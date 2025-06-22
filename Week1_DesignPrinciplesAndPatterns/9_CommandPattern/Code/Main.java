public class Main {
    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Concrete Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        System.out.println("Pressing ON button:");
        remote.setCommand(lightOn);
        remote.pressButton();

        System.out.println("Pressing OFF button:");
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
