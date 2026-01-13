package Java_program.String;

import java.util.Locale;

public class ReplaceSpace {
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";

        RemoveSpace(str.toLowerCase(Locale.ROOT));
    }

    private static void RemoveSpace(String str) {
        String result=str.replace(" ","");
        System.out.println(result);
    }
}
