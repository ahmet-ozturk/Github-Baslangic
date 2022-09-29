public class Day2GitGithub {

    public static void main(String[] args) {


        // 1 : git init  --> local repo olusturmak icin yani .git ile klasorumuzun icindeki dosyalari
        // iliskilendirmek icin kullanilir

        // 2 : git add .  --> working spaceden dosyalarimi staging area'ya gonderir

        // 3 : git status  --> durumu gosterir

        // 4 : git commit -m "mesaj"  --> staging area'dan commit store'a dosyalarimi gondermek icin kullanilir
        // yani sürüm olusturmus oluruz

        // 5 : git push  --> uzak repo'ya (github) gondermek icin kullandigimiz kod
        // yalniz git push komutunu direk kullanmak istersek 1 kereligine
        //   * git remote add origin -adress-
        //   * git push -u origin master

        // NOT : Bu 2 komutu tek seferde kullandiktan sonra diger 2. commitlerim icin sadece git push kullaniriz


        System.out.println("github'ı da öğrendim");

        System.out.println("son ekleme");

        // 6 : git log --oneline --> commitlerimizdeki yani versiyonlarımızdaki durumu gösterir
        
        // tamam

        System.out.println("branch deneme 1");

        System.out.println("master deneme 1");
        
        System.out.println("Github edit");

    }
}
