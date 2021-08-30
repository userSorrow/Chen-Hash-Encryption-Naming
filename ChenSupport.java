import java.util.Scanner;

public class ChenSupport {
    private static int findIndex(String array[], String word) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word)) {
                return i;
            }
        }

        return -1;
    }
    private static String[] array(String array) {
        String a = "chen";
        String b = "chne";
        String c = "cnhe";
        String d = "cneh";
        String e = "cenh";
        String f = "cehn";
        String g = "echn";
        String h = "ecnh";
        String i = "ehnc";
        String j = "ench";
        String k = "ehcn";
        String l = "nceh";
        String m = "enhc";
        String n = "nhce";
        String o = "nhec";
        String p = "nech";
        String q = "nehc";
        String r = "hnce";
        String s = "nche";
        String t = "hcne";
        String u = "hcen";
        String v = "henc";
        String w = "hecn";
        String x = "hnec";
        String y = "scehn";
        String z = "schen";

        String[] alphabet = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] hashes = new String[] {a, b, c, d, e, f, g, h, i, j, k, l, m, n,
                o, p, q, r, s, t, u, v, w, x, y, z};

        switch (array) {
            case "alphabet":
                return alphabet;
            case "hashes":
                return hashes;
            default:
                return new String[] {"NO ARRAY FOUND"}; // error message
        }
    }

    protected static void encrypt() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter One Word Lowercase Password:");
        String password = input.next();
        String answer = "";

        String[] alphabet = array("alphabet");
        String[] hashes = array("hashes");

        for (int ind = 0; ind < password.length(); ind++) {
            char letter = password.charAt(ind);
            int index = findIndex(alphabet, Character.toString(letter));
            answer += hashes[index];
        }

        System.out.println(); // Extra line
        System.out.println("Encrypted password:");
        System.out.println(answer);
    }

    protected static void decrypt() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Hashed Password:");
        String password = input.next();
        String answer = "";

        String[] alphabet = array("alphabet");
        String[] hashes = array("hashes");

        int startInd = 0;
        while (startInd < password.length()) {
            int endInd = startInd + 4; // exclusive
            String hash = password.substring(startInd, endInd);
            String firstL = Character.toString(hash.charAt(0));
            if (firstL.equals("s")) {
                endInd++;
                hash = password.substring(startInd, endInd);
            }

            int index = findIndex(hashes, hash);
            answer += alphabet[index];

            startInd = endInd;
        }

        System.out.println(); // Extra line
        System.out.println("Decrypted password:");
        System.out.println(answer);
    }
}
