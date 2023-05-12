package dy20190629;
// class = name , addr , phone 필드 가지고 person상속받은 student
// student는 stuid jeongong and studentex 작성

public class person {
				String name;
				String addr;
				String phone;
				public person() {}
				
				public person(String name,String addr,String phone) {
					this.name=name; this.addr=addr; this.phone=phone;
				}
				public void showperson() {
					System.out.print(name+"의주소는:"+addr+" 전번은:"+phone);
				}
}
