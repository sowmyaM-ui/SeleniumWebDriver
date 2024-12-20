<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN">
 
	<Properties>
		<Property name="filename">./logs</Property>
	</Properties>
	<Appenders>
		<RollingFile name="file"
			fileName="${filename}/logdemo.Log"
			filePattern="${filename}/logdemo-%d{HH-mm-ss-SSS}.Log">
			<PatternLayout>
				<pattern>%d{HH:mm:ss} [%t] %-5level %logger{36} - %msg%n</pattern>
			</PatternLayout>
			<SizeBasedTriggeringPolicy size="1 KB" />
		</RollingFile>
 
 
		<Console name="Console" target="SYSTEM_OUT">
			<PatternLayout
				pattern="%d{HH:mm:ss:SSS} [%t] %-5level %logger{36} - %msg%n" />
		</Console>
	</Appenders>
	
	
    <Loggers>
        <!-- Unified logger for TestingFrameworkLogger -->
        <Logger name="TestingFrameworkLogger" level="trace" additivity="false">
            <AppenderRef ref="Console"/>
            <AppenderRef ref="file"/>
        </Logger>
 
        <!-- Root logger to capture any uncaptured logs -->
        <Root level="trace">
            <AppenderRef ref="Console"/>
            <AppenderRef ref="file"/>
        </Root>
    </Loggers>
</Configuration>
 