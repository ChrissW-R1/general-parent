package me.chrisswr1.test.webapp;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * {@link HttpServlet}, which merges the request methods GET and POST
 *
 * @version 1.4.0
 * @since 1.0.0
 */
public abstract class BaseServlet
	extends HttpServlet {
	/**
	 * Handles a request. Independent to the method (GET or POST).
	 *
	 * @param request  the {@link HttpServletRequest} from the client
	 * @param response the {@link HttpServletResponse},
	 *                 which will be sent to the client
	 * @throws IOException if any in- or output {@link Exception} occurred
	 * @see BaseServlet#doGet(HttpServletRequest, HttpServletResponse)
	 * @see BaseServlet#doPost(HttpServletRequest, HttpServletResponse)
	 * @since 1.0.0
	 */
	protected abstract void doRequest(
		HttpServletRequest request,
		HttpServletResponse response
	)
	throws IOException;

	@Override
	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	)
	throws IOException {
		this.doRequest(request, response);
	}

	@Override
	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response
	)
	throws IOException {
		this.doRequest(request, response);
	}
}
