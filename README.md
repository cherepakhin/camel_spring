Chapter 2 - Spring Routing Example
----------------

В контексте Spring (beans.xml) определено 3 бина: RussianGreeter, DanishGreeter, EnglishGreeter. В бин GreetMain внедрена зависимость russianGreeter:

````xml
  <bean id="russianGreeter" class="camelinaction.RussianGreeter"/>
  <bean id="danishGreeter" class="camelinaction.DanishGreeter"/>
  <bean id="englishGreeter" class="camelinaction.EnglishGreeter"/>

  <bean id="greetMain" class="camelinaction.GreetMain">
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
$ mvn compile exec:java -Dexec.mainClass=camelinaction.GreetMain
````
