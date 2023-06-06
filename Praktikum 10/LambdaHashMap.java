/*
Nama File 	: LambdaHashMap.java
Nama		: Fayyad Rahman
NIM			: 24060121140161
Deskripsi 	: Implementasi lambda pada HahsMap, digunakan sebagai parameter pada method
*/

import java.util.HashMap;
import java.util.Map;

public class LambdaHashMap{
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140161", "Fayyad Rahman");
		mahasiswaMap.put("24060121130053", "Vicoriza Ramadhani");
        mahasiswaMap.put("24060121120001", "Muhammad Alif Muchlis");
        mahasiswaMap.put("24060121140165", "Nanda Farrel Chevalerie");

        // Menggunakan ekspresi lambda untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
