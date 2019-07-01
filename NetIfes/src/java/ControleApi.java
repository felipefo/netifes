

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import aplicacao.FabricaDeControle;
import aplicacao.FabricaDeControle.EstretegiaPersistencia;
import aplicacao.IControle;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import dominio.fabrica.FabricaDeModelo;


public class ControleApi extends HttpServlet {
        
    private IControle controle = null; 
    private String modelo = null;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        try {                        
            //descobre qual o controle deve responder a requisicao
            initHanlder(request);
            //handler do verbo POST
            if(request.getMethod().equalsIgnoreCase("POST")){
                //adaptando o resquest mapa do tipo <String,String[]> para <String,String>
                ParameterAdapter parameterAdapter = new ParameterAdapter(request.getParameterMap());
                FabricaDeModelo fabricaModelo = new FabricaDeModelo(parameterAdapter);                                
                Object novoModelo =  fabricaModelo.getModelo(this.modelo);
                this.controle.inserir(novoModelo);                
            } //handler do verbo GET ALL
            else if (request.getMethod().equalsIgnoreCase("GET")){
                //respondendo ao listar todos os itens.
                if(request.getParameterMap().isEmpty()){
                    try {                                            
                        String json = this.controle.pegarTodos();
                        out.println(json);
                    } catch (Exception ex) {
                        Logger.getLogger(ControleApi.class.getName()).log(Level.SEVERE, null, ex);
                        ex.printStackTrace();
                    }
                }
            }            
        } catch (Exception ex) {
            Logger.getLogger(ControleApi.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }
    }

    /*
       Recebe o path da requisicao pra descobrir qual controlador deve 
       responder a requiscao solicitada. 
    */
    private void  initHanlder(HttpServletRequest request){        
       String path = request.getRequestURI().substring(request.getContextPath().length());
       this.modelo = path.replace("/", "");
       FabricaDeControle fabrica = new FabricaDeControle();
       fabrica.setEstrategia(EstretegiaPersistencia.HIBERNATE);
       this.controle  = fabrica.getControle(modelo);       
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        processRequest(request, response);
    }

 
    @Override
    public String getServletInfo() {
        return "Servlet Recebe Dados";
    }// </editor-fold>

}
