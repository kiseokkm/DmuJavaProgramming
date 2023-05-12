package dy20190629;

public class TextBook extends book {
		String hakgi;
		String school;
		public TextBook() {}
		public TextBook(String name,int page,String writer,String hakgi,String school) {
				super(name,writer,page);
				this.hakgi=hakgi;
				this.school=school;
		}
		public void showTextBook() {
				showbook();
				System.out.println(" 학년학기:"+hakgi+" 학교는:"+school);
		}

}
