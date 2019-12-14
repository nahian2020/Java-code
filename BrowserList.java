public class BrowserList{
public static void main(String [] args){
String browsers[] = new String[4];
browsers[0] = "chrome";
browsers[1] = "firefox";
browsers[2] = "safari";
browsers[3] = "opera";

for (int row = 0; row < browsers.length; row++) {
	System.out.println(browsers[row]);
}
}
}