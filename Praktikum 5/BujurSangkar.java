// Nama: Fayyad Rahman
// Nim : 24060121140161
// Deskripsi : Kelas yang membuat implementasi metode abstrak pada bangun datar

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        double luas = sisi * sisi;
        return luas;
    }
    
}

//Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode
//abstrak yang ada pada kelas BangungDatar? jelaskan!

//Saat dicompile, akan terjadi error karena BangunDatar hanya merupakan abstrak
//yang di dalam nya terdapat metode yang harus diimplementasikan ke BujurSangkar
//agar dapat bekerja dengan benar