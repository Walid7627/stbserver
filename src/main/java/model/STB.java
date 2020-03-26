package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "STB")
@XmlAccessorType(XmlAccessType.NONE)
public class STB implements Serializable{
	private static final long serialVersionUID = 1L;

	@XmlAttribute
	private Integer version;

	@XmlElement
	private String title;

	@XmlElement
	private String date;

	@XmlElement
	private String descr;

	public STB(String title, int version, String date, String descr) {
		super();
		this.title = title;
		this.version = version;
		this.date = date;
		this.descr = descr;
	}

	public STB() {
	}
	@Override public String toString() {
		return ("STB [Title=" + title + ",Version=" + version
				+ ",Date=" + date + ",Description=" + descr + "]");
	}

}
