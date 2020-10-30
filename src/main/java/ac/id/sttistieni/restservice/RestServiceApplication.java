package ac.id.sttistieni.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RestServiceApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication myApp = new SpringApplication(RestServiceApplication.class);
        myApp.setAdditionalProfiles(getOSName());
        myApp.run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RestServiceApplication.class);
    }

    private static String getOSName() {
        String os = System.getProperty("os.name");
        if (os.toLowerCase().contains("win")) {
            return "windows";
        }
        else {
            return "linux";
        }
    }
}
