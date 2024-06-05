import java.util.*;
public class ProjectAsd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> pembunuhMap = new HashMap<>();
        Set<String> kkorbanSet = new HashSet<>();
        
        int maksBaris = 1000;
        int barisAwal = 0;
        int batasKarakterNama = 10;

        while (scanner.hasNextLine()) {
            if (barisAwal >= maksBaris) {
                System.out.println("Peringatan: Jumlah maksimum baris input telah tercapai.");
                break;
            }

            String line = scanner.nextLine();
            barisAwal ++;

            if (line.trim().isEmpty()) {
                break;
            }
            String[] names = line.split(" ");
            String pembunuh = names[0];
            String korban = names[1];
        }
    }
    
}
