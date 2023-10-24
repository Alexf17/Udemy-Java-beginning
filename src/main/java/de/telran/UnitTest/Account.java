package de.telran.UnitTest;

public class Account {
    public boolean isAccountValid(String account) {
        boolean result = false;
        if (account == null || account.isEmpty()) {
            result = false;
        } else if (account.length() != 14) {
            result = false;
        } else {
            for (int i = 0; i < account.length(); i++) {
                if (account.charAt(i) != '0'){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
