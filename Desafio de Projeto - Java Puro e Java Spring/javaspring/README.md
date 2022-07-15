# Explorando Padrões de Projetos na Prática com Java Puro

Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". Especificamente, este projeto explorou 3 padrões usando Java Spring. 

Padrões de projeto são soluções consolidadas para problemas recorrentes no desenvolvimento e manutenção de software orientado a objeto. O livro "Desing Patterns: Elements of Reusable Object-Oriented Software" (1995) é a principal referência sobre o tema, a qual tornou os autores, Gamma, Helm, Johnson e Vlissides conhecidos como "Gang of Four" ou Gof.

São comumente classificados nas seguintes categorias:

    Padrões Criacionais: Abstract Factory, Builder, Factory Method, Prototype, Singleton.

    Padrões Comportamentais: Chain of Responsability, Iterator, Observer, Strategy, Template Method.

    Padrões Estruturais: Adapter, Brigde, Composite, Decorator, Facade, Flyweight, Proxy.


## Explorando Alguns Padrões de Projetos com Spring:

Singleton: @Bean e @Autowired;

Strategy: @Service e @Repository;

Facade: será construído uma API REST com o mesmo objetivo desse padrão, abstrair a complexidade das seguintes integrações - Spring Data JPA e ViaCEP(Feign).

Obs: Em memória (Usando o H2)