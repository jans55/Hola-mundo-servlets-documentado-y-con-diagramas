/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
AUTORES: Aguilar Báez Javier Alejandro y Martínez Barbosa Genaro Enrique (C) Agosto 2017
VERSIÓN: 1.0 

DESCRIPCIÓN: Nuestro primer Hola Mundo, utilizando la tecnología web para Java de los Servlets.


COMPILACIÓN: se compila en tiempo de ejecucion. 
EJECUCIÓN: se ejecuta haciendo clic derecho y seleccionando Run File.
*/

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aguilar Báez Javier Alejandro y Martínez Barbosa Genaro Enrique (C) Agosto 2017
 * @version 1.0
 * created on 2017-08-29
 */
@WebServlet(urlPatterns = {"/holam"})
public class holam extends HttpServlet {

    /**
     * Ejecuta peticiones tanto para obtener (Get) como para subir (Post) información. 
     * En este caso, se ejecuta únicamente el doGet, en lugar del processRequest.
     * 
     * @param request La petición del servlet.
     * @param response La respuesta del servlet.
     * @throws ServletException Lanza una excepción de Servlet por si ocurre un error.
     * @throws IOException Lanza una excepción por si ocurre un error en la IO.
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet holam</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>hola mundo" + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
    /**
     * Ejecuta peticiones únicamente para obtener (Get) información. 
     * Éste se ejecuta en lugar del processRequest.
     * 
     * @param request La petición del servlet.
     * @param res La respuesta del servlet.
     * @throws ServletException Lanza una excepción de Servlet por si ocurre un error.
     * @throws IOException Lanza una excepción por si ocurre un error en la IO.
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = new PrintWriter(res.getOutputStream());
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hola Mundo Servlet</title></head>");
        out.println("<style> p{background: #3399FF; color:red;}");
        out.println("div {width: 100%; height: 100%; background: lightgreen;} </style>");
        out.println("<body>");
        out.println("<div> <h1> <center> <p> <marquee> Hola   Mundo   desde   un   Servlet </marquee> </p> </center> </h1> </div>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    /**
     * Ejecuta peticiones únicamente para subir (Post) información. 
     * En este caso, no se ejecuta este método.
     * 
     * @param request La petición del servlet.
     * @param response La respuesta del servlet.
     * @throws ServletException Lanza una excepción de Servlet por si ocurre un error.
     * @throws IOException Lanza una excepción por si ocurre un error en la IO.
     */ 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Sólo regresa una breve descripción del funcionamiento del Servlet.
     *
     * @return Regresa una cadena con esa descripción.
     */
    @Override
    public String getServletInfo() {
        return "Crea   una   página   HTML   que   dice   Hola Mundo";
    }// </editor-fold>

}
