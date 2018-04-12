package ua.kpi.tef.controller.command;
import com.sun.scenario.Settings;
import ua.kpi.tef.controller.command.Command;
import ua.kpi.tef.model.Photos;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayImage extends HttpServlet implements Command {
    public Photos getPhotos() {
        return photos;
    }

    Photos photos = new Photos();

    public DisplayImage() throws IOException {
    }

    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        Map paramMap = request.getParameterMap();

        return "/index.jsp";
    }

    public void contextInitialized(ServletContextEvent event) {
        event.getServletContext().setAttribute("countries", photos.getPhotosLayout());
    }

    /*public String execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String filename = "C:/Flash/p.jpg";
        File imageFile = new File(filename);
        BufferedImage image = ImageIO.read(imageFile);
        ImageIO.write(image, "image/png", response.getOutputStream());
        return filename;
        // TODO download file by address in system
    }*/
}
    /* @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("image/jpeg");
        ServletOutputStream out;
        out = response.getOutputStream();
        FileInputStream fin = new FileInputStream("c:\\Flash\\p.jpg");

        BufferedInputStream bin = new BufferedInputStream(fin);
        BufferedOutputStream bout = new BufferedOutputStream(out);
        int ch = 0;
        while((ch=bin.read())!= -1)
        {
            bout.write(ch);
        }

        bin.close();
        fin.close();
        bout.close();
        out.close();
    }*/