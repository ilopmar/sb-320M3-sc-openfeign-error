# Spring Boot 3.2.0-M3 and Open Feign

This repo shows an error with Spring Boot 3.2.0-M3 and Open Feign.

Spring Boot 3.1.4. The application starts and sends a request using the http client:

```shell
git checkout sb-314
mvn spring-boot:run
```

Spring Boot 3.2.0-M3. The application fails when sending the http request.

```shell
git sb-320M3
mvn spring-boot:run
```

Error:

```shell
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::             (v3.2.0-M3)

2023-09-22T16:07:21.763+02:00  INFO 110096 --- [           main] c.e.openfeing.OpenfeingApplication       : Starting OpenfeingApplication using Java 17.0.7 with PID 110096 (/home/ivanlm/workspaces/misc/openfeing/target/classes started by ivanlm in /home/ivanlm/workspaces/misc/openfeing)
2023-09-22T16:07:21.765+02:00  INFO 110096 --- [           main] c.e.openfeing.OpenfeingApplication       : No active profile set, falling back to 1 default profile: "default"
2023-09-22T16:07:21.964+02:00 ERROR 110096 --- [           main] o.s.boot.SpringApplication               : Application run failed

java.lang.IllegalStateException: Error processing condition on org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration.propertySourcesPlaceholderConfigurer
	at org.springframework.boot.autoconfigure.condition.SpringBootCondition.matches(SpringBootCondition.java:60) ~[spring-boot-autoconfigure-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.context.annotation.ConditionEvaluator.shouldSkip(ConditionEvaluator.java:108) ~[spring-context-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsForBeanMethod(ConfigurationClassBeanDefinitionReader.java:183) ~[spring-context-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsForConfigurationClass(ConfigurationClassBeanDefinitionReader.java:144) ~[spring-context-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitions(ConfigurationClassBeanDefinitionReader.java:120) ~[spring-context-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.context.annotation.ConfigurationClassPostProcessor.processConfigBeanDefinitions(ConfigurationClassPostProcessor.java:427) ~[spring-context-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.context.annotation.ConfigurationClassPostProcessor.postProcessBeanDefinitionRegistry(ConfigurationClassPostProcessor.java:288) ~[spring-context-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanDefinitionRegistryPostProcessors(PostProcessorRegistrationDelegate.java:346) ~[spring-context-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(PostProcessorRegistrationDelegate.java:116) ~[spring-context-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:768) ~[spring-context-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:589) ~[spring-context-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:737) ~[spring-boot-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:315) ~[spring-boot-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1309) ~[spring-boot-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1298) ~[spring-boot-3.2.0-M3.jar:3.2.0-M3]
	at com.example.openfeing.OpenfeingApplication.main(OpenfeingApplication.java:13) ~[classes/:na]
Caused by: java.lang.IllegalArgumentException: Invalid value type for attribute 'factoryBeanObjectType': java.lang.String
	at org.springframework.beans.factory.support.FactoryBeanRegistrySupport.getTypeForFactoryBeanFromAttributes(FactoryBeanRegistrySupport.java:86) ~[spring-beans-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.getTypeForFactoryBean(AbstractAutowireCapableBeanFactory.java:838) ~[spring-beans-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.beans.factory.support.AbstractBeanFactory.isTypeMatch(AbstractBeanFactory.java:620) ~[spring-beans-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doGetBeanNamesForType(DefaultListableBeanFactory.java:573) ~[spring-beans-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanNamesForType(DefaultListableBeanFactory.java:532) ~[spring-beans-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.boot.autoconfigure.condition.OnBeanCondition.collectBeanNamesForType(OnBeanCondition.java:246) ~[spring-boot-autoconfigure-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.autoconfigure.condition.OnBeanCondition.getBeanNamesForType(OnBeanCondition.java:239) ~[spring-boot-autoconfigure-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.autoconfigure.condition.OnBeanCondition.getBeanNamesForType(OnBeanCondition.java:229) ~[spring-boot-autoconfigure-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.autoconfigure.condition.OnBeanCondition.getMatchingBeans(OnBeanCondition.java:182) ~[spring-boot-autoconfigure-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.autoconfigure.condition.OnBeanCondition.getMatchOutcome(OnBeanCondition.java:157) ~[spring-boot-autoconfigure-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.autoconfigure.condition.SpringBootCondition.matches(SpringBootCondition.java:47) ~[spring-boot-autoconfigure-3.2.0-M3.jar:3.2.0-M3]
	... 17 common frames omitted

2023-09-22T16:07:21.970+02:00  WARN 110096 --- [           main] o.s.boot.SpringApplication               : Unable to close ApplicationContext

java.lang.IllegalArgumentException: Invalid value type for attribute 'factoryBeanObjectType': java.lang.String
	at org.springframework.beans.factory.support.FactoryBeanRegistrySupport.getTypeForFactoryBeanFromAttributes(FactoryBeanRegistrySupport.java:86) ~[spring-beans-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.getTypeForFactoryBean(AbstractAutowireCapableBeanFactory.java:838) ~[spring-beans-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.beans.factory.support.AbstractBeanFactory.isTypeMatch(AbstractBeanFactory.java:620) ~[spring-beans-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doGetBeanNamesForType(DefaultListableBeanFactory.java:573) ~[spring-beans-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanNamesForType(DefaultListableBeanFactory.java:532) ~[spring-beans-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeansOfType(DefaultListableBeanFactory.java:659) ~[spring-beans-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeansOfType(DefaultListableBeanFactory.java:651) ~[spring-beans-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.context.support.AbstractApplicationContext.getBeansOfType(AbstractApplicationContext.java:1307) ~[spring-context-6.1.0-M5.jar:6.1.0-M5]
	at org.springframework.boot.SpringApplication.getExitCodeFromMappedException(SpringApplication.java:870) ~[spring-boot-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.SpringApplication.getExitCodeFromException(SpringApplication.java:858) ~[spring-boot-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.SpringApplication.handleExitCode(SpringApplication.java:845) ~[spring-boot-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.SpringApplication.handleRunFailure(SpringApplication.java:785) ~[spring-boot-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:328) ~[spring-boot-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1309) ~[spring-boot-3.2.0-M3.jar:3.2.0-M3]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1298) ~[spring-boot-3.2.0-M3.jar:3.2.0-M3]
	at com.example.openfeing.OpenfeingApplication.main(OpenfeingApplication.java:13) ~[classes/:na]
```