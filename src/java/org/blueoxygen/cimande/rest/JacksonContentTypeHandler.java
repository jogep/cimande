/**
 * JacksonContentTypeHandler.java
 *
 * Created on 25 Jan 2011 23:39:10
 */
package org.blueoxygen.cimande.rest;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

import org.apache.struts2.rest.handler.ContentTypeHandler;
import org.codehaus.jackson.JsonGenerator.Feature;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author Dian Aditya
 *
 */
public class JacksonContentTypeHandler implements ContentTypeHandler {

	public String fromObject(Object object, String resultCode, Writer writer)
			throws IOException {

		new ObjectMapper().configure(Feature.QUOTE_FIELD_NAMES, false).writeValue(writer, object);

		return null;
	}

	public String getContentType() {
		return "application/json";
	}

	public String getExtension() {
		return "jackson";
	}

	public void toObject(Reader reader, Object object) throws IOException {
		// Do nothing
	}

}
