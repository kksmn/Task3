import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repository.MovieRepository;
import service.MovieReport;

public class App {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        MovieRepository movieRepository=context.getBean(MovieRepository.class);
        MovieReport movieReport=new MovieReport(movieRepository);
        movieReport.generate();
    }

}
