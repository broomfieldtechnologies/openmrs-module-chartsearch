/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.chartsearch.solr;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.embedded.EmbeddedSolrServer;

/**
 * Customized Solr administration at a programming level. <br />
 * <br />
 * TODO support more functions if needed in the future
 */
public class SolrManagement {
	
	protected Log log = LogFactory.getLog(getClass());
	
	public void shutdown() {
		SolrServer solrServer = SolrSingleton.getInstance().getServer();
		if (solrServer == null) {
			log.warn("SolrServer is null");
			return;
		}
		if (solrServer instanceof EmbeddedSolrServer)
			solrServer.shutdown();
	}
	
}
