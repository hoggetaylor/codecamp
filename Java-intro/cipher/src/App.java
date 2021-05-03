public class App {
    public static void main(String[] args) throws Exception {
        String plaintext = "Wziljw%nx%f%uwjxts%|mt%htijx%ns%of{f%xhwnuy";
        int n= 5;
        String ciphertext = App.decrypt (plaintext, n);
        System.out.println (ciphertext);
    }
    public static String encrypt(String plaintext,int n){
        StringBuilder s =new StringBuilder();
        for (char c : plaintext.toCharArray()){
            s.append((char)(c+n));
        }
        return s.toString();
    }
    public static String decrypt (String ciphertext, int n) {
     return  App.encrypt (ciphertext, -n);
        
    }
        
} 
