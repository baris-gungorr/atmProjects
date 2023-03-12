import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bg Bank'a hoşgeldiniz... ");
        System.out.println("Yapacağınız işlem nedir ? ");

        System.out.println("1-> Para yatırma..");
        System.out.println("2-> Para Çekme..");
        System.out.println("3-> Bakiye Sorgulama..");

        System.out.println("Lütfen seçim yapın..");

        int islem = s.nextInt();


        int bakiye = 1000;

        String cevo = "E";
        Scanner cevap = new Scanner(System.in);
        Scanner yeniCevap = new Scanner(System.in);



        Scanner tutar = new Scanner(System.in);
        switch (islem) {
            case 1:
                System.out.println("İşlem öncesi bakiye bilginiz : " +bakiye);
                System.out.println("Yatırmak istediğiniz tutar nedir ? " );
                islem = tutar.nextInt();
                System.out.println("Paranız yatırılıyor..Lütfen Bekleyiniz..İşlem sonrası güncel bakiye bilginiz gözükecektir..");
                System.out.println("Güncel bakiye bilgisi: " + (bakiye+islem));
                System.out.println("Bizi tercih ettiğiniz için teşekkürler..");
                System.out.println("İşlemlere devam etmek istiyor musunuz (E) ? - Çıkış mı yapılsın ? (Ç) ");
                cevo  = cevap.nextLine();
                if (cevo.equals("E") ) {
                    System.out.println("Hangi işlem ile devam etmek istiyorsunuz ??");
                    int yeniİslem;



                    System.out.println("1-> Para yatırma..");
                    System.out.println("2-> Para Çekme..");
                    System.out.println("3-> Bakiye Sorgulama..");
                    System.out.println("Lütfen seçim yapın");

                    yeniİslem = yeniCevap.nextInt();


                }else {
                    System.out.println("Çıkış yapılıyor efendim..Lütfen kartınızı alın..Sağlıklı günler..");
                    }
                }



        }








    }

