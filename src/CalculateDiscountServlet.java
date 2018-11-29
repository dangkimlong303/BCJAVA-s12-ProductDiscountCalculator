import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscountServlet", urlPatterns = "/calculate")
public class CalculateDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        String price = request.getParameter("price");
        String discount = request.getParameter("discount");

        double discountAmount = Double.parseDouble(price) * Double.parseDouble(discount) / 100;
        double discountPrice = Double.parseDouble(price) - discountAmount;
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("Product Description: " + description + "<br>");
        writer.println("Price: " + price + "<$br>");
        writer.println("Discount Percent: " + discount + "%<br>");
        writer.println("Discount Amount: " + discountAmount + "$<br>");
        writer.println("Discount Price: " + discountPrice + "$<br>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
