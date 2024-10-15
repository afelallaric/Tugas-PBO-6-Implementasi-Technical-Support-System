import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class ResponseGenerator {
    private HashMap<String, String> keywordResponses;
    private ArrayList<String> fallbackResponses;
    private Random randomizer;

    public ResponseGenerator() {
        keywordResponses = new HashMap<>();
        fallbackResponses = new ArrayList<>();
        initializeResponses();
        initializeFallbacks();
        randomizer = new Random();
    }

    private void initializeResponses() {
        keywordResponses.put("bantuan", "Silakan jelaskan masalah pengiriman Anda secara rinci.");
        keywordResponses.put("tracking", "Silakan masukkan nomor resi Anda untuk melacak pengiriman.");
        keywordResponses.put("resi", "Silakan masukkan nomor resi Anda untuk melacak pengiriman.");
        keywordResponses.put("pengiriman", "Kami akan segera memeriksa status pengiriman Anda.");
        keywordResponses.put("alamat", "Silakan periksa kembali alamat pengiriman Anda untuk memastikan keakuratannya.");
        keywordResponses.put("kurir", "Silakan hubungi kurir Anda langsung untuk informasi lebih lanjut.");
        keywordResponses.put("delay", "Kami mohon maaf atas keterlambatan pengiriman. Kami akan segera menanganinya.");
        keywordResponses.put("biaya", "Biaya pengiriman tergantung pada berat dan tujuan paket Anda.");
        keywordResponses.put("pengembalian", "Untuk proses pengembalian, silakan hubungi layanan pelanggan kami.");
        keywordResponses.put("keluhan", "Kami minta maaf atas ketidaknyamanan ini. Silakan berikan detail keluhan Anda.");
        keywordResponses.put("refund", "Proses refund akan kami lakukan setelah verifikasi keluhan Anda.");
        keywordResponses.put("asuransi", "Pengiriman Anda dilindungi oleh asuransi standar kami.");
        keywordResponses.put("jam", "Jam operasional pengiriman kami adalah dari 08.00 hingga 20.00 WIB.");
        keywordResponses.put("lokasi", "Silakan berikan lokasi pengiriman yang tepat agar paket Anda dapat segera diproses.");
        keywordResponses.put("konfirmasi", "Pengiriman Anda telah dikonfirmasi dan sedang diproses.");
        keywordResponses.put("terlambat", "Kami mohon maaf atas keterlambatan pengiriman. Sedang kami cek statusnya.");
        keywordResponses.put("paket", "Paket Anda sedang dalam proses pengiriman. Silakan cek statusnya menggunakan nomor resi.");
        keywordResponses.put("penjadwalan", "Silakan pilih waktu penjadwalan pengiriman yang sesuai dengan Anda.");
        keywordResponses.put("ubah", "Untuk mengubah detail pengiriman, silakan hubungi layanan pelanggan kami.");
    }

    private void initializeFallbacks() {
        fallbackResponses.add("Sepertinya ada yang kurang jelas. Bisa Anda jelaskan lebih lanjut?");
        fallbackResponses.add("Kami belum menerima laporan serupa. Bisa Anda berikan detail pengiriman Anda?");
        fallbackResponses.add("Menarik! Silakan bagikan informasi lebih agar kami dapat membantu.");
        fallbackResponses.add("Kami memerlukan informasi tambahan terkait permintaan Anda.");
        fallbackResponses.add("Sudahkah Anda memastikan nomor resi yang dimasukkan benar?");
        fallbackResponses.add("Biasanya masalah ini dijelaskan di bagian FAQ kami. Sudah dicek?");
        fallbackResponses.add("Penjelasan Anda kurang spesifik. Bisa memberikan detail lebih?");
        fallbackResponses.add("Masalah ini terdengar bisa kami atasi. Berikan konteks lebih lanjut!");
        fallbackResponses.add("Kami siap membantu! Silakan bagikan detailnya agar kami dapat memberikan solusi terbaik.");
    }

    private String getRandomFallback() {
        int index = randomizer.nextInt(fallbackResponses.size());
        return fallbackResponses.get(index);
    }

    public String generateResponse(HashSet<String> inputWords) {
        for (String word : inputWords) {
            if (keywordResponses.containsKey(word)) {
                return keywordResponses.get(word);
            }
        }
        return getRandomFallback();
    }
}
