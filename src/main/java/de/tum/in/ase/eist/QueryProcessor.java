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
        } else if(query.contains("plus")) {
            String[] s = query.split(" ");
            int result = Integer.parseInt(s[3]) + Integer.parseInt(s[5]);
            return String.valueOf(result);
        } else if(query.contains("which of the following numbers is the largest:"))
        {

        }
        else {
            return "";
        }
        return "";
    }
}
