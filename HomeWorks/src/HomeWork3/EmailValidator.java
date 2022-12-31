package HomeWork3;


import java.util.regex.Pattern;



public class EmailValidator implements Validator {

    private final Pattern p = Pattern.compile("[\\w\\-.]+@[a-zA-z0-9\\-.]{2,}\\.[a-zA-z]{2,}");

    public EmailValidator() {
        super();
    }

    @Override
    public Pattern getPattern() {
        return p;
    }
}

