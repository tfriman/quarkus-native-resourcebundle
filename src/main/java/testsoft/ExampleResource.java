package testsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Locale;
import java.util.ResourceBundle;

@Path("/")
public class ExampleResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleResource.class);

    @GET
    @Path("/{lang}")
    @Produces(MediaType.TEXT_PLAIN)
    public String get(@PathParam("lang") String lang) {
        ResourceBundle testbundle = ResourceBundle.getBundle("testbundle", new Locale(lang));
        LOGGER.info("get({}) using bundle: {}", lang, testbundle);
        return testbundle.getString("testkey");
    }
}