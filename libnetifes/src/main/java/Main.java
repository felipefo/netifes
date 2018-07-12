//
//
//import example.hibernate.model.Veiculo;
//import modelo.persistencia.hibernate.ClienteDAOImpl;
//import java.util.List;
//import modelo.persistencia.hibernate.ClienteDAO;
//
//
//public class Main {    		
//	public static void main(String[] args) throws Exception {                                    
//
//           ClienteDAO veiculoDAO = new ClienteDAOImpl();            
//           Veiculo veiculo = new Veiculo();
//           veiculo.setAno("2010");
//           veiculo.setMarca("Fiat");
//           veiculo.setModelo("Uno");
//           veiculo.setQuilometragem("1000");
//           veiculo.setTipo("carro");              
//           
//           
//           List lista = veiculoDAO.buscaVeiculosApartirDoAno(2009);
//           
//           
//           
//           veiculoDAO.inserir(veiculo);           
//           List<Veiculo> listar = veiculoDAO.listar(Veiculo.class);
//           for(Veiculo printVeiculo : listar){
//               System.out.println(printVeiculo.toString());
//           }
//           
//           veiculoDAO.deletar(veiculo);           
//           listar = veiculoDAO.listar(Veiculo.class);
//           for(Veiculo printVeiculo : listar){
//               System.out.println(printVeiculo.toString());
//           }
//           
//            
//	}                
//}
