package eu.europa.esig.dss.validation.process.vpfswatsp;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

import eu.europa.esig.dss.diagnostic.jaxb.XmlTimestampedObject;
import eu.europa.esig.dss.enumerations.TimestampType;

/**
 * The class compares two {@code POE} instances, by its production time, origin and covered context
 * 
 * The class returns the following values:
 * -1 if the poe1 is preferred over poe2
 * 0 of the POEs are equal
 * 1 if the poe2 is preferred over poe1
 *
 */
public class POEComparator implements Comparator<POE>, Serializable {

	private static final long serialVersionUID = -4256501779628944917L;

	@Override
	public int compare(POE poe1, POE poe2) {
		
		int result = poe1.getTime().compareTo(poe2.getTime());
		
		if (result == 0) {
			// POE defined by a timestamp is preferred over a POE defined by a control time
			if (poe1.isTimestampPoe() && !poe2.isTimestampPoe()) {
				result = -1;
			} else if (!poe1.isTimestampPoe() && poe2.isTimestampPoe()) {
				result = 1;
			}
		}
		
		if (result == 0) {
			TimestampType poe1TstType = poe1.getTimestampType();
			TimestampType poe2TstType = poe2.getTimestampType();
			if (poe1TstType != null && poe2TstType != null) {
				result = poe1TstType.compare(poe2TstType);
			}
		}
		
		if (result == 0) {
			List<XmlTimestampedObject> poe1References = poe1.getTimestampedObjects();
			List<XmlTimestampedObject> poe2References = poe2.getTimestampedObjects();
			if (poe1References != null && poe2References != null) {
				if (poe1References.size() < poe2References.size()) {
					result = -1;
				} else if (poe1References.size() > poe2References.size()) {
					result = 1;
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Checks if the {@code poeOne} is before the {@code poetwo}
	 * 
	 * @param poeOne {@link POE} to check if it is before the {@code poeTwo}
	 * @param poeTwo {@link POE} to compare with
	 * @return TRUE if the {@code poeOne} is before {@code poeTwo}, FALSE otherwise
	 */
	public boolean before(POE poeOne, POE poeTwo) {
		return compare(poeOne, poeTwo) == -1;
	}

}
