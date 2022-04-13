package Extras;

public class Task1 {
        private static final int VALUE_UPPER_A_IN_ASCII = 65;
        private static final int VALUE_UPPER_Z_IN_ASCII = 95;
        private static final int VALUE_LOWER_A_IN_ASCII = 97;
        private static final int VALUE_LOWER_Z_IN_ASCII = 122;
        private static final int DIFF_UPPER_AND_LOWER_IN_ASCII = 32;

    public static void main(String[] args) {

        String sms = "Ala ma kota, a kot ma myszkę";
        System.out.println(fitSMS(sms));

    }
    public static String fitSMS (String sms){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sms.length(); i++){
            if(sms.charAt(i) == ' '){
            sb.append((char)(sms.charAt(i+1) - DIFF_UPPER_AND_LOWER_IN_ASCII));
            i++;
            } else {
                sb.append(sms.charAt(i));
            }
        }
        return sb.toString();
    }

}
