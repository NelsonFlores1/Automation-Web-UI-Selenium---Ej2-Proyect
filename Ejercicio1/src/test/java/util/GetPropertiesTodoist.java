package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetPropertiesTodoist {
    private static GetPropertiesTodoist getPropertiesTodoist = new GetPropertiesTodoist();

    private String browser;
    private String host;
    private String user;
    private String password;
    private String nameProject;
    private String nameProjectUpdated;
    private String nameTask;
    private String descriptionTask;
    private String nametaskUpdated;

    private GetPropertiesTodoist(){
        Properties properties = new Properties();
        String nameFile = "todoist.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(nameFile);
        if(inputStream != null){
            try {
                properties.load(inputStream);
                browser = properties.getProperty("browser");
                host = properties.getProperty("host");
                user = properties.getProperty("user");
                password = properties.getProperty("password");
                nameProject = properties.getProperty("nameProject");
                nameProjectUpdated = properties.getProperty("nameProjectUpdated");
                nameTask = properties.getProperty("nameTask");
                descriptionTask = properties.getProperty("descriptionTask");
                nametaskUpdated = properties.getProperty("nametaskUpdated");
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static GetPropertiesTodoist getInstance(){
        if(getPropertiesTodoist == null)
            getPropertiesTodoist = new GetPropertiesTodoist();
        return getPropertiesTodoist;
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

    public String getPassword() {
        return password;
    }

    public String getNameProject() {
        return nameProject;
    }

    public String getNameProjectUpdated() {
        return nameProjectUpdated;
    }

    public String getNameTask() {
        return nameTask;
    }

    public String getDescriptionTask() {
        return descriptionTask;
    }

    public String getNametaskUpdated() {
        return nametaskUpdated;
    }
}
