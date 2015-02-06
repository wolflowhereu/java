package com.wolflowhereu;

import com.peterchen.core.jetty.JettyFactory;
import org.eclipse.jetty.server.Server;

import java.io.File;

public class StartServer {

    public static final int PORT = 8080;
    public static final String CONTEXT = "blog";
    public static final String[] TLD_JAR_NAMES = new String[]{"spring-webmvc"};

    public static void main(String[] args) throws Exception {

        System.setProperty("spring.profiles.active", "development");

        System.setProperty("net.sf.ehcache.pool.sizeof.AgentSizeOf.bypass", "true");

        // 启动Jetty
        Server server = JettyFactory.createServerInSource(PORT, CONTEXT);
        JettyFactory.setTldJarNames(server, TLD_JAR_NAMES);

        try {
            server.start();

            System.out.println("[INFO] Server running at http://localhost:" + PORT + File.pathSeparator + CONTEXT);
            System.out.println("[HINT] Hit Enter to reload the application quickly");

            // 等待用户输入回车重载应用.
            while (true) {
                char c = (char) System.in.read();
                if (c == '\n') {
                    JettyFactory.reloadContext(server);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
