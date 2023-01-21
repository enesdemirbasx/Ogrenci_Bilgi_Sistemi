public class teacher {
    String ad;
    String bolum;
    String telno;

    teacher(String ad,String bolum,String telno ){
        this.ad=ad;
        this.bolum=bolum;
        this.telno=telno;
    }


    void print(){
        System.out.println("OGRETMEN BİLGİLERİ");
        System.out.println("Ad: "+ this.ad );
        System.out.println("Bolum: "+ this.bolum );
        System.out.println("Telefon Numarası: "+ this.telno );
    }

}
