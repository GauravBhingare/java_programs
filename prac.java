package abc;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class prac {

    public boolean isPhishingDomain(String url) {
        return hasMisleadingDomain(url) || hasSuspiciousSubdomains(url);
    }

    private boolean hasMisleadingDomain(String url) {
        String[] trustedDomains = {"google", "amazon", "facebook", "apple", "microsoft"};
        String domain = extractDomain(url);

        for (String trusted : trustedDomains) {
            if (domain.contains(trusted)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasSuspiciousSubdomains(String url) {
        Pattern pattern = Pattern.compile("(https?://)?(www\\.)?([a-z0-9-]+)\\.(com|net|org|io|co\\.uk)");
        Matcher matcher = pattern.matcher(url);
        return matcher.find();
    }

    private String extractDomain(String url) {
        try {
            URI uri = new URI(url);
            String domain = uri.getHost();
            if (domain != null) {
                return domain.startsWith("www.") ? domain.substring(4) : domain;
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        prac detector = new prac();
        String testUrl = "https://www.paypal-verify.com";
        System.out.println("Is phishing domain: " + detector.isPhishingDomain(testUrl));
    }
}