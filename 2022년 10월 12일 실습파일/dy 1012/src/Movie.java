//영화 제목 ,평점,감독,발표된연도 필드 .
public class Movie {

    String title;    
    double grade;   
    String dirctor;    
    int year;    
    
    void print(){
        System.out.println("영화 제목: " + title);
        System.out.println("평점: " + grade);
        System.out.println("감독: " + dirctor);
        System.out.println("발표연도: " + year);
    }
}