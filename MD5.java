import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
    public static void main(String[] args) {
        String text = "hello";
        
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            
            // Add text bytes to digest
            md.update(text.getBytes());
            
            // Get the hash's bytes
            byte[] bytes = md.digest();
            
            // This bytes[] has bytes in decimal format;
            // Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }
            
            // Print the hash in hexadecimal format
            System.out.println("MD5 Hash of '" + text + "': " + sb.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace(); 
        }
    }
}
