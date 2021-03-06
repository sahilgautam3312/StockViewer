/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asethy
 */
public class AddStock extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Stock Viewer</title>");   
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"home.css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class = 'profile'>Stock Viewer</div>\n" +
"        <div class = 'topmenu'>\n" +
"            <a href='home.html'>Top Performing Stocks</a>\n" +
"            <a href='AddStock.view'>Add Stock</a>\n" +
"            <a href='DeleteStock.view'>Delete Stock</a>\n" +
"            <a href='ModifyStock.view'>Modify Stock</a>\n" +
"            <a href='Historical.view'>Historical Data</a>\n" +
"            <a href='Search.view'>Search Stocks</a>\n" +
"        </div>");
            out.println("<h1>Add Stock Info</h1>");
            out.println("<center><form action=\"add.control\">\n" +
"            <table>\n" +
"                <tr><th colspan=\"2\">Add Stock</th></tr>\n" +
"                <tr><td>Symbol: </td><td><input type = \"text\" name=\"symbol\"></td></tr>\n" +
"                <tr><td>Opening Bid: </td><td><input type = \"text\" name=\"open\"></td></tr>\n" +
"                <tr><td>Closing Bid: </td><td><input type = \"text\" name=\"close\"></td></tr>\n" +
"                <tr><td>Lowest Price: </td><td><input type = \"text\" name=\"low\"></td></tr>\n" +
"                <tr><td>Highest Bid: </td><td><input type = \"text\" name=\"high\"></td></tr>\n" +
"                <tr><td>Volume: </td><td><input type = \"text\" name=\"volume\"></td></tr>\n" +
"                <tr>\n" +
"                    <td><center><input type = \"submit\" value=\"Validate\"></center></td>\n" +
"                    <td><center><input type = \"submit\" value=\"Add\"></center></td>\n" +
"                </tr>\n" +
"            </table>\n" +
"        </form></center>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
