package dy1102;

public class BookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Book littlePr = new Book("어린왕자","생텍쥐베리");
	littlePr.show();
	System.out.println(littlePr.add(10, 20));
	System.out.println(littlePr.add(10, 20,30));
	System.out.println(littlePr.add(1.2,2.4));
	
	Book loveStory = new Book("춘향전");
	loveStory.show();
	
	Book emptyBook = new Book();
	emptyBook.show();
	

	}

}
