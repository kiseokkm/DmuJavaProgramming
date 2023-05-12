package dy20190629;
//book , title , pages , author     and magazine date,  magaex
public class book {
		String name;
		String writer;
		int page;
		
		public book() {}
		public book(String name, String writer , int page) {
			this.name=name; this.writer=writer; this.page=page;
		}
		public void showbook() {
			System.out.print("제목은:"+name+" 저자는:"+writer+" 페이지는:"+page);
		}

}
