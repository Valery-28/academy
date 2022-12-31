package HomeWork3;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

    private final Pattern p = Pattern.compile("\\+1\\d{10}");

    public AmericanPhoneValidator() {
        super();
    }

    @Override
    public Pattern getPattern() {
        return p;
    }
}
