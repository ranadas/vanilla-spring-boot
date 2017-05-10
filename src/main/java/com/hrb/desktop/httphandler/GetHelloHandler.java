package com.hrb.desktop.httphandler;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by x148128 on 10/05/2017.
 */
@WebServlet(
        name = "GetHelloHandler",
        urlPatterns = {"/hw"}
)
public class GetHelloHandler extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        ServletOutputStream out = resp.getOutputStream();
        out.write("hello s-boot".getBytes());
        out.flush();
        out.close();
    }
}
