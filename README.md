Camel and Spring Routing Example (Chapter 2)
----------------

Пример из книги "Camel in action" Spring+Camel.<br/> 
В контексте Spring (beans.xml) определено 3 бина: RussianGreeter, DanishGreeter, EnglishGreeter. В бин GreetMain внедрена зависимость russianGreeter:

````xml

<bean id="russianGreeter" class="ru.perm.v.camelinaction.ch2.RussianGreeter"/>
<bean id="danishGreeter" class="ru.perm.v.camelinaction.ch2.DanishGreeter"/>
<bean id="englishGreeter" class="ru.perm.v.camelinaction.ch2.EnglishGreeter"/>

<bean id="greetMain" class="ru.perm.v.camelinaction.ch2.GreetMain">
<property name="greeter" ref="russianGreeter"/>
</bean>
````

GreetMain САМОСТОЯТЕЛЬНО подгружает Spring контекст(ApplicationContext) ИЗ __bean.xml__ и использует __bean__ из него:  

````shell
public class GreetMain {

    private Greeter greeter;

    public void setGreeter(Greeter greeter) {
        this.greeter = greeter;
    }
    
    public void execute() {
        System.out.println(greeter.sayHello());        
    }
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        GreetMain bean = (GreetMain) context.getBean("GreetMain");
        bean.execute();
    }
}
````

Запуск:

````shell
$ mvn compile exec:java -Dexec.mainClass=ru.perm.v.camelinaction.ch2.GreetMain
````

### Сборка исполняемого jar:

````shell
$ mvn package
````

Запуск:
````shell
/usr/lib/jvm/openjdk-17/bin/java -cp target/camel-spring-0.0.1-jar-with-dependencies.jar ru.perm.v.camelinaction.ch2.GreetMain
````

Примечания:

Удален WARNING "172 [main] WARN org.springframework.beans.factory.xml.ResourceEntityResolver - DTD/XSD XML entity [http://www.springframework.org/schema/beans/spring-beans.xsd] not found, falling back to remote https resolution". Исправлен заголовок файла beans.xml.

````shell
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN//EN" "http://www.springframework.org/dtd/spring-beans.dtd">
````