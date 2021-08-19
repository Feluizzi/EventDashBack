package Dashboard.de.eventos.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="itmn_equipamento")

public class Evento {
	
	@Column(name="num_seq")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int numSec;
	
	@Column(name="data_evt", length=50, nullable=false)
	private LocalDate dataEvento;
	
	@ManyToOne
	@JoinColumn(name ="id_alarme")
	private Alarme alarme;
	
	@ManyToOne
	@JoinColumn(name ="id_equip")
	private Equipamento equipamento;

	public int getNumSec() {
		return numSec;
	}

	public void setNumSec(int numSec) {
		this.numSec = numSec;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Alarme getAlarme() {
		return alarme;
	}

	public void setAlarme(Alarme alarme) {
		this.alarme = alarme;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	
}
