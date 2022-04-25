package esiea.tools.validator;
import java.util.regex.*;

public class PasswordValidator {
    private String strRegEx ="^(?=.*[0-9]).{6,20}$";
    private String password;
    public PasswordValidator(String password){
        this.password = password;

    }
    public boolean verify(){
        Pattern p;
        Matcher m;
        p = Pattern.compile(this.strRegEx);
        m = p.matcher(this.password);
        return m.matches();
    }

}
