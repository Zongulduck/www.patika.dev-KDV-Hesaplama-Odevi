import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        double tutar,kdv,kdv2,kdvlitutar,kdeger;
        kdv=0.18;
        kdv2=0.08;
        Scanner input = new Scanner(System.in);
        System.out.println("Tutar giriniz; ");
        tutar=input.nextDouble();
        if(tutar>1000){
            kdvlitutar=tutar+(tutar*kdv2);
            kdeger=tutar*kdv2;
            System.out.println("kdv li tutarınız ");
            System.out.println(kdvlitutar);
            System.out.println("kdv miktarı ; ");
            System.out.println(kdeger);
        }
        if(tutar>0 && tutar<=1000){
            kdvlitutar=tutar+(tutar*kdv);
            kdeger=tutar*kdv;
            System.out.println("kdv li tutarınız ");
            System.out.println(kdvlitutar);
            System.out.println("kdv miktarı ; ");
            System.out.println(kdeger);
            
        }
        if(tutar<=0) {
            System.out.println("tutar>0 olmalıdır! ");
        }

    }
}
