package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertiesYopmail {
    private static GetPropertiesYopmail getProperties = null;
    private String browser;
    private String host;
    private String user;
    private String emailTo;
    private String emailSubject;
    private String emailBody;

    private GetPropertiesYopmail() {
        Properties properties = new Properties();
        String nameFile = "yopmail.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);

        if(inputStream != null){
            try{
                properties.load(inputStream);
                browser = properties.getProperty("browser");
                host = properties.getProperty("host");
                user = properties.getProperty("user");
                emailTo= properties.getProperty("emailTo");
                emailSubject = properties.getProperty("emailSubject");
                emailBody = properties.getProperty("emailBody");

            } catch (IOException e){
                throw new RuntimeException("Error aqui");
            }
        }
    }

    public static GetPropertiesYopmail getInstance(){
        if(getProperties == null)
            getProperties = new GetPropertiesYopmail();
        return getProperties;
    }

    public static GetPropertiesYopmail getGetProperties() {
        return getProperties;
    }

    public String getBrowser() {
        return browser;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public String getEmailBody() {
        return emailBody;
    }
}
