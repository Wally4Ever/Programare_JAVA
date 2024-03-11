import java.util.Scanner;
import java.util.StringTokenizer;

/*Write a Java application which defines an authentication key with the format: XXXXX-XXXXX-XXXXX-XXXXX,
where X is a character which can be either a digit or a letter. The application should verify if this key has exactly
4 groups of characters with 5 characters each, and separated by the symbol ‘-‘. Also, compute the number of
digits and letters from the authentication key. The number of digits should be greater than the number of
letters, and the number of letters cannot be 0.
If any of the above conditions are not met, display the message: “Invalid authentication key!”
*/
public class Key {
	private static Scanner kb;

	private String key;

	public Key() {
		this.key = "00000-00000-00000-00000";
	}

	public Key(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public boolean isOk() {

		if (key.length() == 23) {
			int digits = 0;
			int letters = 0;
			StringTokenizer token = new StringTokenizer(getKey(), "-");
			int delim = token.countTokens();
			int nr = 0;

			while (nr < delim) {
				String str = token.nextToken();
				if (str.length() != 5) {
					System.out.println("Key is invalid!");
					return false;
				} else {
					for (int i = 0; i < str.length(); i++) {
						if (Character.isLetterOrDigit(str.charAt(i)) == false) {
							System.out.println("Cannot contain symbols!");
							return false;
						} else if (Character.isLetter(str.charAt(i))) {
							letters++;
						} else {
							digits++;
						}
					}
				}
				nr++;
				// next token
			}

			if (letters == 0) {
				System.out.println("Cannot have 0 letters!");
				return false;
			} else if (letters > digits) {
				System.out.println("Cannot have more letters than digits!");
				return false;
			}

		} else {
			System.out.println("Key is too short! ");
			return false;
		}
		System.out.println("Successful!");
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Please enter the key: ");
		kb = new Scanner(System.in);
		String input = kb.nextLine();
		Key key = new Key(input);
		if (!key.isOk()) {
			Key example = new Key("541gh-843yh-09i1h-n18h7");
			System.out.println("Example key: 541gh-843yh-09i1h-n18h7");
			example.isOk();
		}
	}
}
