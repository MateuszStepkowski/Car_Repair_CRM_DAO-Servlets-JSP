package controller.vehicle;

import entity.dao.VehicleDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "VehicleDeleteController", urlPatterns = "/vehicle/delete")
public class VehicleDeleteController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("vehicleID"));
            VehicleDao.delete(id);
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect(request.getHeader("referer"));
        
    }
}
