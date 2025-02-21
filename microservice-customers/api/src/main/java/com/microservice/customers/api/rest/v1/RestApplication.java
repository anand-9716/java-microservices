package com.microservice.customers.api.rest.v1;

import com.microservice.customers.api.rest.v1.filters.AuthFilter;
import com.microservice.customers.api.rest.v1.filters.CorsFilter;
import com.microservice.customers.api.rest.v1.filters.LoggerInterceptor;
import com.microservice.customers.api.rest.v1.mappers.EmptyPayloadMapper;
import com.microservice.customers.api.rest.v1.mappers.ResourceNotFoundMapper;
import com.microservice.customers.api.rest.v1.providers.JacksonProvider;
import com.microservice.customers.api.rest.v1.resources.CustomerResource;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.jsonp.JsonProcessingFeature;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/v1")
public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        Set<Class<?>> classes = new HashSet<>();

        classes.add(JacksonJsonProvider.class);

        classes.add(JacksonProvider.class);

        classes.add(CustomerResource.class);

        classes.add(EmptyPayloadMapper.class);
        classes.add(ResourceNotFoundMapper.class);

        classes.add(AuthFilter.class);
        classes.add(CorsFilter.class);
        classes.add(LoggerInterceptor.class);

        return classes;
    }
}
