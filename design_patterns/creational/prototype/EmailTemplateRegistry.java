package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class EmailTemplateRegistry {

    private static final Map<String,EmailTemplate> templates = new HashMap<>();

    static {
        templates.put("welcome",new WelcomeEmail());
        // In future let suppose if there are other template for notification for pending loan application we can send.
    }

    public static EmailTemplate getEmailTemplate(String type){
        return templates.get(type).clone();
    }
}
