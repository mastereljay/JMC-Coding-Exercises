public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kilobytes * 10;
            int remainingKiloBytes = kilobytes / 10;
            System.out.println(kilobytes + "KB = " + megaBytes + " and " + remainingKiloBytes " KB");
        }
    }
}
