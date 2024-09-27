package selectionsort;

public class selection {
	int[] dizi;
	int eleman_sayı=0;
	public void Liste_Eleman(int eleman) {
		dizi=new int[eleman];
	}
	public void Eleman_ekle(int a) {
		if(eleman_sayı>=dizi.length) {
			System.out.println("Dizi dolduğu için ekleme yapılamadı.");
		}
		else {
				dizi[eleman_sayı]=a;
				eleman_sayı++;
		}
		
	}
	public void yazdır() {
		if(dizi==null) {
			System.out.println("Lütfen dize boyutunu ayarlayıp diziyi yazdır seçeneğine basınız.");
		}
		else {
			System.out.print("Dizi:[");
			for(int i=0;i<dizi.length;i++) {
				System.out.print(dizi[i]);
				if(i!=dizi.length-1) {
					System.out.print(",");
				}
				
			}
			System.out.println("]");
		}
	}
	public void selection() {
		int tmp=0;
		for(int i=0;i<dizi.length-1;i++) {
			int indeks=i;
			for(int j=i+1;j<dizi.length;j++) {
				if(dizi[indeks]>dizi[j]) {
					indeks=j;
				}
			}
			tmp=dizi[i];
			dizi[i]=dizi[indeks];
			dizi[indeks]=tmp;
		}
	}
}
