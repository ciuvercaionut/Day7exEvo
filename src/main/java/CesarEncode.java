public class CesarEncode {



    void encode(String message, int key) {
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') {
                System.out.print(" ");
            } else {
                System.out.print((char) (c + key));
            }
        }
        System.out.println();
    }
}
