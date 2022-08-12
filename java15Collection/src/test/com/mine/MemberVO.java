package test.com.mine;

import java.util.Objects;

public class MemberVO {

	// 번호num,아이디id,비번pw,이름name,폰번tel
	// 속성 은닉해서 선언
	private int num;
	private String id;
	private String pw;
	private String name;
	private String tel;

	// 매개변수없는 생성자1개 만드시고
	public MemberVO() {
		// TODO Auto-generated constructor stub
	}

	// 모든 속성을 매개변수로하는 생성자 1개 추가
	public MemberVO(int num, String id, String pw, String name, String tel) {
		super();
		this.num = num;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}

	// 게터&세터 구현
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	// toString 재정의
	@Override
	public String toString() {
		return "MemberVO [num=" + num + ", id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}

	// 데이터클래스용 함수 재정의
	@Override
	public int hashCode() {
		return Objects.hash(id, name, num, pw, tel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && num == other.num
				&& Objects.equals(pw, other.pw) && Objects.equals(tel, other.tel);
	}

}
