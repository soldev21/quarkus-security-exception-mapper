package org.acme;

import io.quarkus.arc.Priority;
import io.quarkus.security.AuthenticationCompletionException;

import javax.ws.rs.Priorities;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
@Priority(Priorities.AUTHENTICATION)
public class AuthenticationCompletionExceptionMapper implements ExceptionMapper<AuthenticationCompletionException> {
    @Override
    public Response toResponse(AuthenticationCompletionException e) {
        System.out.println("Exception");
        return Response.status(404).build();
    }
}
