package com.serviceenabled.dropwizardrequesttracker.com.serviceenabled.dropwizardrequesttracker.it;

import com.serviceenabled.dropwizardrequesttracker.RequestTrackerConstants;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

import static org.mockito.Mockito.mock;

/**
 * Created by rmuhic on 11/11/2014.
 */
@Path("/mock-test")
public class MockTestResource {
    private String requestTrackerId;
    private HttpHeaders headers;

    public String getRequestTrackerId() {
        return requestTrackerId;
    }

    public HttpHeaders getHeaders() {
        return headers;
    }

    @POST
    public void test(@Context HttpHeaders headers){
        this.headers = headers;
        this.requestTrackerId = headers.getRequestHeader(RequestTrackerConstants.DEFAULT_HEADER).get(0);
    }
}
