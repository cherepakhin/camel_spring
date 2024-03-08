Различные способы задания конфигурации Spring Beans
----------------

1. [С помощью xml-файла resources/beans.xml](#xml_file)
2. [С помощью @Configuration и @Bean в conf/SimpleJavaConfig](#configuration)

<a id="xml_file"></a>
__С помощью xml-файла resources/beans.xml.__

С помощью xml-файла

Определение resources/beans.xml:

````xml

<bean id="russianGreeter" class="ru.perm.v.camelinaction.ch2.greeters.RussianGreeter"/>
<bean id="danishGreeter" class="ru.perm.v.camelinaction.ch2.greeters.DanishGreeter"/>
<bean id="englishGreeter" class="ru.perm.v.camelinaction.ch2.greeters.EnglishGreeter"/>

<bean id="greetMain" class="ru.perm.v.camelinaction.ch2.GreetMainApplication">
<property name="greeter" ref="russianGreeter"/>
</bean>
````

Импорт в проект:

````java
@Configuration
@ImportResource({"classpath*:beans.xml"})
public class BeansConfiguration {
}
````

Или можно так подгрузить и получить bean :

````java
@SpringBootApplication
public class GreetMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetMainApplication.class, args);
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        GreeterService greeterService =
                (GreeterService) context.getBean("selectedGreeterService");
        System.out.println(greeterService.getHello()); // Hello, vasi!
    }
}
````

или как обычно:

````java
@RestController
@RequestMapping("/greet")
public class GreeterRest {

    /**
     * inject from beans.xml property <property name="greeter" ref="russianGreeter"/>
     */
    @Autowired
    GreeterService selectedGreeterService;
````

Запуск:

````shell
$ mvn compile exec:java -Dexec.mainClass=ru.perm.v.camelinaction.ch2.GreetMainApplication
````

<a id="configuration"></a>
__С помощью @Configuration и @Bean в conf/SimpleJavaConfig.__ 

С помощью @Configuration и @Bean. Показано в conf/SimpleJavaConfig:

````java
@Configuration
public class SimpleJavaConfig {
    @Bean
    public String beanOneFromSimpleJavaConfig() {
    return "beanOne";
    }

    @Bean
    public String beanTwoFromSimpleJavaConfig() {
        return "beanTwo";
    }
}
````

Использование в ru.perm.v.camelinaction.ch2.SimpleJavaConfigRest.java как обычно:

````java
@RestController
@RequestMapping("/simple_conf")
public class SimpleJavaConfigRest {
@Autowired
String beanOneFromSimpleJavaConfig;

    @Autowired
    String beanTwoFromSimpleJavaConfig;

    ....
````

### Сборка исполняемого jar:

````shell
$ mvn package
````

Запуск:
````shell
/usr/lib/jvm/openjdk-17/bin/java -cp target/camel-spring-0.0.1-jar-with-dependencies.jar ru.perm.v.camelinaction.ch2.GreetMainApplication
````

### Примечания:

Удален WARNING "172 [main] WARN org.springframework.beans.factory.xml.ResourceEntityResolver - DTD/XSD XML entity [http://www.springframework.org/schema/beans/spring-beans.xsd] not found, falling back to remote https resolution". Исправлен заголовок файла beans.xml.

````shell
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN//EN" "http://www.springframework.org/dtd/spring-beans.dtd">
````

Исправление ошибки: 
An exception occured while executing the Java class. Line 15 in XML document from class path resource [beans.xml] is invalid: Attribute "xmlns" must be declared for element type "beans".

Удален заголовок "<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN//EN" "http://www.springframework.org/dtd/spring-beans.dtd">"

Демо простой конфигурации Spring ru.perm.v.camelinaction.ch2.conf.SimpleJavaConf:

````java
@Configuration
public class SimpleJavaConfig {
    @Bean
    public String beanOneFromSimpleJavaConfig() {
        return "beanOne";
    }

    @Bean
    public String beanTwoFromSimpleJavaConfig() {
        return "beanTwo";
    }
}
````