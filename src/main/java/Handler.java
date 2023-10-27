package server;

import com.sun.net.httpserver.Request;
import java.io.BufferedOutputStream;
import java.io.IOException;

@FunctionalInterface
public interface Handler {
    void handle(Request request, BufferedOutputStream outputStream) throws IOException;
}
