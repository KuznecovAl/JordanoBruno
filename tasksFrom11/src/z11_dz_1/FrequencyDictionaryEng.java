package z11_dz_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FrequencyDictionaryEng {

    public static Map doIt(String s) {

        char c;
        StringBuilder temp = new StringBuilder();
        Map<String, Integer> fd = new HashMap<>();


       /*убираем знаки препинания*/
        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z' || c == ' ') {
                temp.append(c);
            }
        }
        s = temp.toString();

        int i = 0;

        /*перебор слов и составление частотного словаря*/
        for (; ; ) {
            temp.delete(0, temp.length());
            while (s.charAt(i) != ' ' & i != s.length() - 1) {
                c = s.charAt(i);
                temp.append(c);
                i++;
            }
            i++;
            if (!Objects.equals(temp.toString(), "")) {
                fd.put(temp.toString(), fd.containsKey(temp.toString()) ? fd.get(temp.toString()) + 1 : 1);
            }
            if (i >= s.length() - 1) break;
        }

        return fd;

    }


}


