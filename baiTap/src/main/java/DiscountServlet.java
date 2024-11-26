import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = {"/display-discount"})
public class DiscountServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy dữ liệu từ biểu mẫu
        String description = request.getParameter("description");
        String listPriceString = request.getParameter("listPrice");
        String discountPercentString = request.getParameter("discountPercent");

        // Phân tích các giá trị số
        double listPrice = Double.parseDouble(listPriceString);
        double discountPercent = Double.parseDouble(discountPercentString);

        // Tính chiết khấu
        double discountAmount = listPrice * discountPercent * 0.01;
        double discountPrice = listPrice - discountAmount;

        // Tạo phản hồi
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Discount Result</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Discount Calculation Result</h1>");
            out.println("<p>Product Description: " + description + "</p>");
            out.println("<p>List Price: $" + listPrice + "</p>");
            out.println("<p>Discount Percent: " + discountPercent + "%</p>");
            out.println("<p>Discount Amount: $" + discountAmount + "</p>");
            out.println("<p>Discount Price: $" + discountPrice + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}