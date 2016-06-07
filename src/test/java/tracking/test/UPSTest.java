package tracking.test;

import tracking.ups.*;
import tracking.utils.XmlHttpUtil;

public class UPSTest {

	public static void main(String[] args) {
		AccessRequest accessRequest = new AccessRequest();
		accessRequest.setAccessLicenseNumber("XXX");//access license number
		accessRequest.setUserId("XXX");//username
		accessRequest.setPassword("XXX");//password

		TrackRequest trackRequest = new TrackRequest();
		trackRequest.setTrackingNumber("XXX");//track number
		Request request = new Request();
		request.setRequestAction("Track");
		request.getRequestOption().add("activity");
		TransactionReference transactionReference = new TransactionReference();
		transactionReference.setCustomerContext("track");
		transactionReference.setXpciVersion("1.0");
		request.setTransactionReference(transactionReference);
		trackRequest.setRequest(request);

		TrackResponse s = XmlHttpUtil.post(new Object[] { accessRequest, trackRequest }, "https://wwwcie.ups.com/ups.app/xml/Track", TrackResponse.class);
		
		System.out.println(s.getShipment().get(0).getPackage().get(0).getActivity().get(0).getActivityLocation().getAddress().getCity());
	}
}
