//Nama	: Fayyad Rahman
//NIM	: 24060121140161
//Tgl	: 22 Februari 2023
//Desk	:

class Titik{
	
	private	double absis;
	private	double ordinat;
	private	static double counterTitik;
	
	Titik(){
		absis = 0.0;
		ordinat = 0.0;
		counterTitik++;
	}
	
	Titik(double a, double b){
		absis = a;
		ordinat = b;
		counterTitik++;
	}
	
	public void setAbsis(double a){
		absis = a;
	}
	
	public	void setOrdinat(double b){
		ordinat = b;
	}
	
	public	double getAbsis(){
		return absis;
	}
	
	public	double getOrdinat(){
		return ordinat;
	}
	
	public	double getCounterTitik(){
		return counterTitik;
	}
}