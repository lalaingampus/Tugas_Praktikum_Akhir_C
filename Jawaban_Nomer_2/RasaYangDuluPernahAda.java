//SOAL 1:

public class RasaYangDuluPernahAda {
    public static void main(String[] args) {
        int[] cinta = {150,162,170,155,140};
	RasaYangDuluPernahAda.codeBaper(cinta);
	RasaYangDuluPernahAda.selaluSayang(cinta);
    }
    
    public static void codeBaper(int[] cinta){
        for(int aku=1; aku < cinta.length; aku++){
            int kamu, dia;
            kamu = aku - 1;
            dia = cinta[aku];
            while(kamu >= 0 && cinta[kamu] > dia)
	    {
                cinta[kamu + 1] = cinta[kamu];
                kamu--;
            }
            cinta[kamu + 1] = dia;
            }
        }
    
    
    public static void selaluSayang(int[] kamu){
        for(int putus = 0; putus < kamu.length; putus++){
            System.out.println(kamu[putus] +  " ");
    	}
     System.out.println( "wkwkwk yang buat soal BUCIN parah" );
    }
}
//Tolong betulkan error-nya yaa
//Kurang lebih ada 20 error dalam puisi indah ini
//Terimakasih

                                                        //Salam cinta dan hangat

                                                        //-Mhamank
