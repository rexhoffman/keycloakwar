package run.jetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.junit.Test;

public class Run {

    private static Server server;

    @Test
    public void setUp() throws Exception { // NOPMD
        server = new Server(0);

        final WebAppContext context = new WebAppContext();
        context.setDescriptor("./src/main/webapp/WEB-INF/web.xml");
        context.setResourceBase("./src/main/webapp");
        context.setContextPath("/");
        context.setParentLoaderPriority(true);

        server.setHandler(context);
        server.start();
        final int serverPort = server.getConnectors()[0].getLocalPort();
        //jetty 9 this code has value in a refactor 
        //final int serverPort = ((ServerConnector)server.getServer().getConnectors()[0]).getLocalPort();
        System.out.println("http://localhost:" + serverPort);
        while (true) {
        }
    }
    
}
