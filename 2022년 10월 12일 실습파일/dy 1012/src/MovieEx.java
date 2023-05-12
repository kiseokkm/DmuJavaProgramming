
public class MovieEx {


public static void main(String[] args) {
			
		        Movie m = new Movie();
		        
		        m.title = "LOL";
		        m.grade = 5.0;
		        m.dirctor = "Liot Korea";
		        m.year = 2008;
		        
		 System.out.println("첫번째 영화 정보-----");
		        m.print();
		        
		        Movie m1 = new Movie();
		        
		        m1.title = "baseball";
		        m1.grade = 4.0;
		        m1.dirctor = "seoul";
		        m1.year = 2015;
		 
		        System.out.println("두번째 영화 정보-----");
		        m1.print();
		    }
}
		 
