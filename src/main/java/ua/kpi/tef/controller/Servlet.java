package ua.kpi.tef.controller;

import ua.kpi.tef.controller.workPhoto.DisplayImage;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class Servlet extends HttpServlet{
    private Map<String, Command> commands = new HashMap<>();

    public void init(){
        commands.put("logout", new LogOut());
        commands.put("exception" , new Exception());
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.getWriter().print("Hello from servlet");
        DisplayImage.uplode(request, response);
    }

    public void ProcessRequest(){

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
