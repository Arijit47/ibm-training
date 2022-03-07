import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

	public static void main(String[] args) {
		Locale hindi = new Locale("hi");

		ResourceBundle bundle = ResourceBundle.getBundle("msgs", hindi);
		ResourceBundle bundle2 = ResourceBundle.getBundle("msgs", Locale.FRANCE);
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
		System.out.println("-------------------------------------------");
		System.out.println(bundle2.getString("greeting"));
		System.out.println(bundle2.getString("message"));
	}
}
