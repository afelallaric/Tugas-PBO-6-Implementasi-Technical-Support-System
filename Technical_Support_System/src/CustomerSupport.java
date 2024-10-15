import java.util.HashSet;

public class CustomerSupport {
    private UserInputHandler inputHandler;
    private ResponseGenerator responseGen;

    public CustomerSupport() {
        inputHandler = new UserInputHandler();
        responseGen = new ResponseGenerator();
    }

    public void displayWelcome() {
        System.out.println("Selamat datang di Sistem Dukungan Pengiriman Barang Valin!");
        System.out.println("Silakan ceritakan masalah atau pertanyaan Anda terkait pengiriman barang.");
        System.out.println("Kami akan membantu Anda dengan segala permasalahan yang Anda hadapi.");
        System.out.println("Ketik 'bye' untuk keluar dari sistem kami.");
    }

    public void displayFarewell() {
        System.out.println("Selamat tinggal! Terima kasih telah menggunakan Sistem Dukungan Pengiriman Barang Valin.");
    }

    public void initiateSupport() {
        boolean isActive = true;
        displayWelcome();
        while (isActive) {
            HashSet<String> userInput = inputHandler.readInput();
            if (userInput.contains("bye")) {
                isActive = false;
            } else {
                String reply = responseGen.generateResponse(userInput);
                System.out.println(reply);
            }
        }
        displayFarewell();
        inputHandler.shutdown();
    }
}
