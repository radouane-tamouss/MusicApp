/**
 * 
 */
package com.music;

/**
 * @author radouane, anwar, ayoub
 *
 */
public class Song{

	String titre;
	double dur�e;
	/**
	 * @param titre;
	 * @param dur�e
	 */
	public Song(String titre, double dur�e) {
		this.titre = titre;
		this.dur�e = dur�e;
	}
	
	/**
	 * @return the title
	 */
	public String getTitre() {
		return titre;
	}
	/**
	 * @param titre the title to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	/**
	 * @return the duration
	 */
	public double getDur�e() {
		return dur�e;
	}
	/**
	 * @param dur�e the duration to set
	 */
	public void setDur�e(double dur�e) {
		this.dur�e = dur�e;
	}

	@Override
	public String toString() {
		return "song [titre=" + titre + ", dur�e=" + dur�e + "]";
	}
}
