package task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task10 {
    public static void main(String[] args) {
        System.out.println(isVowel1('а'));
        System.out.println(isVowel2('а'));
        System.out.println(isVowel3('а'));
        System.out.println(isVowel4('а'));
        System.out.println(isVowel5('Ё'));
        System.out.println(isVowel4('п'));



    }
    static boolean isVowel1(char i){
        char []vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
        i=Character.toLowerCase(i);
        for (char vowel:
             vowels) {
            if (vowel==i) return true;
        }
        return false;
    }

    static boolean isVowel2(char i){
        String s = "аяуюиыэеоё";
        String v=Character.toString(Character.toLowerCase(i));
        if (s.contains(v)){return true;}
        else return false;
    }

    static boolean isVowel3(char i){
        Pattern p = Pattern.compile("[аяуюиыэеоё]",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(Character.toString(i));
        return m.matches();
    }

    static boolean isVowel4(char i){
        switch (Character.toLowerCase(i)){
            case 'а':
            case 'я':
            case 'у':
            case 'ю':
            case 'и':
            case 'ы':
            case 'э':
            case 'е':
            case 'о':
            case 'ё': return true;
            default: return false;
        }
    }

    static boolean isVowel5(char i){
        i=Character.toLowerCase(i);
        if(i=='а'||i=='я'||i=='у'||i=='ю'||i=='и'||
        i=='ы'||i=='э'||i=='е'||i=='о'||i=='ё')return true;
        else return false;
    }



}
