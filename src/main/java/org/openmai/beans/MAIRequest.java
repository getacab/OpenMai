package org.openmai.beans;

import java.io.Serializable;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class MAIRequest implements Serializable {

	private Map<String, String> headers;
	private Map<String, String> cookies;
	private Map<String, String> urlParms;
	private Map<String, String> body;

	
}
