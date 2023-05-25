import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class SILab2 {

    public static boolean function (User user, List<User> allUsers) { //A
        if (user==null || user.getPassword()==null || user.getEmail()==null){ //B
            throw new RuntimeException("Mandatory information missing!"); //C
        }

        if (user.getUsername()==null){ //D
            user.setUsername(user.getEmail()); //E
        }

        int same = 1; //F
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) { //G
            same = 0; //H
            for (int i=0;i<allUsers.size();i++) { //I
                User existingUser = allUsers.get(i); //J
                if (existingUser.getEmail() == user.getEmail()) { //K
                    same += 1; //L
                }
                if (existingUser.getUsername() == user.getUsername()) { //M
                    same += 1; //N
                }
            }
        }

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}"; //O
        String password = user.getPassword(); //P
        String passwordLower = password.toLowerCase(); //Q

        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) { //R
            return false; //S
        }
        else { //T
            if (!passwordLower.contains(" ")) { //U
                for (int i = 0; i < specialCharacters.length(); i++) { //V
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) { //W
                        return same == 0; // X
                    }
                }
            }
        }
        return false; //Y
    } //Z

}