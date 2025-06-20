package day0424;

public class ClassLifeCycle {

	private String name;
	
	public ClassLifeCycle(String name) {
		this.name=name;
		System.out.println(name+"님 입사.");
	} //ClassLifeCycle
	
	@Override
	public void finalize() {
		System.out.println("일 안하고 핸드폰한 "+name+"씨 전격퇴사.");
	} //finalize
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ClassLifeCycle c = new ClassLifeCycle("양준수");
		c = new ClassLifeCycle("강태일");
		c = new ClassLifeCycle("이호빈");
		
		// JVM 에서 더이상 참조되지 않는 객체를 소멸
		System.gc();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		} //end try catch
		
	} //main

} //class
