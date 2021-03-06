/*
 * Created on Jan 8, 2004
 * 
 */
package is.idega.idegaweb.egov.printing.business;

import is.idega.idegaweb.egov.message.data.PrintMessage;

import java.util.Locale;
import java.util.Map;

import com.idega.idegaweb.IWApplicationContext;
import com.idega.user.data.User;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfWriter;

/**
 * DocumentPrintContext
 * 
 * @author aron
 * @version 1.0
 */
public class DocumentPrintContext {

	private Document document = null;
	private PdfWriter pdfWriter = null;
	private Locale locale = null;
	private PrintMessage msg = null;
	private User user = null;
	private IWApplicationContext iwac = null;
	private Map tagMap = null;

	public DocumentPrintContext() {

	}

	/**
	 * @return Returns the document.
	 */
	public Document getDocument() {
		return this.document;
	}

	/**
	 * @param document
	 *          The document to set.
	 */
	public void setDocument(Document document) {
		this.document = document;
	}

	/**
	 * @return Returns the locale.
	 */
	public Locale getLocale() {
		return this.locale;
	}

	/**
	 * @param locale
	 *          The locale to set.
	 */
	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	/**
	 * @return Returns the msg.
	 */
	public PrintMessage getMessage() {
		return this.msg;
	}

	/**
	 * @param msg
	 *          The msg to set.
	 */
	public void setMessage(PrintMessage msg) {
		this.msg = msg;
	}

	/**
	 * @return Returns the pdfWriter.
	 */
	public PdfWriter getPdfWriter() {
		return this.pdfWriter;
	}

	/**
	 * @param pdfWriter
	 *          The pdfWriter to set.
	 */
	public void setPdfWriter(PdfWriter pdfWriter) {
		this.pdfWriter = pdfWriter;
	}

	/**
	 * @return Returns the user.
	 */
	public User getUser() {
		return this.user;
	}

	/**
	 * @param user
	 *          The user to set.
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return Returns the iwac.
	 */
	public IWApplicationContext getIWApplicationContext() {
		return this.iwac;
	}

	/**
	 * @param iwac
	 *          The iwac to set.
	 */
	public void setIWApplicationContext(IWApplicationContext iwac) {
		this.iwac = iwac;
	}

	/**
	 * @return Returns the tagMap.
	 */
	public Map getTagMap() {
		return this.tagMap;
	}

	/**
	 * @param tagMap
	 *          The tagMap to set.
	 */
	public void setTagMap(Map tagMap) {
		this.tagMap = tagMap;
	}

}
