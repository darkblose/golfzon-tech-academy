package test.com;

public class Score {
	//접근제한 선언이 없으면 동일폴더에 유효
	int num;//0
	
	//상속관계시 패키지가 달라도 유효 or 동일폴더에 유효
	protected String name;//null
	
	//소속된 클래스 내부에서만 유휴
	/* private */ int kor;//0
	public int eng;//0
	public int math;//0
	
	
	public Score() {
		System.out.println("Score()...");
	}

}
