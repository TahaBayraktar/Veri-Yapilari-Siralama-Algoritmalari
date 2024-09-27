package insertionsort;

public class insert {
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
	public void insert() {
		int t=0 ,j=0 ,i=0;
		for(i=0;i<dizi.length;i++) {
			t=dizi[i];
			for(j=i;j>0 && dizi[j-1]>t;j--) {
				dizi[j]=dizi[j-1];
			}
			dizi[j]=t;
		}
		
	}

}
