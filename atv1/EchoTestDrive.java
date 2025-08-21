public class EchoTestDrive {
	public static void main(String[] args) {
		EchoTester e1 = new EchoTester();
		EchoTester e2 = new EchoTester();
		int x = 0;
		while(x<4) {
			e1.hello();
			e1.count = e1.count + 1;
			if(x>0) {
				e2.count = e2.count + 1;
			}
			if(x>1) {
				e2.count = e2.count + e1.count;
			}
			x = x+1;
		}
		System.out.println(e2.count);
	}
}
