package com.temperatureConvertor.app;

import com.temperatureConvertor.rest.ConvertorRestApplication;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rest")
public class ConvertorApplication extends Application {
    private Set<Object> singletons = new HashSet<>();

    public ConvertorApplication(){
        singletons.add(new ConvertorRestApplication());
    }

    @Override
    public Set<Object> getSingletons(){
        return singletons;
    }
}