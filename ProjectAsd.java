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

            if (pembunuh.length() > batasKarakterNama || korban.length() > batasKarakterNama) {
                System.out.println("Nama tidak boleh melebihi " + batasKarakterNama + " karakter.");
                continue; 
            }
            if (Character.isLowerCase(pembunuh.charAt(0)) || Character.isLowerCase(korban.charAt(0))) {
                System.out.println("Harus menggunakan huruf kapital di awal karakter");
                continue;
            }
            if (!korbanSet.contains(korban)) {
                pembunuhMap.put(pembunuh, pembunuhMap.getOrDefault(pembunuh, 0) + 1);
                korbanSet.add(korban);
            }
        }
        scanner.close();

         for (String korban : korbanSet) {
            pembunuhMap.remove(korban);
        }

                List<String> daftarPembunuh = new ArrayList<>(pembunuhMap.keySet());
        Collections.sort(daftarPembunuh);
        System.out.println("DAFTAR PENCARIAN ORANG KASUS PEMBUNUHAN");
        for (String pembunuh : daftarPembunuh) {
            System.out.println(pembunuh + " " + pembunuhMap.get(pembunuh));
        }

    }
    
}
