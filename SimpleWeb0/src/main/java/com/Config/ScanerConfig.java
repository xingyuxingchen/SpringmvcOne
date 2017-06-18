package com.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.Controller","com.Service","com.Dao"})
public class ScanerConfig {

}
