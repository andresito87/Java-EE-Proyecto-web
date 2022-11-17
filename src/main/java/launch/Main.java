package launch;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import es.euroformac.javaee.model.News;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

public class Main {

    public static final List<News> NEWS_LIST =
            List.of(new News(1, "President to save Amazon", "Luiz Inacio Lula da Silva becomes the new president of Brazil. ",
                            "On Sunday, he " + "wins the elections. He wins over Jair Bolsonaro.\n" + "\n"
                                    + "Lula is the president between 2003 and 2010. During this time, Brazil cuts deforestation in the "
                                    + "Amazon rainforest " + "by a lot. Deforestation is when people cut down many trees in a large area"
                                    + ".\n" + "\n"
                                    + "This activity is dangerous for the planet. The Amazon is the largest rainforest in the world. It "
                                    + "helps slow down "
                                    + "the warming of the planet. Some countries help Brazil protect the Amazon, for example, Norway and "
                                    + "Germany.\n" + "\n"
                                    + "Bolsonaro is the president in 2019. Deforestation happens a lot. It is the most in the last 15 "
                                    + "years. Now, Lula " + "wants to change the situation. He says that he wants to protect the "
                                    + "rainforest."),
                    new News(2, "Michael Jordan´s shoes sell",
                            "Michael Jordan´s sneakers or shoes sell for 1.47 million dollars at auction",
                            "The shoes are Nike Air Ships. They are the first shoes which sell for more than one million dollars.\n" + "\n"
                                    + "Jordan wears these shoes on November 1, 1984. It is during his first season with the team the "
                                    + "Chicago " + "Bulls. Jordan starts to work together with Nike in the same year.\n" + "\n"
                                    + "Nike is a sportswear company. Jordan has his own clothes and shoes. They are called Air Jordan.\n"
                                    + "\n"
                                    + "Nike hopes that it will make 3 million dollars in four years. Then it makes 126 million dollars in"
                                    + " one " + "year. It is a big success.\n" + "\n"
                                    + "Jordan is the first sports player who works together with Nike. Now, it is normal. Many sports "
                                    + "stars work " + "together with companies. It brings them both a lot of money."),
                    new News(3, "India bridge collapse", "A bridge collapses in India. It is a pedestrian bridge",
                            "A pedestrian bridge " + "is for people to walk. This bridge is above a river.\n" + "\n"
                                    + "People celebrate the Diwali festival. Too many people are on the bridge. The bridge starts to move"
                                    + " from "
                                    + "side to side. Suddenly, it falls.\n" + "\n"
                                    + "141 people die. Many people go missing. Some people swim to the river banks.\n" + "\n"
                                    + "Rescuers search the waters. It is not easy. The river is dark and dirty. Police investigate the "
                                    + "event. "
                                    + "They speak to eight people.\n" + "\n"
                                    + "In the 19th century, workers build the bridge. It is a popular place for tourists. People like the"
                                    + " bridge."
                                    + " It moves when they walk on it."),
                    new News(4, "Attack on Nancy Pelosi’s husband", "Nancy Pelosi is an American politician. She is the House Speaker",
                            "She lives with her husband in their home in San Francisco, California.\n" + "\n"
                                    + "A man breaks a back window in her house. He gets into the house. He wants to meet Nancy Pelosi. "
                                    + "She is not" + " inside. She is in Washington DC.\n" + "\n"
                                    + "The man attacks Nancy’s husband named Paul. He attacks Paul with a hammer. He breaks his head. "
                                    + "Paul just " + "get a surgery.\n" + "\n"
                                    + "The attacker is David DePape. He is 42 years old. Police say that he plans the attack carefully. "
                                    + "He posts " + "conspiracy ideas on social media. Police say he has attempted homicide."),
                    new News(5, "Tragic Korean Halloween festival", "A Halloween festival is in Seoul, South Korea", "People are happy. "
                            + "The event is the first with no coronavirus restrictions. The festival takes place in a popular area. Many "
                            + "clubs and bars are there.\n" + "\n"
                            + "One narrow street becomes full of people. They cannot move. It is nighttime. People can’t see well.\n" + "\n"
                            + "Some people become crazy. They don’t see how serious the situation is. People fall to the ground. Others "
                            + "step on them. 153 people die.\n" + "\n"
                            + "Many of these people are around 20 years old. The disaster is one of the country’s biggest.\n" + "\n"
                            + "On Sunday, South Korea’s president visits the place. A time of national mourning is happening in the "
                            + "country now."));

    public static void main(String[] args) throws Exception {

        String webappDirLocation = "src/main/webapp/"; Tomcat tomcat = new Tomcat();

        //The port that we should run on can be set into an environment variable
        //Look for that variable and default to 8080 if it isn't there.
        String webPort = System.getenv("PORT"); if (webPort == null || webPort.isEmpty()) {
            webPort = "8080";
        }

        tomcat.setPort(Integer.valueOf(webPort));

        StandardContext ctx = (StandardContext) tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());

        // Declare an alternative location for your "WEB-INF/classes" dir
        // Servlet 3.0 annotation will work
        File additionWebInfClasses = new File("target/classes"); WebResourceRoot resources = new StandardRoot(ctx);
        resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes", additionWebInfClasses.getAbsolutePath(), "/"));
        ctx.setResources(resources);

        tomcat.start(); tomcat.getServer().await();
    }
}
