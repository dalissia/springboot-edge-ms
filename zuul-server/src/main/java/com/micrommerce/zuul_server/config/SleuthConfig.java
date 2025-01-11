package com.micrommerce.zuul_server.config;


import brave.sampler.Sampler;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SleuthConfig {
    // Cela signifie que toutes les requêtes seront tracées.
        public Sampler  defaultSampler(){
            return  Sampler.ALWAYS_SAMPLE;
        }
    }
