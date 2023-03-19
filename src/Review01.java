
public class Review01 {

	public static void main(String[] args) {
		int ne = 1500;
		int zei = 10;
		int result = tax(ne,zei);

	System.out.println(ne+"円の商品の税込価格は"+(ne+result)+"円（消費税は"+result+"円）です。");
		}
	public static int tax(int ne,int zei) {
	int result=(int)(ne*(int)zei/(1000*0.1));
	return result;
	}

}
