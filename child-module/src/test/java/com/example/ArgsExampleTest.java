package test.java.com.example;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.io.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArgsExampleTest {

    @Test
    public void simpleTest() throws IOException, URISyntaxException {
        Path myPath = FileSystems.getDefault().getPath("src/test/resources/", "empty.txt");
        System.out.println(myPath);
        InputStream resURL = getClass().getClassLoader().getResourceAsStream("empty.txt");
        System.out.println(resURL);
        assertThat("hello").isEqualTo("hello");
    }
}