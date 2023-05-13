package dy2019;

public class Movie {

    String title; //영화제목   
    double grade; //평점   
    String dirctor;    //감독
    int year;    //발표년도
        
     public Movie(String title, double grade,String dirctor, int year) {
    		this.title = title; this.grade = grade; this.dirctor = dirctor;
    		this.year = year;
    		}
    public void printMovie() {
    		System.out.println("제목은 " + this.title+" 평점은 " +this.grade+
    				 " 감독은 "+this.dirctor +" 발표년도는"+this.year);
    }
}
