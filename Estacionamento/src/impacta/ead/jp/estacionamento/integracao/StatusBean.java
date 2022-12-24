package impacta.ead.jp.estacionamento.integracao;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatusBean {

	@XmlElement
	private int vagasLibres;

	@XmlElement
	private int vagasOcupadas;

	@XmlElement
	private double faturamentoDia;

	public StatusBean() {
	}

	public StatusBean(int vagasLibres, int vagasOcupadas, double faturamento) {
		this.vagasLibres = vagasLibres;
		this.vagasOcupadas = vagasOcupadas;
		this.faturamentoDia = faturamento;
	}

	/*
	 * CRIAR APENAS OS GETTER PORQUE OS VALORES SERÃO INJETADOS PELO CONSTRUTOR
	 */
	
	public int getVagasLibres() {
		return vagasLibres;
	}

	public int getVagasOcupadas() {
		return vagasOcupadas;
	}

	public double getFaturamentoDia() {
		System.out.println("Qual meu valor: " + faturamentoDia);
		return faturamentoDia;
	}


}
