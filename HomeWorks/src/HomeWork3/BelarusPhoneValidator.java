package HomeWork3;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

    private final Pattern p = Pattern.compile("\\+375\\d{9}");

    public BelarusPhoneValidator() {
        super();
    }

    @Override
    public Pattern getPattern() {
        return p;
    }
}