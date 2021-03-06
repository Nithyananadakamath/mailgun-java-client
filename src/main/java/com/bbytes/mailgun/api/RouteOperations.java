package com.bbytes.mailgun.api;

import com.bbytes.mailgun.model.MailgunRouteResponse;
import com.bbytes.mailgun.model.MailgunRouteListResponse;

public interface RouteOperations {

	/**
	 * 
	 * @param limit
	 *            Maximum number of records to return. (100 by default)
	 * @param skip
	 *            Number of records to skip. (0 by default)
	 * @return
	 */
	MailgunRouteListResponse getAllRoutes(Integer limit, Integer skip);

	MailgunRouteResponse getRoute(String routeId);

	/**
	 * priority Integer: smaller number indicates higher priority. Higher
	 * priority routes are handled first. Defaults to 0.
	 * 
	 * description Anarbitrary string.
	 * 
	 * expression A filter expression like match_recipient('.*@gmail.com')
	 * 
	 * action: Route action. This action is executed when the expression
	 * evaluates to True. Example: forward("alice@example.com") You can pass
	 * multiple action parameters.
	 * 
	 * @param routeId
	 * @return
	 */
	MailgunRouteResponse createRoute(Integer priority, String description, String expression, String... action);

	MailgunRouteResponse updateRoute(String routeId, Integer priority, String description, String expression, String action);

	void deleteRoute(String routeId);
}
