import com.twilio.http.TwilioRestClient;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import spark.Spark;

import static spark.Spark.get;
import static spark.Spark.post;

public class SMSBackend {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "ACf33ccf1ecb81c3b2bd806acd1cef7514";
    public static final String AUTH_TOKEN =
            "4826badc34fe1a0f8d77180e7bc0682e";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+8402815702"), // to
                        new PhoneNumber("+12512502238"), // from
                        "Where's Wallace?")
                .create();

        System.out.println(message.getSid());
    }
}
