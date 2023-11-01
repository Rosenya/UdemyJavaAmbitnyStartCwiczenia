package ex2;

import ex1.LogToConsoleSLF4J;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class QuerryParameters extends HttpServlet {
//Query parametry - pierwszy sposób na "content negotiation".
//    1. Przeczytać dokumentację ServletRequest (baza dla HttpServletRequest)
//     - Znaleźć metodę pozwalającą pobrać wartość query parametru
//    2. W metodzie doGet sprawdzać query parametr name
//     - Jeśli parametr name jest podany, to komunikat powinien brzmieć "Hello wartość_parametru!",
//       np. "Hello Mistrz!" dla name=Mistrz
//     - W przeciwnym przypadku - "Hello world!"

    private final Logger LOGGER = LoggerFactory.getLogger(QuerryParameters.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }


}
