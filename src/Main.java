public class Main {
    public static void main(String[] args) {
        teacher t1 = new teacher("Ahmet Kaya", "TRH", "+905434636615");
        teacher t3 = new teacher("Külyutmaz", "BIO", "00555");
        teacher t2 = new teacher("Enes Demirbas", "FZK", "000");
        ders fizik = new ders("Fizik", "101", "FZK");
        fizik.addTeacher(t2);
        ders tarih = new ders("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        ders biyo = new ders("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);
        ogr o1 = new ogr("İnek Şaban", "123", "4", fizik,biyo,tarih);
        o1.addBulkNot(55,80,45,90,75,65);
        ogr o2 = new ogr("Güdük Necmi", "3131", "4", fizik,biyo,tarih);
        o2.addBulkNot(90,10,10,90,85,90);
        o1.fizgecti();
        o1.targecti();
        o1.biyogecti();
        o1.genelort();


    }
}










