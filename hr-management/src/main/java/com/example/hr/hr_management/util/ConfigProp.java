package com.example.hr.hr_management.util;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
@RefreshScope
@ConfigurationProperties(prefix = "hr-management")
public class ConfigProp {
    private String message;
    private ContactDetails contactDetails;
    private List<String> onCallSupport;

    public static class ContactDetails {
        private String name;
        private String email;

        // Getters and setters
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
    }

    // Getters and setters for HrManagementProperties fields
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public ContactDetails getContactDetails() { return contactDetails; }
    public void setContactDetails(ContactDetails contactDetails) { this.contactDetails = contactDetails; }

    public List<String> getOnCallSupport() { return onCallSupport; }
    public void setOnCallSupport(List<String> onCallSupport) { this.onCallSupport = onCallSupport; }

    @PostConstruct
    public void logProperties() {
        System.out.println("HR Management Properties: " + this);
    }

}
