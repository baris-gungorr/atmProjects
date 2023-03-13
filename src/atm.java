import javax.swing.*;
import java.util.Scanner;

public class atm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "baris", pasword = "123123";
        String kullanici_adi, sifre;

        System.out.println("Lütfen kullanıcı adını girin");
        kullanici_adi = input.nextLine();
        System.out.println("Şifrenizi girin");
        sifre = input.nextLine();

        if (username.equals(kullanici_adi) && pasword.equals(sifre)) {
            System.out.println("Başarılı giriş..Karşılama ekranına yönlendiriliyorsunuz..");

        } else if (username.equals(kullanici_adi) == !pasword.equals(sifre)) {
            System.out.println("hatalı giriş");

        } else {
            System.out.println("hatalı giriş");


            Scanner s = new Scanner(System.in);

            System.out.println("Bg Bank'a hoşgeldiniz... ");
            System.out.println("Yapacağınız işlem nedir ? ");

            System.out.println("1-> Para yatırma..");
            System.out.println("2-> Para Çekme..");
            System.out.println("3-> Bakiye Sorgulama..");

            System.out.println("Lütfen seçim yapın..");


            int islem = s.nextInt();


            if (islem == 1 || islem == 2 || islem == 3) {


                int bakiye = 5000;


                String cevo = "E";
                Scanner cevap = new Scanner(System.in);
                Scanner yeniCevap = new Scanner(System.in);


                Scanner tutar = new Scanner(System.in);
                switch (islem) {
                    case 1:
                        System.out.println("İşlem öncesi bakiye bilginiz : " + bakiye);
                        System.out.println("Yatırmak istediğiniz tutar nedir ? ");
                        islem = tutar.nextInt();
                        System.out.println("Paranız yatırılıyor..Lütfen Bekleyiniz..İşlem sonrası güncel bakiye bilginiz gözükecektir..");
                        System.out.println("Güncel bakiye bilgisi: " + (bakiye + islem));
                        int guncelBakiye = bakiye + islem;
                        System.out.println("Bizi tercih ettiğiniz için teşekkürler..");


                        System.out.println("İşlemlere devam etmek istiyor musunuz (E) ? - Çıkış mı yapılsın ? (Ç) ");
                        cevo = cevap.nextLine();

                        if (cevo.equals("E")) {
                            System.out.println("Hangi işlem ile devam etmek istiyorsunuz ??");
                            int yeniİslem;

                            System.out.println("1-> Para Çekme..");
                            System.out.println("2-> Bakiye Sorgulama..");
                            System.out.println("Lütfen seçim yapın !");


                            yeniİslem = yeniCevap.nextInt();

                            Scanner tutar1 = new Scanner(System.in);


                            System.out.println("işlem öncesi güncel bakiye bilginiz : " + (guncelBakiye));

                            System.out.println("Hesabınızdan çekmek istediğiniz tutar nedir ? ");


                            int tutarr = tutar1.nextInt();
                            System.out.println("Paranız hazırlanıyor..Lütfen Bekleyiniz..İşlem sonrası güncel bakiye bilginiz gözükecektir..");
                            System.out.println("Güncel bakiye bilgisi: " + (guncelBakiye - tutarr));
                            System.out.println("Bizi tercih ettiğiniz için teşekkürler..");

                            System.out.println("İşlemlere devam etmek istiyor musunuz (E) ? - Çıkış mı yapılsın ? (Ç) ");
                            cevo = cevap.nextLine();

                        } else if (cevo.equals("Ç")) {
                            System.out.println("Çıkış yapılıyor efendim...");


                            if (cevo.equals("E")) {
                                System.out.println(" Bakiye sorgulama ile devam edebilirsiniz ?");
                                int yeniBakiyeİslem;


                                System.out.println("1-> Bakiye Sorgulama..");
                                System.out.println("Lütfen seçim yapın !");
                                if (1 == 1) {
                                    yeniBakiyeİslem = yeniCevap.nextInt();
                                    System.out.println("Güncel bakiye durumunuz :" + guncelBakiye);
                                    System.out.println("Bizi tercih ettiğiniz için teşekkürler..Çıkış yapılıyor..");

                                } else {
                                    System.out.println("Bu aşamada sadece bakiye sorgulayabilirsiniz..!");
                                    System.out.println("Seçim yapabileceğiniz işlem adı ->> Bakiye Sorgulama (1-)");
                                }


                            }
                        } else if (cevo.equals("Ç")) {
                            System.out.println("Çıkış yapılıyor efendim...");

                        } else if (cevo.equals("e")) {
                            System.out.println(" (Lütfen (E-Ç) harflerinden birini tuşlayınız..Büyük-Küçük harf duyarlıdır..)");

                        } else if (cevo.equals("ç")) {
                            System.out.println("Lütfen (E-Ç) harflerinden birini tuşlayınız..Büyük-Küçük harf duyarlıdır..");


                        } else {
                            System.out.println("Hatalı tuşlama yaptınız.. (E-Ç) harfleri dışında yapılan girişler geçersiz sayılacaktır..kalan deneme sayısı: 3");
                        }

                    {

                    }
                }
            }

        } else {
            System.out.println("hatalı tuşlama yaptınız");
        }


    }

    {
    }
}





