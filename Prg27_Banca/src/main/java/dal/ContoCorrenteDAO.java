package dal;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.ContoCorrente;

public class ContoCorrenteDAO {

	private List<ContoCorrente> conti;
	
	{
		this.conti = new ArrayList<ContoCorrente>();
		ClienteDAO cd = new ClienteDAO();
		for (Cliente c : cd.getClienti()) {
			ContoCorrente cc = new ContoCorrente(c);
			this.conti.add(cc);
		}
	}
	
	public List<ContoCorrente> getConti() {
		return conti;
	}
	
	public ContoCorrente getContoById(int numero) {
		for (ContoCorrente contoCorrente : conti) {
			if(contoCorrente.getNumeroConto()== numero) {
				return contoCorrente;
			}
		} 
		return null;
	}
	
	public ContoCorrente getContoByCliente(Cliente c) {
		System.out.println(c);
		for (ContoCorrente contoCorrente : conti) {
			System.out.println(contoCorrente);
			if(contoCorrente.getTitolare().getNome().equals(c.getNome())) {
				return contoCorrente;
			}
		} 
		return null;
	}
	
	
	
}
