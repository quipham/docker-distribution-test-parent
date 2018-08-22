package runner;

import feign.example.github.GitHubExample;
import feign.manage.ExecutionListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

@Listeners(ExecutionListener.class)
public class SampleTest {

  /*  @Test
    public void shouldGetGitHubContributor() {
        GitHubExample.GitHub github = GitHubExample.GitHub.connect();

        String active_env = System.getenv("TEST_SUITE_EXECUTION");
        System.out.println(active_env);

        System.out.println("Let's fetch and print a list of the contributors to this org.");
        List<String> contributors = github.contributors("netflix");
        for (String contributor : contributors) {
            System.out.println(contributor);
        }

        System.out.println("Now, let's cause an error.");
        try {
            github.contributors("netflix", "some-unknown-project");
        } catch (GitHubExample.GitHubClientError e) {
            System.out.println(e.getMessage());
        }
    }*/

    @Test(description = "Duck man")
    public void login() {

    }

    @Test(description = "An chicken", dependsOnMethods = "login")
    public void search() {

    }

    @Test(description = "Penis Nguyen", dependsOnMethods = "search")
    public void select() {

    }

    @Test(description = "Qui pro", dependsOnMethods = "select")
    public void book() {

    }

    @Test(description = "logout", dependsOnMethods = "book")
    public void logout() {

    }

    @Test(description = "false")
    public void falseTest() {
        assertTrue(false);
    }
}
