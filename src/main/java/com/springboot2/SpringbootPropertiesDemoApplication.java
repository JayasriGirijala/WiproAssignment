package com.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPropertiesDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootPropertiesDemoApplication.class, args);
    }
}
/*
.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/

:: Spring Boot ::                (v3.5.4)

2025-08-04T20:51:49.874+05:30  INFO 21544 --- [springboot2025] [           main] c.s.SpringbootPropertiesDemoApplication  : Starting SpringbootPropertiesDemoApplication using Java 17.0.10 with PID 21544 (D:\springboot2025\target\classes started by girij in D:\springboot2025)
2025-08-04T20:51:49.878+05:30  INFO 21544 --- [springboot2025] [           main] c.s.SpringbootPropertiesDemoApplication  : No active profile set, falling back to 1 default profile: "default"
2025-08-04T20:51:50.818+05:30  INFO 21544 --- [springboot2025] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2025-08-04T20:51:50.836+05:30  INFO 21544 --- [springboot2025] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-08-04T20:51:50.836+05:30  INFO 21544 --- [springboot2025] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.43]
2025-08-04T20:51:50.889+05:30  INFO 21544 --- [springboot2025] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-08-04T20:51:50.891+05:30  INFO 21544 --- [springboot2025] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 957 ms
Integer Value: 9876
Decimal Value: 1.75
Boolean Value: true
2025-08-04T20:51:51.314+05:30  INFO 21544 --- [springboot2025] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2025-08-04T20:51:51.326+05:30  INFO 21544 --- [springboot2025] [           main] c.s.SpringbootPropertiesDemoApplication  : Started SpringbootPropertiesDemoApplication in 1.941 seconds (process running for 2.292)
*/