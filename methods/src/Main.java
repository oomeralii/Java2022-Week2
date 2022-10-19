public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesajVer("Sayı Mevcuttur: "+aranacak);
        } else {
            mesajVer("Sayı Mevcut Değildir: " + aranacak);
        }
    }

//aranacağı int olarak tanımlamasaydım olmazdı.Çünkü aranacak ana mainin içinde değil ..

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}