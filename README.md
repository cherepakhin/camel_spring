Chapter 2 - Spring Routing Example
----------------

В контексте Spring (beans.xml) определено 3 бина: RussianGreeter, DanishGreeter, EnglishGreeter. В бин GreetMeBean внедрена зависимость russianGreeter:

````xml
  <bean id="russianGreeter" class="camelinaction.RussianGreeter"/>
  <bean id="danishGreeter" class="camelinaction.DanishGreeter"/>
  <bean id="englishGreeter" class="camelinaction.EnglishGreeter"/>

  <bean id="greetMeBean" class="camelinaction.GreetMeBean">
    <property name="greeter" ref="russianGreeter"/>
  </bean>
````

GreetMeBean САМОСТОЯТЕЛЬНО подгружает Spring контекст(ApplicationContext) ИЗ __bean.xml__ и использует __bean__ из него:  

````shell
public class GreetMeBean {

    private Greeter greeter;

    public void setGreeter(Greeter greeter) {
        this.greeter = greeter;
    }
    
    public void execute() {
        System.out.println(greeter.sayHello());        
    }
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        GreetMeBean bean = (GreetMeBean) context.getBean("greetMeBean");
        bean.execute();
    }
}
````

Запуск:

````shell
$ mvn compile exec:java -Dexec.mainClass=camelinaction.GreetMeBean
````
