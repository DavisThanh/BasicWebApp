package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Davis";
        } else if (query.contains("plus")) {
            String[] s = query.split(" ");
            int result = Integer.parseInt(s[3]) + Integer.parseInt(s[5]);
            return String.valueOf(result);
        } else if (query.contains("which of the following numbers is the largest:")) {
            String[] s = query.split(":");
            String[] result = s[3].replaceAll(" ","").split(",");
            String tmp = null;
            for (String value : result) {
                if (tmp == null) {
                    tmp = value;
                }

                if (tmp.compareTo(value) < 0) {
                    tmp = value;
                }
            }
            return tmp;
        } else if (query.contains("multiplied ")) {
            String[] s = query.split(" ");
            int result = Integer.parseInt(s[3]) * Integer.parseInt(s[5]);
            return String.valueOf(result);
        } else if (query.contains("which of the following numbers is both a square and a cube")) {

        } else if (query.contains("what colour is a banana")) {
            return "yellow";
        } else {
            return "";
        }
        return "";
    }
}
