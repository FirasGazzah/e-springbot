package com.example.app.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class CmdPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idProduit;
	private int idCmd;
	
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public int getIdCmd() {
		return idCmd;
	}
	public void setIdCmd(int idCmd) {
		this.idCmd = idCmd;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCmd;
		result = prime * result + idProduit;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CmdPK other = (CmdPK) obj;
		if (idCmd != other.idCmd)
			return false;
		if (idProduit != other.idProduit)
			return false;
		return true;
	}
	
	

}

	