package Dashboard.de.eventos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="itmn_equipamento")

public class Equipamento {
	
	@Column(name="id_equip")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="hostname", length=50, nullable=false)
	private String hostname;
	
	@Column(name="ipaddr", length=15, nullable=false)
	private String IpAddr;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getIpAddr() {
		return IpAddr;
	}

	public void setIpAddr(String ipAddr) {
		IpAddr = ipAddr;
	}
	
	
}
