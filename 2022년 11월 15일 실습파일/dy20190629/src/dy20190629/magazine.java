package dy20190629;

public class magazine extends book {
		String day;
		public magazine() {}
		public magazine(String name, String writer,int page, String day) {
				super(name,writer,page);
				this.day=day;
		}
		public void showmagazine() {
				showbook();
				System.out.println("출판일자는"+day);
		}

}
