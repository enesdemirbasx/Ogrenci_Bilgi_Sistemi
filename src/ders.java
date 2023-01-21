public class ders {
    teacher teacher;
    String name;
    String prefix;
    String code;
    int not;
    int sozlu;
    double dersort;

    ders(String name,String code,String prefix){
        this.name=name;
        this.prefix=prefix;
        this.code=code;
        int note = 0;
    }
    void addTeacher(teacher teacher){
        if(teacher.bolum.equals(this.prefix)){
            this.teacher=teacher;
        }else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }

    }
    void printTeacher(){
        this.teacher.print();
        System.out.println("DERS BİLGİLERİ");
        System.out.println("Ad: "+this.name);
        System.out.println("Bolum: "+this.prefix+this.code);

    }
}
