import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Password {
    //private String password;

    public boolean checkPassword(String password){
        Pattern specialCharPatten = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
        Pattern lowerCasePatten = Pattern.compile("[a-z ]");
        Pattern digitCasePatten = Pattern.compile("[0-9 ]");

        Matcher specialmatcher = specialCharPatten.matcher(password);
        Matcher upperCasematcher = UpperCasePatten.matcher(password);
        Matcher lowerMatcher = lowerCasePatten.matcher(password);
        Matcher digitMatcher = digitCasePatten.matcher(password);

        boolean matcherS = specialmatcher.find();
        boolean matcherU = upperCasematcher.find();
        boolean matcherL = lowerMatcher.find();
        boolean matcherD = digitMatcher.find();

        if(matcherS && matcherU && matcherL && matcherD && password.length() >= 10){
            System.out.println("Strong password");
            return true;
        }else{
            System.out.println("Password : Weak\nIt needs to contain:\n1- Special characters such as: !@#$%&*()'+,-./:;<=>?[]^_`{|}\n2- At least one Upper case letter\n3- At least one Lower case letter\n4- At least one number\n5- Be at least 10 digits long.");
            return false;
        }
    }
    public String randomPassword(int w){
            // a list of characters to choose from in form of a string
            String combination = "AB5<&#678CDEFGMNOPQ^RSTUVWXYabc1_defghijklmnopq@!%$£+?><&#~=|/';:rstuvHIJKLxyz0123*&-49";
            StringBuilder s = new StringBuilder(w);

            for (int i=0; i<w; i++) {
                //generating a random number using math.random()

                int ch = (int)(combination.length() * Math.random());
                //adding Random character one by one at the end of s
                s.append(combination.charAt(ch));

            }
            return s.toString();
    }
}
