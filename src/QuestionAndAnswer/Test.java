package QuestionAndAnswer;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String mails = "user1@gmail.com     user2@gmail.com   user4@gmail.com";
        String [] mailsArray = mails.split("[ \\t]+ ");
        System.out.println("mailsArray = " + Arrays.toString(mailsArray));
    }
}
