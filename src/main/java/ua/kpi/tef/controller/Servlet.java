package ua.kpi.tef.controller;

import ua.kpi.tef.controller.command.Back;
import ua.kpi.tef.controller.command.Command;
import ua.kpi.tef.controller.command.DisplayImage;
import ua.kpi.tef.model.Photos;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet")
public class Servlet extends HttpServlet{
    private Map<String, Command> commands = new HashMap<>();
    private DisplayImage display = new DisplayImage();
    private Photos photos = new Photos();

    public Servlet() throws IOException {
    }

    public void init(){
        try {
            commands.put("display", new DisplayImage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        commands.put("back", new Back());
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.getWriter().print("Hello from servlet");
       launch(request, response);
        //processRequest(request, response);
    }

    public void launch(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("image/jpeg");
        request.setAttribute("photos", photos);
        request.getRequestDispatcher("success.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
        //processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getRequestURI();
        System.out.println(path);
        path = path.replaceAll(".*/app/" , "");
        System.out.println(path);
        Command command = commands.getOrDefault(path , (req, res)->"/index.jsp)");
        String page = command.execute(request, response);
        if(page.contains("redirect")){
            response.sendRedirect(page.replace("redirect:", "/"));
        }else {
            request.getRequestDispatcher(page).forward(request, response);
        }
    }

}
/*
public class Servlet extends HttpServlet {
    private static String main = "index.jsp";
    private static String authorized = "success.jsp";
    private static String LOGIN = "login";
    private static String NAME = "name";
    private static String ERROR_MESSAGE = "error_msg";


    private Model model;

    private InputNote inputNote;

    private String errorMessage;
    private boolean success = false;

    @Override
    public void init() {
        this.model = new Model();
        this.inputNote = new InputNote();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(success){
            request.setAttribute(LOGIN, model.getNotebook().getLogin());
            request.setAttribute(NAME, model.getNotebook().getName());
            request.getRequestDispatcher(authorized).forward(request,response);
        } else {
            request.setAttribute(ERROR_MESSAGE,errorMessage);
            request.getRequestDispatcher(main).forward(request, response);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        request.setCharacterEncoding("UTF-8");

        String login = request.getParameter(LOGIN);
        String name = request.getParameter(NAME);

        inputNote.setInputData(login, name);
        inputNote.inputNotebook();
        process(request, response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        if(!inputNote.isCorrect()){
            errorMessage = inputNote.getErrors().get(inputNote.getErrors().size() - 1);
        } else {
            try{
                model.initNote(inputNote.getNote());
            } catch (DB_Exception e){
                errorMessage = Messages.ALREADY_EXISTS_ERROR;
                doGet(request, response);
                return;
            }
            success = true;
            doGet(request, response);
        }
    }
}
*/
