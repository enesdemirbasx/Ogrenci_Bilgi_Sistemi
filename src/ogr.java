public class ogr {
    ders c1;
    ders c2;
    ders c3;
    String ad;
    String ogrNo;
    String sinif;
    double ort;
    boolean gecis;

    //void addDers(ders ders){this.ders=ders;}

    ogr(String ad,String ogrNo,String sinif,ders c1,ders c2,ders c3){
        this.ad=ad;
        this.sinif=sinif;
        this.ogrNo=ogrNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.ort=0.0;
        this.gecis=false;
    }

    void addBulkNot(int fiznot,int bionot,int tarihnot,int fizsozlu,int biyosozlu,int tarsozlu){
        if(fiznot>=0&&fiznot<=100){
            this.c1.not=fiznot;
        }
        if (bionot >= 0 && bionot <= 100) {
            this.c2.not=bionot;
        }
        if (tarihnot >= 0 && tarihnot <= 100) {
            this.c3.not=tarihnot;
        }
        if (fizsozlu >= 0 && fizsozlu <= 100) {
            this.c1.sozlu=fizsozlu;
        }
        if (biyosozlu >= 0 && biyosozlu <= 100) {
            this.c2.sozlu=biyosozlu;
        }
        if (tarsozlu >= 0 && tarsozlu <= 100) {
            this.c3.sozlu=tarsozlu;
        }
    }

    void biyogecti(){
        this.c2.dersort=(this.c2.not*0.80)+ (c2.sozlu*0.20);
        if (this.c2.dersort>55){
            System.out.println("==============================");
            System.out.println("BİYOLOJİ BAŞARILI");
            this.gecis = true;
        }else{
            System.out.println("==============================");
            System.out.println("BİYOLOJİ BAŞARISIZ");
            this.gecis = false;
        }
        biyoprintnot();
    }

    void targecti(){
        this.c3.dersort=(this.c3.not*0.80)+ (this.c3.sozlu*0.20);
        if (this.c3.dersort>55){
            System.out.println("==============================");
            System.out.println("TARİH BAŞARILI");
            this.gecis = true;
        }else{
            System.out.println("==============================");
            System.out.println("TARİH BAŞARISIZ");
            this.gecis = false;
        }
        tarprintnot();
    }

    void fizgecti(){
        this.c1.dersort=(this.c1.not*0.80)+ (this.c1.sozlu*0.20);
        if (this.c1.dersort>55){
            System.out.println("==============================");
            System.out.println("FİZİK BAŞARILI");
            this.gecis = true;
        }else{
            System.out.println("==============================");
            System.out.println("FİZİK BAŞARISIZ");
            this.gecis = false;
        }
        fizprintnot();
    }
    void genelort(){
        this.ort=(this.c1.dersort+this.c2.dersort+this.c3.dersort)/3.0;
        System.out.println("Genel ortalamanız: "+ this.ort);
    }

    void biyoprintnot(){
            System.out.println("Ad: "+this.ad);
            System.out.println(c2.name+" Notu: "+c2.not);
            System.out.println("Biyoloji Sözlü: "+c2.sozlu);
            System.out.println(c2.name+" Ortalamanız: "+c2.dersort);
            System.out.println("==============================");
    }

    void tarprintnot(){
            System.out.println("Ad: "+this.ad);
            System.out.println(c3.name+" Notu: "+c3.not);
            System.out.println("Tarih Sözlü: "+c3.sozlu);
            System.out.println(c3.name+" Ortalamanız: "+c3.dersort);
            System.out.println("==============================");
    }

    void fizprintnot(){
            System.out.println("Ad: "+this.ad);
            System.out.println(c1.name+" Notu: "+c1.not);
            System.out.println("Fizik Sözlü: "+c1.sozlu);
            System.out.println(c1.name+" Ortalamanız: "+c1.dersort);
            System.out.println("==============================");
    }


    void print(){
        System.out.println("Ad: "+this.ad);
        System.out.println("Sınıf: "+this.sinif);
        System.out.println("Dersler: "+this.c1+","+this.c2+","+this.c3);
        System.out.println("Öğrenci No: "+this.ogrNo);

    }
}














