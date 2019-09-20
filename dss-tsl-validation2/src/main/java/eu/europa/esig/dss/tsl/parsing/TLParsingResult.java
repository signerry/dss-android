package eu.europa.esig.dss.tsl.parsing;

import java.util.List;

import eu.europa.esig.dss.tsl.dto.TrustServiceProvider;

public class TLParsingResult extends AbstractParsingResult {

	private List<TrustServiceProvider> trustServiceProviders;

	public List<TrustServiceProvider> getTrustServiceProviders() {
		return trustServiceProviders;
	}

	public void setTrustServiceProviders(List<TrustServiceProvider> trustServiceProviders) {
		this.trustServiceProviders = trustServiceProviders;
	}

}
