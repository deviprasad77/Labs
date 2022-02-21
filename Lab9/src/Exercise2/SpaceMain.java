package Exercise2;

public class SpaceMain {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		Space obj = (str) -> {
			for (int i = 0; i < str.length(); i++) {
				sb.append(str.charAt(i) + " ");
			}
			return sb;
		};
		StringBuffer str2 = obj.s("Krishna");
		System.out.println(str2);
	}

}
